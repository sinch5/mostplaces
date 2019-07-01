package com.apiadapter.googleplacedetails.googleplacedetails.services;

import com.apiadapter.googleplacedetails.googleplacedetails.entities.PlaceDetails;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.text.MessageFormat;

@Service
public class PlaceDetailsServiceImpl implements PlaceDetailsService {

    private final WebClient webClient;
    private final String placeDetailsUrl;
    private String key;

    public PlaceDetailsServiceImpl(WebClient webClient, @Value("${placeDetails.url}") String placeDetailsUrl, @Value("${googlemaps.api.key}") String key) {
        this.webClient = webClient;
        this.placeDetailsUrl = placeDetailsUrl;
        this.key = key;
    }

    @Override
    public Mono<PlaceDetails> findByPlaceId(String placeId) {
        return webClient.get()
                .uri(MessageFormat.format("{0}?placeid={1}&key={2}&fields=photos,formatted_address,name,place_id,rating,opening_hours,geometry", placeDetailsUrl, placeId, key))
                .exchange().
                        flatMap(clientResponse -> clientResponse.bodyToMono(PlaceDetails.class));
    }
}
