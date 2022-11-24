package com.clm.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    // @Autowired
    // public TennisCoach(FortuneService fortuneService) {
    //     this.fortuneService = fortuneService;
    // }

    public TennisCoach() {
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    
    // public void setFortuneService(FortuneService fortuneService) {
    //     System.out.println("Inside setMethod");
    //     this.fortuneService = fortuneService;
    // }


    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

}
