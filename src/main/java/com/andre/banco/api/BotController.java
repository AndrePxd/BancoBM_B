package com.andre.banco.api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BotController {
  @GetMapping("/bot/help")
  public String health() { return "OK"; }
}