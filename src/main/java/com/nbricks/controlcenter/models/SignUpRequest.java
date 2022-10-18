package com.nbricks.controlcenter.models;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Data
public class SignUpRequest {
    @NotEmpty
    private String firstName;
    @NotEmpty
    private String middleName;
    @NotEmpty
    private String lastName;
    @Pattern(regexp = "^\\w{8,20}$")
    private String id;
    @NotEmpty
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,20}$")
    private String password;
    private PasswordRecovery passwordRecovery;
    private UserContact contact;
    private UserAddress address;
    @NotEmpty
    private String userClassification;
    @NotEmpty
    private String role;
    private BusinessInfo businessInfo;
}
