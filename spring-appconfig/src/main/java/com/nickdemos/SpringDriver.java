package com.nickdemos;

import com.nickdemos.config.AppConfig;
import com.nickdemos.models.BaseballCoach;
import com.nickdemos.models.Coach;
import com.nickdemos.models.FootballCoach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.plaf.IconUIResource;

public class SpringDriver {

    public static void main(String[] args) {

        System.out.println("creating bean container...");

        try (AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class)) {

            System.out.println("bean container created");

            Coach baseballCoach = container.getBean("baseballCoach", Coach.class);

            System.out.println(baseballCoach.getDailyWorkout());
            System.out.println(baseballCoach.getMotivation());

            //assistant
            Coach assistant = container.getBean("baseballCoach", Coach.class);
            System.out.println(baseballCoach==assistant);

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
