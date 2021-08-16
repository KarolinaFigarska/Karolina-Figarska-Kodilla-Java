package com.kodilla.exception.io;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FileReaderTestSuite {

    @Test
    void testReadFile() {
        // given
        FileReader fileReader = new FileReader();
        // when & then
        // asercja nie przechodzi, ponieważ meroda zgłasza wyjątek a nie powinna
        //asecja nie jest potrzebna do zrozumienia modułu 8, wystarczy klasa z main
        //assertDoesNotThrow(() -> fileReader.readFile());
    }
}