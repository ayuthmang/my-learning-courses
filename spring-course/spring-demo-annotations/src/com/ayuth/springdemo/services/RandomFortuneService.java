package com.ayuth.springdemo.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

@Component
@Scope("")
public class RandomFortuneService implements FortuneService {

    private String fileName = "randomFortuneData.txt";

    // create array of strings
//    private String[] data = {
//            "Beware of the wolf in the sheep's clothing",
//            "Diligence is the mother of good luck",
//            "The journey is the reward"
//    };

//    @Value("${randomfortuneservice.data}")
//    private String[] data;

    private ArrayList<String> theFortunes;

    @PostConstruct
    public void postConstruct() {
        System.out.println(">> FileFortuneService: inside method loadTheFortunesFile");

        File theFile = new File(fileName);

        System.out.println("Reading fortunes from file: " + theFile);
        System.out.println("File exists: " + theFile.exists());

        // initialize array list
        theFortunes = new ArrayList<>();

        // read fortunes from file
        try (BufferedReader br = new BufferedReader(new FileReader(theFile))) {
            String tempLine;
            while ((tempLine = br.readLine()) != null) {
                theFortunes.add(tempLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // create a random number
    private Random random = new Random();

    @Override
    public String getFortune() {
        // pick a random string from the array
//        int index = random.nextInt(data.length);
//        String fortune = data[index];
        int index = random.nextInt(theFortunes.size());
        String fortune = theFortunes.get(index);
        return fortune;
    }
}
