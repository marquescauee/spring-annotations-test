package com.clm.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

    private String[] data = {"Beware of the wolf", "Diligence is the mother", "The jjourney is the reward"};

    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        
        return data[myRandom.nextInt(data.length)];
    }
    
}
