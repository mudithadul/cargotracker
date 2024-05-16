package com.cnsexample.cargotracker.service.impl;

import com.cnsexample.cargotracker.bean.Cargo;
import com.cnsexample.cargotracker.bean.CargoStatus;
import com.cnsexample.cargotracker.service.CargoManager;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CargoManagerImpl implements CargoManager {

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Cargo createCargo (Cargo cargo) {
        return null;
    }

    @Override
    public List<Cargo> getCargoes () {
        return null;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateStatus (Long cargoId, CargoStatus cargoStatus) {

    }
}
