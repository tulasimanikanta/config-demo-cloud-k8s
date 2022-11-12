package com.example.configdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.example.configdemo.config.FeatureFlags;

@SpringBootApplication
@EnableConfigurationProperties
@EnableScheduling
public class ConfigDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(ConfigDemoApplication.class, args);
  }
}
