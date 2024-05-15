package com.cnsexample.cargotracker.common;

public class ErrorInfo {

   // @Schema(example = "80000")
    private String code;

   // @Schema(example = "Unexpected error occurred")
    private String description;

    public ErrorInfo(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public ErrorInfo() {

    }

    public String getCode () {
        return code;
    }

    public void setCode (String code) {
        this.code = code;
    }

    public String getDescription () {
        return description;
    }

    public void setDescription (String description) {
        this.description = description;
    }
}
