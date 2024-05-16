package com.cnsexample.cargotracker.controller;

import com.cnsexample.cargotracker.bean.Flight;
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
    public Flight createFlightProfile (@RequestBody Flight flight) {
        return flightManager.createProfile (flight);
    }

    @GetMapping
    public List<Flight> getFlightProfiles () {
        return  flightManager.getProfiles();
    }

}
