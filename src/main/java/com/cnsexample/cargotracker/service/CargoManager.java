package com.cnsexample.cargotracker.service;

import com.cnsexample.cargotracker.bean.CargoProfile;
import java.util.List;

public interface CargoManager {

    /**
     * Create CargoProfile with given properties
     *
     * @param cargoProfile {@link CargoProfile}
     * @return {@link CargoProfile}
     */
    CargoProfile createCargo (CargoProfile cargoProfile);

    /**
     * Get CargoProfiles
     *
     * @return {@link List<CargoProfile>}
     */
    List<CargoProfile> getCargoes ();
}
