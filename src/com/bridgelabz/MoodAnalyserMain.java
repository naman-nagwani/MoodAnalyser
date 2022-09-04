package com.bridgelabz;

import java.util.Scanner;

public class MoodAnalyserMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your message");
        String message = scan.nextLine();
        MoodAnalyser mood = new MoodAnalyser(message);
        System.out.println(mood.moodAnalyse());
    }
}
