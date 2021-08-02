package com.nickdemos.models;

import com.nickdemos.services.MotivationService;

public class BaseballCoach implements Coach {

   private MotivationService motivationService;

    public BaseballCoach(MotivationService motivationService){this.motivationService = motivationService;}

    @Override
    public String getDailyWorkout(){return "run your ass of";}

    @Override
    public String getMotivation(){return " the bbal coach says: "+ motivationService.getMotivation();}
}
