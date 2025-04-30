package com.gleb.glebauthenticator.health;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/health")
public class HealthController {
    private final HealthService healthService;
    public HealthController(HealthService healthService) {
        this.healthService = healthService;
    }

    @GetMapping
    public ResponseEntity<String> health() {
        return ResponseEntity.ok(healthService.healthCheck());
    }
}
