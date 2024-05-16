package com.cnsexample.cargotracker.controller;

import com.cnsexample.cargotracker.bean.Cargo;
import com.cnsexample.cargotracker.bean.CargoStatus;
import com.cnsexample.cargotracker.service.CargoManager;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/cargoes")
public class CargoController {

    private final CargoManager cargoManager;

    public CargoController (CargoManager cargoManager) {
        this.cargoManager = cargoManager;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cargo createCargo (@RequestBody Cargo cargo) {
        return cargoManager.createCargo (cargo);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Cargo> getCargoes () {
        return cargoManager.getCargoes();
    }

    @PutMapping("{cargoId}/status")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateStatus(@PathVariable Long cargoId , @RequestBody CargoStatus cargoStatus) {
        cargoManager.updateStatus(cargoId, cargoStatus);
    }


}
