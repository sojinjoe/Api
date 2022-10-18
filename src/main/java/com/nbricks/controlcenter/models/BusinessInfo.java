package com.nbricks.controlcenter.models;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class BusinessInfo {
    @NotEmpty
    private String nameOfBusiness;
    @NotEmpty
    private String businessStructure;
}
