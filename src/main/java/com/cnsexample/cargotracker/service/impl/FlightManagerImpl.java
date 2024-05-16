package com.cnsexample.cargotracker.service.impl;

import com.cnsexample.cargotracker.bean.Flight;
import com.cnsexample.cargotracker.service.FlightManager;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FlightManagerImpl implements FlightManager {

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Flight createProfile (Flight flight) {
        return null;
    }

    @Override
    public List<Flight> getProfiles () {
        return null;
    }
}
