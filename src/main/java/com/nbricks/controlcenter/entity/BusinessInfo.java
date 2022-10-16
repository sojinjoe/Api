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
public class BusinessInfo {
    @Id
    @GeneratedValue
    private UUID id;
    private String nameOfBusiness;
    private String businessStructure;
    @OneToOne(mappedBy = "businessInfo")
    private UserInfo userInfo;
}
