package com.bridgelabz;

import java.util.Scanner;

public class MoodAnalyser {
    public String moodAnalyse(String message){

        String words[] = message.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase("sad")) {
                return "SAD";
            }
        }
        return "HAPPY";
    }
}
