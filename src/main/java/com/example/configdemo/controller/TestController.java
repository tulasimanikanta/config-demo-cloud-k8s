package com.example.configdemo.controller;

import java.awt.desktop.SystemEventListener;
import java.util.Optional;

import com.example.configdemo.config.FeatureFlags;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {

  private final FeatureFlags properties;

  @Autowired
  public TestController(FeatureFlags properties) {
    this.properties = properties;
  }

  @GetMapping("/hello")
  public String hello() {
    Optional.ofNullable(properties.getFeatureFlags()).ifPresent(System.out::println);
    return "Sample Project";
  }

  @Scheduled(fixedDelay = 5000)
  public void printConfig() {
    log.info("feature flags : start");
    Optional.ofNullable(properties.getFeatureFlags())
            .ifPresent(System.out::println);
    log.info("feature flags : end");
  }
}

