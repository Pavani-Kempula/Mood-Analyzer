package com.bridgelabz.moodanalyzer;

import com.bridgeladz.moodanalyzer.MoodAnalyzer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**************************************************************
 * @author Pavani
 *
 * This class has test cases for all the possible scenarios.
 *************************************************************/

public class MoodAnalyzerTest {
    @Test
    public void givenUserMessage_whenSad_shouldReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        assertEquals("sad",moodAnalyzer.analyzeMood("I am in sad mood"));
    }  //end for first test case.
}
