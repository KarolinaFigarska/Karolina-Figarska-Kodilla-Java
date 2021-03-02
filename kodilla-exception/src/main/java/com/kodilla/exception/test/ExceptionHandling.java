package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            System.out.println(secondChallenge.probablyIWillThrowException(1.5,2.5));
        } catch (Exception e) {
            System.out.println("The range of x must be: 1-1.9 or y!=1.5");
        } finally {
            System.out.println("Goodbye");
        }
    }
}
