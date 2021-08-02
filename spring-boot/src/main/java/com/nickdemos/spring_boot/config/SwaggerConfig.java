package com.nickdemos.spring_boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                //changing .basepackage to .any will display all routes, yours and springboot apis
                .apis(RequestHandlerSelectors.basePackage("com.nickdemos.spring_boot.controllers"))
                .paths(PathSelectors.any())
                .build();
    }
}
