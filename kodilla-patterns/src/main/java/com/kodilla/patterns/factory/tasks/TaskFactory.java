package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING_TASK = "SHOPPING-TASK";
    public static final String PAINTING_TASK = "PAINTING-TASK";
    public static final String DRIVING_TASK = "DRIVING-TASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING_TASK:
                return new ShoppingTask("Fruit", "orange", 7.0);
            case PAINTING_TASK:
                return new PaintingTask("House", "blue", "children room");
            case DRIVING_TASK:
                return new DrivingTask("Shopping", "To shop", "car");
            default:
                return null;
        }

    }
}
