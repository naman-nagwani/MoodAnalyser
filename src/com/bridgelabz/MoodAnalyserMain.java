package com.bridgelabz;

import java.util.Scanner;

public class MoodAnalyserMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MoodAnalyser mood = new MoodAnalyser();
        System.out.println("Enter your message");
        String message = scan.nextLine();
        System.out.println(mood.moodAnalyse(message));
    }
}
