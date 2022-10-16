package com.nbricks.controlcenter.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserAddress {
    @Id
    @GeneratedValue
    private UUID id;
    private String streetAddress;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    private String infraStructureType;
    @OneToOne(mappedBy = "address")
    private UserInfo userInfo;
}
