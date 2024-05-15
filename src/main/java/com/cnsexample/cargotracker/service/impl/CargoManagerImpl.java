package com.cnsexample.cargotracker.service.impl;

import com.cnsexample.cargotracker.bean.CargoProfile;
import com.cnsexample.cargotracker.service.CargoManager;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CargoManagerImpl implements CargoManager {

    @Override
    public CargoProfile createCargo (CargoProfile cargoProfile) {
        return null;
    }

    @Override
    public List<CargoProfile> getCargoes () {
        return null;
    }
}
