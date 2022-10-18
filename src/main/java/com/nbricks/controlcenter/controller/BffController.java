package com.nbricks.controlcenter.controller;

import com.nbricks.controlcenter.config.properties.DropDownProperties;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class BffController {
    private DropDownProperties dropDownProperties;

    @GetMapping("/dropdown")
    public ResponseEntity<Object> getDrownDownFields(@RequestParam String page) {
        Object response = dropDownProperties.getDropDown().get(page);
        return ResponseEntity.ok(response);
    }
}
