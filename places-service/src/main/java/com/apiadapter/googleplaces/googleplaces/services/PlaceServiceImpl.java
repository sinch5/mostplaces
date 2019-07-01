package com.apiadapter.googleplaces.googleplaces.services;

import com.apiadapter.googleplaces.googleplaces.entities.PlaceResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.text.MessageFormat;


@Service
public class PlaceServiceImpl implements PlaceService {

    private final WebClient webClient;
    private final String placeUrl;
    private String key;

    public PlaceServiceImpl(WebClient webClient, @Value("${places.url}") String placeUrl, @Value("${googlemaps.api.key}") String key) {
        this.webClient = webClient;
        this.placeUrl = placeUrl;
        this.key = key;
    }

    public Mono<PlaceResponse> findByName(String name) {
        return webClient.get()
                .uri(MessageFormat.format("{0}?input={1}&key={2}&departure_time=now&inputtype=textquery&fields=photos,formatted_address,name,place_id,rating,opening_hours,geometry", placeUrl, name, key))
                .exchange().
                        flatMap(clientResponse -> clientResponse.bodyToMono(PlaceResponse.class));
    }
}
