package com.kodilla.testing.collection;
import java.util.ArrayList;
import java.util.List;

public class OddNumberExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();

        for (Integer temporaryNumber : numbers) {
            if (temporaryNumber % 2 == 0) {
                evenNumbers.add(temporaryNumber);
            }
        }
        return evenNumbers;
    }
}
