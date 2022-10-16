package com.nbricks.controlcenter.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "UserInfo")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserInfo {
    @Id
    private String id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String password;
    @OneToOne(cascade = {CascadeType.ALL})
    private PasswordRecovery passwordRecovery;
    @OneToOne(cascade = {CascadeType.ALL})
    private UserContact contact;
    @OneToOne(cascade = {CascadeType.ALL})
    private UserAddress address;
    private String userClassification;
    private String role;
    @OneToOne(cascade = {CascadeType.ALL})
    private BusinessInfo businessInfo;
}
