package com.view.points.googledistancematrixapiadapter.controller;

import com.view.points.googledistancematrixapiadapter.googlemapsentities.DistanceMatrixResponse;
import com.view.points.googledistancematrixapiadapter.services.DistanceMatrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class DistanceMatrixController {

    @Autowired
    final private DistanceMatrixService distanceMatrixService;

    public DistanceMatrixController(DistanceMatrixService distanceMatrixService) {
        this.distanceMatrixService = distanceMatrixService;
    }

    @GetMapping("/routes/{places}")
    @ResponseBody  public Mono<DistanceMatrixResponse> buildMatrix(@PathVariable  String places) {
        return distanceMatrixService.buildMatrix(places);
    }
}
