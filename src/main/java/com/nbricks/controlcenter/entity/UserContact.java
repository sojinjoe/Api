package com.nbricks.controlcenter.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Table
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserContact {
    @Id
    @GeneratedValue
    private UUID id;
    private String homePhone;
    private String mobilePhone;
    private String email;
    @OneToOne(mappedBy = "contact")
    private UserInfo userInfo;
}
