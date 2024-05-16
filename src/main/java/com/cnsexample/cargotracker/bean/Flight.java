package com.cnsexample.cargotracker.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.time.LocalDate;
import java.time.LocalTime;
import lombok.Data;

@Data
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Flight {
    private String flightNumber;
    private LocalDate localDate;
    private LocalTime localTime;
    private String locationCodeEntry;
    private FlightStatus flightStatus;
}
