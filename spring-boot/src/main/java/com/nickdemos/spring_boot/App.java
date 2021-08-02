package com.nickdemos.spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // implies: @configuration, @compontentScan, @enableAutoConfigurartion
public class App {

    public static void main(String[] args){ SpringApplication.run(App.class, args);}
}
