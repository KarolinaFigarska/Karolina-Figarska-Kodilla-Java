package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{
    private final String taskName;
    private final String where;
    private final String using;
    private boolean isDone;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String executeTask() {
        isDone = false;
        return "DRIVING: " + where + " WHAT IS USING: " + using;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public  boolean isTaskExecuted() {
        isDone = true;
        return isDone;
    }
}
