package com.nbricks.controlcenter.exception.handlers;

import com.nbricks.controlcenter.config.properties.error.ErrorResponseConfig;
import com.nbricks.controlcenter.config.properties.error.ErrorResponseProperties;
import com.nbricks.controlcenter.exception.DuplicateUserIdException;
import com.nbricks.controlcenter.exception.response.ErrorResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static java.lang.String.format;

@RestControllerAdvice
@AllArgsConstructor
public class GlobalExceptionHandler {
    private ErrorResponseConfig errorResponseConfig;

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
        ErrorResponseProperties errorResponseProperties = errorResponseConfig
                .getResponses()
                .get("method-argument-failed");

        ErrorResponse errorResponse = ErrorResponse
                .builder()
                .errorCode(errorResponseProperties.getErrorCode())
                .errorMessage(ex.getFieldError().getField() + " " + ex.getFieldError().getDefaultMessage())
                .build();

        return ResponseEntity
                .status(errorResponseProperties.getHttpStatus())
                .body(errorResponse);
    }

    @ExceptionHandler(DuplicateUserIdException.class)
    public ResponseEntity<ErrorResponse> handleDuplicateUserIdException(DuplicateUserIdException ex) {
        ErrorResponseProperties errorResponseProperties = errorResponseConfig
                .getResponses()
                .get("duplicate-userID");

        ErrorResponse errorResponse = ErrorResponse
                .builder()
                .errorCode(errorResponseProperties.getErrorCode())
                .errorMessage(format(errorResponseProperties.getErrorMessage(), ex.getDuplicateUserId()))
                .build();

        return ResponseEntity.status(errorResponseProperties.getHttpStatus()).body(errorResponse);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleException(Exception ex) {
        ErrorResponseProperties errorResponseProperties = errorResponseConfig
                .getResponses()
                .get("server-exception");

        ErrorResponse errorResponse = ErrorResponse
                .builder()
                .errorCode(errorResponseProperties.getErrorCode())
                .errorMessage(errorResponseProperties.getErrorMessage())
                .build();

        return ResponseEntity
                .status(errorResponseProperties.getHttpStatus())
                .body(errorResponse);
    }
}
