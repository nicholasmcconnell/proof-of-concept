package com.nickdemos.config;

import com.nickdemos.models.BaseballCoach;
import com.nickdemos.models.FootballCoach;
import com.nickdemos.services.MotivationService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:app.properties")
public class AppConfig {

    @Value("${email}")
    private String email;

    @Bean
    @Scope("singleton")
    public BaseballCoach baseballCoach(){return new BaseballCoach(motivationService());}

    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    public FootballCoach footballCoach(){
        FootballCoach footballCoach = new FootballCoach();
        footballCoach.setMotivationService(motivationService());
        footballCoach.setTeamName("harry's heroin");
        footballCoach.setEmail(email);
        return footballCoach;
    }

    @Bean(name = "motivationService")
    public MotivationService motivationService(){ return new MotivationService();}

}
