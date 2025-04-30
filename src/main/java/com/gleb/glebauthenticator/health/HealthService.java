package com.gleb.glebauthenticator.health;

import org.springframework.stereotype.Service;

@Service
public class HealthService {
    public String healthCheck() {
        return "API is up and running";
    }
}
