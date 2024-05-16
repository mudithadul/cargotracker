package com.cnsexample.cargotracker.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.math.BigDecimal;
import lombok.Data;

@Data
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Cargo {
    private String cargoNumber;
    private BigDecimal weight;
    private CargoStatus status;
    private String consignmentNumber;
}
