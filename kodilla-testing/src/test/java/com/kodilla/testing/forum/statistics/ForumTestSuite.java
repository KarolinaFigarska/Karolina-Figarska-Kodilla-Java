package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumTestSuite {

    @Test
    public void testNumberOfPostsZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(0);
        calculateStatistics.calculateAdvStatistics();

        //When
        int result = calculateStatistics.getNumberOfPosts();

        //Then
        Assertions.assertEquals(0, result);
    }

    @Test
    public void testAveragePostsPerUser() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(1000);
        List<String> lists = new ArrayList<>();
        lists.add("ddd");
        lists.add("aaa");
        when(statisticsMock.usersNames()).thenReturn(lists);
        calculateStatistics.calculateAdvStatistics();

        //When
        double result = calculateStatistics.getAveragePostsPerUser();

        //Then
       Assertions.assertEquals(500, result);
    }

    @Test
    public void testAverageCommentsPerUser() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.commentsCount()).thenReturn(0);
        List<String> lists = new ArrayList<>();
        lists.add("ddd");
        lists.add("aaa");
        lists.add("ccc");
        lists.add("lll");
        when(statisticsMock.usersNames()).thenReturn(lists);
        calculateStatistics.calculateAdvStatistics();

        //When
        double result = calculateStatistics.getAverageCommentsPerUser();

        //Then
        Assertions.assertEquals(0, result);
    }

    @Test
    public void testAverageCommentsPerPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.commentsCount()).thenReturn(50);
        when(statisticsMock.postsCount()).thenReturn(10);
        calculateStatistics.calculateAdvStatistics();

        //When
        double result = calculateStatistics.getAverageCommentsPerPosts();

        //Then
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testAverageCommentsPerPostsTwo() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(50);
        calculateStatistics.calculateAdvStatistics();

        //When
        double result = calculateStatistics.getAverageCommentsPerPosts();

        //Then
        Assertions.assertEquals(0.2, result);
    }
    @Test
    public void testAveragePostsPerUserTwo() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(100);
        List<String> lists = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(lists);
        calculateStatistics.calculateAdvStatistics();

        //When
        double result = calculateStatistics.getAveragePostsPerUser();

        //Then
        Assertions.assertEquals(0, result);
    }
    @Test
    public void testAverageCommentsPerUserTwo() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.commentsCount()).thenReturn(200);
        List<String> lists = new ArrayList<>();
        for (int i =0; i<100; i++) {
            lists.add("a"); }

        when(statisticsMock.usersNames()).thenReturn(lists);
        calculateStatistics.calculateAdvStatistics();

        //When
        double result = calculateStatistics.getAverageCommentsPerUser();

        //Then
        Assertions.assertEquals(2, result);
    }
}
