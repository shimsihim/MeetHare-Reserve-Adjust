package com.yeoksam_station_exit_1.meetharereserveadjust.global;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**")
        .allowedOriginPatterns("*")
        .allowedMethods("GET", "POST", "PUT", "DELETE")
        // .allowedHeaders("Authorization", "Content-Type")
        .allowedHeaders("*")
        .exposedHeaders("Custom-Header")
        .allowCredentials(true)
        .maxAge(3600);
  }
}
