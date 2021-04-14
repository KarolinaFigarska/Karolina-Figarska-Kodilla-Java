package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void log() {
        logger = Logger.INSTANCE;
        logger.log("loggingNr1");
    }

    @Test
    void testGetFileName() {
        //Given
        //When
        String lastLog = logger.getLastLog();
        System.out.println("LastLog: " + lastLog);
        //Then
        assertEquals("loggingNr1", lastLog);
    }
}
