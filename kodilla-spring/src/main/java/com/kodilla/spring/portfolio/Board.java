package com.kodilla.spring.portfolio;

public class Board {

    final TaskList toDoList;
    final TaskList inProgressList;
    final TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void getToDoList() {
        System.out.println(toDoList.getTasks());
    }

    public void getInProgressList() {
        System.out.println(inProgressList.getTasks());
    }

    public void getDoneList() {
        System.out.println(doneList.getTasks());
    }

    public void addTaskToDoList(String taskToDoList) {
        toDoList.addTasks(taskToDoList);
        System.out.println(taskToDoList);
    }
}

