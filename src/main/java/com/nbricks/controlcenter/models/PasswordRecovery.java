package com.nbricks.controlcenter.models;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class PasswordRecovery {
    @NotEmpty
    private String hintQuestion;
    @NotEmpty
    private String hintAnswer;
}
