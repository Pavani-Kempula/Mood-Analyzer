package com.bridgelabz.moodanalyzer;

import com.bridgeladz.moodanalyzer.MoodAnalysisException;
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

    @Test
    public void givenUserMessage_whenInAnyMood_shouldReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        assertEquals("happy",moodAnalyzer.analyzeMood("I am in any mood"));
    }

    @Test
    public void givenUserMessageInConstructor_whenIAmInSadMood_shouldReturnSad() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer("i am in sad mood");
        assertEquals("sad",moodAnalyser.analyzeMood());
    }

    @Test
    public void givenUserMessageInConstructor_whenIAmInHappyMood_shouldReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("i am in happy mood");
        assertEquals("happy",moodAnalyzer.analyzeMood());
    }

    @Test
    public void givenUserMessageInConstructor_whenNull_shouldReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        assertEquals("happy",moodAnalyzer.analyzeMood());
    }

    @Test
    public void givenMessageInConstructor_whenNull_shouldReturnHappy() {
        try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
            assertEquals("happy",moodAnalyzer.analyzeMood());
        }
        catch (MoodAnalysisException e) {
            assertEquals("Message can not be null.",e.getMessage());
        }
    }

    @Test
    public void givenMessageInConstructor_whenEmptyString_shouldReturnHappy() {
        try {
            MoodAnalyzer moodAnalyze = new MoodAnalyzer("");
            assertEquals("happy",moodAnalyze.analyzeMood());
        }
        catch (MoodAnalysisException e) {
            assertEquals(MoodAnalysisException.ExceptionType.GIVEN_EMPTY, e.type);
        }
    }
}
