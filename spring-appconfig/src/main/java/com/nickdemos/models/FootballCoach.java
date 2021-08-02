package com.nickdemos.models;

import com.nickdemos.services.MotivationService;

public class FootballCoach implements Coach{

    private String email;
    private String teamName;
    private MotivationService motivationService;

    public FootballCoach(){
        System.out.println("fball coach public no args consgtructore invoiked");
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
        this.teamName = teamName;
    }

    public void setMotivationService(MotivationService motivationService){
        this.motivationService = motivationService;
    }


    public void customInit(){
        System.out.println("FootballCoach.customInit() invoked");
    }

    public void customDestroy(){
        System.out.println("FootballCoach.customDestroy invoked");
    }

    @Override
    public String getDailyWorkout() {
        return "walk your meet";
    }

    @Override
    public String getMotivation() {
        return "you can do it";
    }
}
