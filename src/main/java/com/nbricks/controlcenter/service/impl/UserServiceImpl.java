package com.nbricks.controlcenter.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nbricks.controlcenter.entity.UserInfo;
import com.nbricks.controlcenter.exception.DuplicateUserIdException;
import com.nbricks.controlcenter.models.SignUpRequest;
import com.nbricks.controlcenter.repo.UserRepository;
import com.nbricks.controlcenter.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    @Override
    public UserInfo save(SignUpRequest signUpRequest) {
        UserInfo userInfo = createUserInfo(signUpRequest);
        userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));

        if (userRepository.existsById(userInfo.getId())) {
            throw new DuplicateUserIdException("Signup failed for duplicate userID", userInfo.getId());
        }

        userRepository.save(userInfo);

        return userInfo;
    }

    private UserInfo createUserInfo(SignUpRequest signUpRequest) {
        return new ObjectMapper().convertValue(signUpRequest, UserInfo.class);
    }
}
