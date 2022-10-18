package com.nbricks.controlcenter.exception;

import lombok.Getter;

@Getter
public class DuplicateUserIdException extends RuntimeException {
    private final String duplicateUserId;

    public DuplicateUserIdException(String message, String duplicateUserId) {
        super(message);
        this.duplicateUserId = duplicateUserId;
    }
}
