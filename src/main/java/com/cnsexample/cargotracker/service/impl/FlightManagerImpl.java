package com.cnsexample.cargotracker.service.impl;

import com.cnsexample.cargotracker.bean.FlightProfile;
import com.cnsexample.cargotracker.service.FlightManager;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FlightManagerImpl implements FlightManager {

    @Override
    @Transactional(rollbackFor = Exception.class)
    public FlightProfile createProfile (FlightProfile flightProfile) {
        return null;
    }

    @Override
    public List<FlightProfile> getProfiles () {
        return null;
    }
}
