package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {

        //Given
        User wiktor = new Millenials("Wiktor");
        User maja = new YGeneration("Maja");
        User hanna = new ZGeneration("Hanna");

        //When
        String wiktorPublisher = wiktor.sharePost();
        System.out.println("Wiktor use: " + wiktorPublisher);
        String majaPublisher = maja.sharePost();
        System.out.println("Maja use: " + majaPublisher);
        String hannaPublisher = hanna.sharePost();
        System.out.println("Hanna use: " + hannaPublisher);

        //Then
        assertEquals("Facebook", wiktorPublisher);
        assertEquals("Twitter", majaPublisher);
        assertEquals("Snapchat", hannaPublisher);
    }

    @Test
    void testIndividualSharingStrategy() {

        //Given
        User adrianna = new Millenials("Adrianna");

        //When
        String adriannaPublisher = adrianna.sharePost();
        System.out.println("Adrianna use: " + adriannaPublisher);
        adrianna.setSocialPublisher(new TwitterPublisher());
        adriannaPublisher = adrianna.sharePost();
        System.out.println("Now Adrianna use: " + adriannaPublisher);

        //Then
        assertEquals("Twitter", adriannaPublisher);
    }
}
