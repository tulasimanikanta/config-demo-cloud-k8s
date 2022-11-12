package com.example.configdemo.config;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties
@RefreshScope
public class FeatureFlags {
  private Map<String, Boolean> featureFlags;

  public FeatureFlags() {
  }

  public Map<String, Boolean> getFeatureFlags() {
    return featureFlags;
  }

  public void setFeatureFlags(Map<String, Boolean> featureFlags) {
    this.featureFlags = featureFlags;
  }
}
