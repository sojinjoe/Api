package com.nbricks.controlcenter.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;

@Configuration
@ConfigurationProperties("bff")
@Data
public class DropDownProperties {
    private Map<String, Map<String, List<Map<String,String>>>> dropDown;
}
