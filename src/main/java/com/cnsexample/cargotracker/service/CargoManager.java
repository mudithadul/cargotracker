package com.cnsexample.cargotracker.service;

import com.cnsexample.cargotracker.bean.Cargo;
import com.cnsexample.cargotracker.bean.CargoStatus;
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

    /**
     * Updating the Cargo status which uniquely identify by cargoId
     *
     * @param cargoId - primary id of cargo profile
     * @param cargoStatus = {@link CargoStatus}
     */
    void updateStatus (Long cargoId, CargoStatus cargoStatus);
}
