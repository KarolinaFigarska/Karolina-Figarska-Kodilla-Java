package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;

public class ExceptionModuleRunner {

    public static void main(String[] args) {
        //Dotyczy modułu 8.1-8.2
        //FileReader fileReader = new FileReader();
        //fileReader.readFile();

        //Dotyczy modułu 8.3
        FileReader fileReader = new FileReader();
        try {
            fileReader.readFile();
        } catch (FileReaderException e) {
            System.out.println("Problem while reading a file!");
        }
    }
}
