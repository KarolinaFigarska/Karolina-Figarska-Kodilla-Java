package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {

    //Dotyczy modułu 8.1-8.2

//    public void readFile() throws IOException {
//        ClassLoader classLoader = getClass().getClassLoader();
//        // This line is not used because there is an issue with path
//        File file = new File(classLoader.getResource("names.txt").getFile());
//        // Instead of file.getPath() I use fix path
//        try (Stream<String> fileLines = Files.lines(Paths.get("kodilla-exception/src/main/resources/names.txt"))) {
//            // file.getPath() - points to kodilla-exception\build\resources\main\names.txt
//            // I am not sure why this path is incorrect
//            // try (Stream<String> fileLines = Files.lines(Paths.get(file.getPath()))) {
//            fileLines.forEach(System.out::println);
//        } catch (IOException e) {
//            System.out.println("Oh no! Something went wrong! Error:" + e);
//        } finally {
//            System.out.println("I am gonna be here... always!");
//        }
//    }

    //Dotyczy modułu 8.3

        public void readFile() throws FileReaderException {
        ClassLoader classLoader = getClass().getClassLoader();
        // This line is not used because there is an issue with path
        //File file = new File(classLoader.getResource("names.txt").getFile());
        // Instead of file.getPath() I use fix path
        try (Stream<String> fileLines = Files.lines(Paths.get("kodilla-exception/src/main/resources/names.txt"))) {
            // file.getPath() - points to kodilla-exception\build\resources\main\names.txt
            // I am not sure why this path is incorrect
            // try (Stream<String> fileLines = Files.lines(Paths.get(file.getPath()))) {
            fileLines.forEach(System.out::println);
        } catch (IOException e) {
            throw  new FileReaderException();
        } finally {
            System.out.println("I am gonna be here... always!");
        }
    }
}