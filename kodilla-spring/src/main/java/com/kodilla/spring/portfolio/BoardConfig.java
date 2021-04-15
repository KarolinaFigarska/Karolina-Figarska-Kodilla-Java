package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Arrays;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("toDoList")
    TaskList taskList1;

    @Autowired
    @Qualifier("inProgressList")
    TaskList taskList2;

    @Autowired
    @Qualifier("doneList")
    TaskList taskList3;

    @Bean
    public Board getBoard() {

        return new Board(taskList1, taskList2, taskList3);
    }

    @Bean(name = "toDoList")
    @Scope("prototype")
    public TaskList getTaskListOne() {
        return new TaskList(Arrays.asList("Do: 1", "Do: 2"));
    }

    @Bean(name = "inProgressList")
    @Scope("prototype")
    public TaskList getTaskListTwo() {
        return new TaskList(Arrays.asList("InProgress: 1", "InProgress: 2"));
    }

    @Bean(name = "doneList")
    @Scope("prototype")
    public TaskList getTaskListThree() {
        return new TaskList(Arrays.asList("Done: 1", "Done: 2"));
    }
}
