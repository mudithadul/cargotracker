package com.cnsexample.cargotracker.controller;

import com.cnsexample.cargotracker.common.ErrorInfo;
import com.cnsexample.cargotracker.exception.CargoTrackerBadParamException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class ControllerExceptionHandler {

    @ExceptionHandler(value = CargoTrackerBadParamException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ErrorInfo> handleCargoTrackerBadParamException (CargoTrackerBadParamException e) {
        ErrorInfo errorInfo =  new ErrorInfo (e.getErrorCode (), e.getMessage ());
        return new ResponseEntity<> (errorInfo, HttpStatus.BAD_REQUEST);
    }

}
