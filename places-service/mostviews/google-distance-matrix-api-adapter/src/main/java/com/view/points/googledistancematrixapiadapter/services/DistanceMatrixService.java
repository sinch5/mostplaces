package com.view.points.googledistancematrixapiadapter.services;

import com.view.points.googledistancematrixapiadapter.googlemapsentities.DistanceMatrixResponse;
import reactor.core.publisher.Mono;

public interface DistanceMatrixService {
    Mono<DistanceMatrixResponse> buildMatrix(String places);
}
