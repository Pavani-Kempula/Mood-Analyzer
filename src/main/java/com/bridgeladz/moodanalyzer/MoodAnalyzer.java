package com.bridgeladz.moodanalyzer;

/****************************************************************************************
 * @author Pavani
 *
 * This class has all the methods that defines the project.
 * This class methods returns sad or happy expression according to the methods conditions.
 * Specifying customs exceptions for uncertain inputs.
 ****************************************************************************************/

public class MoodAnalyzer {
    /**
     * Name : analyzeMood
     *
     * Description : Analyzing mood happy or sad.
     *
     * @param userMessage //user given message.
     * @return //happy or sad.
     *
     * Algorithm : If user given message has happy or sad written in it.
     * then returning the respective matching string i.e.,either happy or sad.
     */
    public String analyzeMood(String userMessage) {
        if(userMessage.contains("sad")) {
            return "sad";
        }
        else {
            return "happy";
        }
    }
}