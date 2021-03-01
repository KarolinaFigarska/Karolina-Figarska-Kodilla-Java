package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {

    private Statistics statistics;

    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPosts;

    public CalculateStatistics (Statistics statistics) {
        this.statistics = statistics;
    }

    public void quantityOfUser() {
        this.numberOfUsers = statistics.usersNames().size();
    }
    public void quantityOfPosts() {
        this.numberOfPosts = statistics.postsCount();
    }
    public void quantityOfComments() {
        this.numberOfComments = statistics.commentsCount();
    }
    public void calculateOfAveragePostsPerUser() {
        if(numberOfUsers==0){
            this.averagePostsPerUser = 0;
        } else {
            this.averagePostsPerUser = numberOfPosts / numberOfUsers;
        }
    }
    public void calculateOfAverageCommentsPerUser() {
        if(numberOfUsers==0){
            this.averageCommentsPerUser = 0;
        } else {
            this.averageCommentsPerUser = numberOfComments/numberOfUsers;
        }
    }
    public void calculateOfAverageCommentsPerPosts() {
        if(numberOfPosts==0){
            this.averageCommentsPerPosts = 0;
        } else {
            this.averageCommentsPerPosts = (double)numberOfComments/(double)numberOfPosts;
        }
    }

    public void calculateAdvStatistics() {
        quantityOfComments();
        quantityOfPosts();
        quantityOfUser();
        calculateOfAveragePostsPerUser();
        calculateOfAverageCommentsPerUser();
        calculateOfAverageCommentsPerPosts();
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPosts() {
        return averageCommentsPerPosts;
    }
}
