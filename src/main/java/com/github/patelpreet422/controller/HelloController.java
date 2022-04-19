package com.github.patelpreet422.controller;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@SecurityRequirement(name = "Basic")
public class HelloController {
  @GetMapping("/")
  String hello() {
    return "Hello from protected endpoint.";
  }
}
