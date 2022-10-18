package com.nbricks.controlcenter.models;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class UserAddress {
    private String streetAddress;
    @NotEmpty
    private String city;
    @NotEmpty
    private String state;
    @NotEmpty
    private String postalCode;
    @NotEmpty
    private String country;
    private String infraStructureType;
}
