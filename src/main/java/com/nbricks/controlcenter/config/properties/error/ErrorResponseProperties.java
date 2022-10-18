package com.nbricks.controlcenter.config.properties.error;

import lombok.Data;

@Data
public class ErrorResponseProperties {
    private String errorCode;
    private String errorMessage;
    private int httpStatus;
}
