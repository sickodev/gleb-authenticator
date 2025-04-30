package com.gleb.glebauthenticator.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/error")
public class ErrorController {
    private final ErrorService errorService;

    public ErrorController(ErrorService errorService) {
        this.errorService = errorService;
    }

    @GetMapping
    public ResponseEntity<String> error() {
        return new ResponseEntity<>(errorService.getError(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
