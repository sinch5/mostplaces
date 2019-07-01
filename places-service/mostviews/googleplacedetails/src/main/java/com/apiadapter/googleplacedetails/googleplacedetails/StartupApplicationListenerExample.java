package com.apiadapter.googleplacedetails.googleplacedetails;

import com.apiadapter.googleplacedetails.googleplacedetails.entities.PlaceDetails;
import com.apiadapter.googleplacedetails.googleplacedetails.services.PlaceDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class StartupApplicationListenerExample implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private PlaceDetailsService placeDetailsService;


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
       PlaceDetails placeDetails = placeDetailsService.findByPlaceId("ChIJN1t_tDeuEmsRUsoyG83frY4").block();
       int i = 0;
    }
}
