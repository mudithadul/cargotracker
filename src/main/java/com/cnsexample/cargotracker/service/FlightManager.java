package com.cnsexample.cargotracker.service;


import com.cnsexample.cargotracker.bean.FlightProfile;
import java.util.List;

public interface FlightManager {

    /**
     * Create a Flight Profile with given flight details
     *
     * @param flightProfile {@link FlightProfile}
     * @return
     */
    FlightProfile createProfile (FlightProfile flightProfile);

    /**
     * Get the currently available list of Flight profiles
     *
     * @return List of {@link FlightProfile}
     */
    List<FlightProfile> getProfiles ();
}
