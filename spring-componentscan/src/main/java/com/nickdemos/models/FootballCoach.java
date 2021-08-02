package com.nickdemos.models;

import com.nickdemos.services.MotivationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class FootballCoach implements Coach{

    @Value("${coach-email}")
    private String email;

    @Value("the winners")
    private String teamName;

    private MotivationService motivationService;

    public FootballCoach(){
        System.out.println("fball coach no args constructore invoelked");
    }

    public String getEmail(){return email;}

    public void setemail(String email){this.email = email;}

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Autowired
    public void setMotivationService(MotivationService motivationService){
        this.motivationService = motivationService;
    }

    @PostConstruct
    public void customInit(){
        System.out.println("fball custom init invoked");
    }

    @PreDestroy
    public void customDestroy(){
        System.out.println("fball custome destrom initiliaed");
    }

    @Override
    public String getDailyWorkout(){
        return("football workout");
    }

    @Override
    public String getMotivation(){
        return "football motivation";
    }
}
