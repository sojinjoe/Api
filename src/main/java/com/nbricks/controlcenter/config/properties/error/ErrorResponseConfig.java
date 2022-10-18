package com.nbricks.controlcenter.config.properties.error;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "error")
@Data
public class ErrorResponseConfig {
    private Map<String, ErrorResponseProperties> responses;

}
