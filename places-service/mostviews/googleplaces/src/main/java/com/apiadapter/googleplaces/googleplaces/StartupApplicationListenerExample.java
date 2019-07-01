package com.apiadapter.googleplaces.googleplaces;

import com.apiadapter.googleplaces.googleplaces.entities.PlaceResponse;
import com.apiadapter.googleplaces.googleplaces.services.PlaceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class StartupApplicationListenerExample implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private PlaceServiceImpl placeService;


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
       PlaceResponse placeResponse = placeService.findByName("Burj Khalifa").block();
    }
}
