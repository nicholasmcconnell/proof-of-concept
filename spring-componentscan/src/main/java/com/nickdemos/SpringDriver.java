package com.nickdemos;

import com.nickdemos.config.AppConfig;
import com.nickdemos.models.Coach;
import com.nickdemos.models.FootballCoach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDriver {

    public static void main(String[] args) {

        System.out.println("Creating bean container...");

        try (AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class)) {

            System.out.println("Bean container created!");

            // Retrieve a bean from the container with the name "baseballCoach"
            Coach coach = container.getBean("baseballCoach", Coach.class);
//
//            // Call some methods on the retrieved bean to ensure it is configured properly
            System.out.println(coach.getDailyWorkout());
            System.out.println(coach.getMotivation());
//
//            //-------------------------------------------------------------
//
//            // Attempt to get an assistant coach
            Coach assistantCoach = container.getBean("baseballCoach", Coach.class);
            System.out.println(coach == assistantCoach);
//
//            //--------------------------------------------------------------
//
            FootballCoach footballCoach = container.getBean("footballCoach", FootballCoach.class);
            System.out.println(footballCoach.getDailyWorkout());
            System.out.println(footballCoach.getMotivation());
            System.out.println(footballCoach.getEmail());
            System.out.println(footballCoach.getTeamName());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
