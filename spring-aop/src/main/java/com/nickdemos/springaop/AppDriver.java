package com.nickdemos.springaop;

import com.nickdemos.springaop.config.AppConfig;
import com.nickdemos.springaop.models.FootballCoach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppDriver {

    public static void main (String[] args){

        try(AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class)){

            FootballCoach footballCoach = container.getBean("footballCoach", FootballCoach.class);
            System.out.println(footballCoach.getDailyWorkout());
            System.out.println(footballCoach.getMotivation());
            System.out.println(footballCoach.getEmail());
            System.out.println(footballCoach.getTeamName());
            footballCoach.setEmail("newemal@gmail.com");
            try{
                footballCoach.setTeamName("The Java Beans");

            }catch(Exception e){

            }

        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
