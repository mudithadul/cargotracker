package com.cnsexample.cargotracker.service;

import com.cnsexample.cargotracker.bean.Cargo;
import java.util.List;

public interface CargoManager {

    /**
     * Create CargoProfile with given properties
     *
     * @param cargo {@link Cargo}
     * @return {@link Cargo}
     */
    Cargo createCargo (Cargo cargo);

    /**
     * Get CargoProfiles
     *
     * @return {@link List< Cargo >}
     */
    List<Cargo> getCargoes ();
}
