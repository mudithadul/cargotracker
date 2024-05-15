package com.cnsexample.cargotracker.exception;

import org.springframework.http.HttpStatus;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class CargoTrackerBadParamException extends RuntimeException{

    private final String errorCode;
    private final HttpStatus httpStatusCode;

    private CargoTrackerBadParamException (HttpStatus httpStatusCode, String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
        this.httpStatusCode = httpStatusCode;
    }

    private CargoTrackerBadParamException (HttpStatus httpStatusCode, String errorCode, Throwable throwable) {
        super(throwable);
        this.errorCode = errorCode;
        this.httpStatusCode = httpStatusCode;
    }


    public String getErrorCode() {
        return this.errorCode;
    }

    public HttpStatus getHttpStatusCode() {
        return this.httpStatusCode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
            .append("errorCode", errorCode)
            .append("httpStatusCode", httpStatusCode)
            .toString();
    }

}
