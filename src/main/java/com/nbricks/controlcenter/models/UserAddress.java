package com.nbricks.controlcenter.models;

import lombok.Data;

@Data
public class UserAddress {
    private String streetAddress;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    private String infraStructureType;
}
