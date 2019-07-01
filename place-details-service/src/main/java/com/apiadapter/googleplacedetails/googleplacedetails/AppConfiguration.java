package com.apiadapter.googleplacedetails.googleplacedetails;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class AppConfiguration {

    @Value("${base.googlemaps.url}")
    private String routes;

    @Value("${placeDetails.url}")
    private String placeDetailsUrl;

    @Value("${googlemaps.api.key}")
    private String googlemapsApiKey;

    @Bean
    public WebClient getWebClient() {
        return  WebClient.create(routes);
    }

}
