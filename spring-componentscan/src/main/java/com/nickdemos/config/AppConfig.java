package com.nickdemos.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.nickdemos")
@PropertySource("classpath:app.properties")
public class AppConfig {
}
