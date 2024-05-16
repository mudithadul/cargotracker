package com.cnsexample.cargotracker.controller;

import com.cnsexample.cargotracker.bean.Flight;
import com.cnsexample.cargotracker.bean.FlightStatus;
import com.cnsexample.cargotracker.service.FlightManager;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/flights")
public class FlightController {

    private final FlightManager flightManager;

    public FlightController(FlightManager flightManager) {
        this.flightManager = flightManager;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Flight createFlightProfile (@RequestBody Flight flight) {
        return flightManager.createFlight (flight);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Flight> getFlightProfiles () {
        return  flightManager.getFlights ();
    }

    @PutMapping("/{flightId}/status")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateStatus(@PathVariable Long flightId, @RequestBody FlightStatus flightStatus) {
        flightManager.updateStatus (flightId, flightStatus);
    }



}
