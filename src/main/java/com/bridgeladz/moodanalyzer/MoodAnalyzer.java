package com.bridgeladz.moodanalyzer;

/****************************************************************************************
 * @author Pavani
 *
 * This class has all the methods that defines the project.
 * This class methods returns sad or happy expression according to the methods conditions.
 * Specifying customs exceptions for uncertain inputs.
 ****************************************************************************************/

public class MoodAnalyzer {
    public String userMessage;

    //non parameterized constructor
    public MoodAnalyzer() {
        super();
    }

    //parameterized constructor
    public MoodAnalyzer(String userMessage) {
        super();
        this.userMessage = userMessage;
    }

    /**
     * Name : analyzeMood
     *
     * Description : This method calls parameterized analyseMood() method.
     */
    public String analyzeMood() {
        return analyzeMood(userMessage);
    }

    /**
     * Name : analyzeMood
     *
     * Description : Analyzing mood happy or sad.
     *
     * @param userMessage //user given message.
     * @return //happy or sad.
     *
     * Algorithm : If user given message has happy or sad written in it.
     * then returning the respective matching string i.e., either happy or sad.
     */
    public String analyzeMood(String userMessage) throws MoodAnalysisException {
            try {
                if (userMessage.length() == 0) {
                    throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.GIVEN_EMPTY, "Message can not be empty.");
                }
                if (userMessage.contains("sad")) {
                    return "sad";
                } else {
                    return "happy";
                }
            }
            catch (NullPointerException e) {
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.GIVEN_EMPTY, "Message can not be null.");
            }
    }
}