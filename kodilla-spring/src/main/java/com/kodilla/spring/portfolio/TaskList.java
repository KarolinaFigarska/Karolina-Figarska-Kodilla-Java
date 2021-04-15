package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    final private List<String> tasks;

    public TaskList( List<String> tasks) {
        this.tasks = tasks;
        tasks = new ArrayList<>();
    }

    public List<String> getTasks() {
        return tasks;
    }

    public List<String> addTasks(String task) {
        tasks.add(task);
        return tasks;
    }

}
