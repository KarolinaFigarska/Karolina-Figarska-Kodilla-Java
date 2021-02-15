package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("When list is empty then checking List.isEmpty() should return true")

    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> list = new ArrayList<>();
        OddNumberExterminator oddNumberExterminator = new OddNumberExterminator();

        //When
        List<Integer> checkingList = oddNumberExterminator.exterminate(list);

        //Then
        Assertions.assertTrue(checkingList.isEmpty());
    }

    @DisplayName("When the list contains an even and odd number, then comparing it with the list with" +
            " the same even number should return true")

    @Test
    void testOddNumberExterminatorNormalList() {
        //Given
        List<Integer> list = Arrays.asList(1,2);

        List<Integer> checkingList = new ArrayList<>();
        checkingList.add(2);

        OddNumberExterminator oddNumberExterminator = new OddNumberExterminator();

        //When
        List<Integer> temporaryList = oddNumberExterminator.exterminate(list);

        //Then
        Assertions.assertEquals(checkingList,temporaryList);
    }
}
