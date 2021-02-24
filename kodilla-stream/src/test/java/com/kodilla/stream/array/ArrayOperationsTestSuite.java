package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] table = {2,3,4,5,6};
        Array array = new Array();

        //When
        double result = array.getAverage(table);

        //Then
        assertEquals(4.0,result);

    }
}
