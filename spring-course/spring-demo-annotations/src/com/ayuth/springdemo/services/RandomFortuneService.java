package com.ayuth.springdemo.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    // create array of strings
//    private String[] data = {
//            "Beware of the wolf in the sheep's clothing",
//            "Diligence is the mother of good luck",
//            "The journey is the reward"
//    };

    @Value("${randomfortuneservice.data}")
    private String[] data;

    // create a random number
    private Random random = new Random();

    @Override
    public String getFortune() {
        // pick a random string from the array
        int index = random.nextInt(data.length);
        String fortune = data[index];
        return fortune;
    }
}
