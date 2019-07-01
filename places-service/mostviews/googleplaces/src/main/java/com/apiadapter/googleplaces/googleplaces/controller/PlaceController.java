package com.apiadapter.googleplaces.googleplaces.controller;

import com.apiadapter.googleplaces.googleplaces.entities.PlaceResponse;
import com.apiadapter.googleplaces.googleplaces.services.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class PlaceController {

    @Autowired
    private PlaceService placeService;

    @GetMapping("/place/{name}")
    @ResponseBody public Mono<PlaceResponse> getPlaceByName(@PathVariable String name) {
        return placeService.findByName(name);
    }
}
