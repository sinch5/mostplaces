package com.view.points.googledistancematrixapiadapter.services;

import com.view.points.googledistancematrixapiadapter.googlemapsentities.DistanceMatrixResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.text.MessageFormat;
import java.util.List;
import java.util.function.BinaryOperator;

@Service
public class DistanceMatrixServiceImpl implements DistanceMatrixService {

    private final WebClient webClient;
    private final String directMatrixUrl;
    private String key;
    private BinaryOperator<String> binaryOperator = (s1, s2)-> s1 + "|" + s2;

    public DistanceMatrixServiceImpl(WebClient webClient, @Value("${distance.matrix.url}") String directMatrixUrl, @Value("${googlemaps.api.key}") String key) {
        this.webClient = webClient;
        this.directMatrixUrl = directMatrixUrl;
        this.key = key;
    }

    public Mono<DistanceMatrixResponse> buildMatrix(String places) {

        return webClient.get()
                .uri(MessageFormat.format("{0}?origins={1}&destinations={1}&key={2}&departure_time=now", directMatrixUrl, places, key))
                .exchange().
                        flatMap(clientResponse -> clientResponse.bodyToMono(DistanceMatrixResponse.class));
    }
}
