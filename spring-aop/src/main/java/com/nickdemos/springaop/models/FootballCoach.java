package com.nickdemos.springaop.models;

import com.nickdemos.springaop.services.MotivationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class FootballCoach implements Coach {

    @Value("${coach-email}")
    private String email;

    @Value("The Cafebabes")
    private String teamName;

    private MotivationService motivationService;

    public FootballCoach() {
        System.out.println("FootballCoach no-args constructor invoked!");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        throw new RuntimeException("Team name cannot be changed.");
    }

    @Autowired // this is required because we are using setter-based injection
    public void setMotivationService(MotivationService motivationService) {
        this.motivationService = motivationService;
    }

    @PostConstruct
    public void customInit() {
        System.out.println("FootballCoach.customInit() invoked!");
    }

    @PreDestroy
    public void customDestroy() {
        System.out.println("FootballCoach.customDestroy() invoked!");
    }

    @Override
    public String getDailyWorkout() {
        return "Today's workout: Suicide runs to 40, 50, 60, 70, 80, and 100 yard lines";
    }

    @Override
    public String getMotivation() {
        return "The track coach says: " + motivationService.getMotivation();
    }
}
