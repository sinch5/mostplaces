package com.apiadapter.googleplaces.googleplaces.services;

import com.apiadapter.googleplaces.googleplaces.entities.PlaceResponse;
import reactor.core.publisher.Mono;

public interface PlaceService {
    Mono<PlaceResponse> findByName(String name);
}
