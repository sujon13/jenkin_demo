package com.example.jenkin_demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@Slf4j
@RequestMapping("/api")
public class TestController {

    @GetMapping("/test")
    public ResponseEntity<String> test(HttpServletRequest request) {
        log.info("Api Request Param: " + request.getRequestURI());
        log.info("Time: " + new Date());
        return ResponseEntity.ok("Hello Man. I am running on port 9007");
    }
}
