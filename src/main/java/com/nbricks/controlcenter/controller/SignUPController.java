package com.nbricks.controlcenter.controller;

import com.nbricks.controlcenter.entity.UserInfo;
import com.nbricks.controlcenter.models.SignUpRequest;
import com.nbricks.controlcenter.models.SignUpResponse;
import com.nbricks.controlcenter.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@AllArgsConstructor
public class SignUPController {
    private UserService userService;

    @PostMapping("/signup")
    @CrossOrigin(origins = "*")
    ResponseEntity<SignUpResponse> signup(@RequestBody @Valid SignUpRequest signUpRequest) {
        UserInfo userInfo = userService.save(signUpRequest);
        return ResponseEntity
                .status(201)
                .body(SignUpResponse.builder().userId(userInfo.getId()).build());
    }
}
