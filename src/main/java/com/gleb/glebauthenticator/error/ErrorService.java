package com.gleb.glebauthenticator.error;

import org.springframework.stereotype.Service;

@Service
public class ErrorService {
    public String getError() {
        return "API Error";
    }
}
