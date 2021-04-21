package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING_TASK);

        //Then
        assertEquals("Fruit", shopping.getTaskName());
        assertEquals("BUYING: orange quantity: 7.0",shopping.executeTask());
        assertEquals(true, shopping.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING_TASK);

        //Then
        assertEquals("House", painting.getTaskName());
        assertEquals("COLORING: blue WHAT IS PAINTING: children room",painting.executeTask());
        assertEquals(true, painting.isTaskExecuted());
    }

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING_TASK);

        //Then
        assertEquals("Shopping", driving.getTaskName());
        assertEquals("DRIVING: To shop WHAT IS USING: car",driving.executeTask());
        assertEquals(true, driving.isTaskExecuted());

    }
}
