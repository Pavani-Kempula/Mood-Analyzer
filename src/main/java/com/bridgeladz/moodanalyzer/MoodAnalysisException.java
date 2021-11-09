package com.bridgeladz.moodanalyzer;

/**
 * @author Pavani
 *
 * This class represent custom exception.
 */

public class MoodAnalysisException extends RuntimeException {
    public enum ExceptionType {
        GIVEN_NULL, GIVEN_EMPTY
    }

    public ExceptionType type;
    public MoodAnalysisException(ExceptionType givenEmpty, String message) {
        super(message);
    }
}
