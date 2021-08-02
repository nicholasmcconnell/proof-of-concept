package com.nickdemos.springaop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.nickdemos.springaop")
@PropertySource("classpath:app.properties")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppConfig {

}
