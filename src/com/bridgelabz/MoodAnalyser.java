package com.bridgelabz;

public class MoodAnalyser {
    public String message;
    public MoodAnalyser(){
        this.message = "I am Happy";
    }
    public  MoodAnalyser(String message){
        this.message = message;
    }
    public String moodAnalyse(){

        String result = "";
        String[] words = this.message.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase("sad")) {
                result = "SAD";
            } else if (words[i].equalsIgnoreCase("happy")) {
                result = "HAPPY";
            }
        }
        return result;
    }
}