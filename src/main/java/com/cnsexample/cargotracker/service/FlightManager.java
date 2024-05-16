package com.cnsexample.cargotracker.service;


import com.cnsexample.cargotracker.bean.Flight;
import com.cnsexample.cargotracker.bean.FlightStatus;
import java.util.List;

public interface FlightManager {

    /**
     * Create a Flight Profile with given flight details
     *
     * @param flight {@link Flight}
     * @return
     */
    Flight createProfile (Flight flight);

    /**
     * Get the currently available list of Flight profiles
     *
     * @return List of {@link Flight}
     */
    List<Flight> getProfiles ();

    /**
     * Update the status of Flight with uniquely identify by flightId
     *
     * @param flightId - unique identifier of flight
     * @param flightStatus - {@link FlightStatus}
     */
    void updateStatus (Long flightId, FlightStatus flightStatus);
}
