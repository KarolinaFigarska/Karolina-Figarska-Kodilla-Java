package com.kodilla.hibernate.manytomany.facade;

public class SearchingException extends Exception{

    public static String ERR_NOT_FOUND = "Company not found in database";
    public static String ERR_NOT_FOUND_WORKER = "Worker not found in database";


    public SearchingException(String message) {
        super(message);
    }
}
