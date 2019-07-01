package com.apiadapter.googleplacedetails.googleplacedetails.controller;

import com.apiadapter.googleplacedetails.googleplacedetails.entities.PlaceDetails;
import com.apiadapter.googleplacedetails.googleplacedetails.services.PlaceDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class PlaceDetailsController {

    @Autowired
    private PlaceDetailsService placeDetailsService;

    @GetMapping("/place/{id}")
    @ResponseBody Mono<PlaceDetails> findByPlaceId(@PathVariable("id") String placeId) {
        return placeDetailsService.findByPlaceId(placeId);
    }
}
