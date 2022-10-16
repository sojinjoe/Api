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
public class PasswordRecovery {
    @Id
    @GeneratedValue
    private UUID id;
    private String hintQuestion;
    private String hintAnswer;
    @OneToOne(mappedBy = "passwordRecovery")
    private UserInfo userInfo;
}
