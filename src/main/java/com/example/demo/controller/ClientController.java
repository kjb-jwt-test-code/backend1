package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ClientController {

    @GetMapping("/api/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("hello");
    }

//    @GetMapping("/")
//    public ResponseEntity<String> test(@AuthenticationPrincipal JwtUserDetails userDetails) {
//        return ResponseEntity.ok("aaa");
//    }
}
