package com.cnsexample.cargotracker.controller;

import com.cnsexample.cargotracker.bean.FlightProfile;
import com.cnsexample.cargotracker.service.FlightManager;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/flights")
public class FlightController {

    private final FlightManager flightManager;

    public FlightController(FlightManager flightManager) {
        this.flightManager = flightManager;
    }

    @PostMapping
    public FlightProfile createFlightProfile (@RequestBody FlightProfile flightProfile) {
        return flightManager.createProfile(flightProfile);
    }

    @GetMapping
    public List<FlightProfile> getFlightProfiles () {
        return  flightManager.getProfiles();
    }

}
