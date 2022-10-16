package com.nbricks.controlcenter.service;

import com.nbricks.controlcenter.entity.UserInfo;
import com.nbricks.controlcenter.models.SignUpRequest;

public interface UserService {
    UserInfo save(SignUpRequest signUpRequest);
}
