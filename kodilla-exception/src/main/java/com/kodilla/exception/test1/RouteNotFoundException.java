package com.kodilla.exception.test1;

public class RouteNotFoundException extends Exception {
    public RouteNotFoundException(final String message) {
       super(message);
    }
}
