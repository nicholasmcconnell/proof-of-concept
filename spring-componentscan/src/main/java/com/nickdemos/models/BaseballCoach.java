package com.nickdemos.models;

import com.nickdemos.services.MotivationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("baseballCoach")
//@Scope("prototype")
public class BaseballCoach implements Coach{

    private MotivationService motivationService;

    @Autowired
    public BaseballCoach(MotivationService motivationService){this.motivationService=motivationService;}

    @Override
    public String getDailyWorkout(){return "the workout is...baeball shutup";}

    @Override
    public String getMotivation(){return "the motivation is...baseball really shutup";}

}
