package com.nbricks.controlcenter.models;

import lombok.Data;

@Data
public class SignUpRequest {
    private String firstName;
    private String middleName;
    private String lastName;
    private String id;
    private String password;
    private PasswordRecovery passwordRecovery;
    private UserContact contact;
    private UserAddress address;
    private String userClassification;
    private String role;
    private BusinessInfo businessInfo;
}
