package com.fhl.newflix.rest_apis.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/example")
public class Controller {

    @GetMapping("/hello-newflix-controller")
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("Hello Newflix Controller!");
    }

}
