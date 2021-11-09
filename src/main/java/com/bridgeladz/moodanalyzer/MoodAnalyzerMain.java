package com.bridgeladz.moodanalyzer;

/**************************************************************
 * @author Pavani
 *
 * This is main class for mood analyzer project.
 * From this class we are calling methods of mood analyzer class.
 **************************************************************/

public class MoodAnalyzerMain {
    public static void main(String[] args) {
        MoodAnalyzer moodAnalyserObj = new MoodAnalyzer();
        String userMessage = "Today i am sad";
        System.out.println(moodAnalyserObj.analyzeMood(userMessage));
    }
}
