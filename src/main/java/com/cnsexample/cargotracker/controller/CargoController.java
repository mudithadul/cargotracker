package com.cnsexample.cargotracker.controller;

import com.cnsexample.cargotracker.bean.Cargo;
import com.cnsexample.cargotracker.service.CargoManager;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/cargoes")
public class CargoController {

    private final CargoManager cargoManager;

    public CargoController (CargoManager cargoManager) {
        this.cargoManager = cargoManager;
    }

    @PostMapping
    public Cargo createCargo (@RequestBody Cargo cargo) {
        return cargoManager.createCargo (cargo);
    }

    @GetMapping
    public List<Cargo> getCargoes () {
        return cargoManager.getCargoes();
    }


}
