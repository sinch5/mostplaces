package com.apiadapter.googleplacedetails.googleplacedetails.services;

import com.apiadapter.googleplacedetails.googleplacedetails.entities.PlaceDetails;
import reactor.core.publisher.Mono;

public interface PlaceDetailsService {
    Mono<PlaceDetails> findByPlaceId(String placeId);
}
