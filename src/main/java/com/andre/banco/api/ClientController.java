package com.andre.banco.api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
  @GetMapping("/health")
  public String health() { return "OK"; }
}