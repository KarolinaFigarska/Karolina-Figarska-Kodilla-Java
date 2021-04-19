package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    @BeforeAll
    public static void log() {
        Logger logger = Logger.INSTANCE;
        logger.log("loggingNr1");
    }

    @Test
    void testGetFileName() {
        //Given
        //When
        Logger logger = Logger.INSTANCE;
        String lastLog = logger.getLastLog();
        //Then
        assertEquals("loggingNr1", lastLog);
    }
}
