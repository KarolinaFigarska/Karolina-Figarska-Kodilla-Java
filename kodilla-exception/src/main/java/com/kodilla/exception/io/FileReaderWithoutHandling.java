package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReaderWithoutHandling {

    public void readFile() throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        // This line is not used because there is an issue with path
        File file = new File(classLoader.getResource("names.txt").getFile());
        // Instead of file.getPath() I use fix path
        Stream<String> fileLines = Files.lines(Paths.get("kodilla-exception/src/main/resources/names.txt"));
            // file.getPath() - points to kodilla-exception\build\resources\main\names.txt
            // I am not sure why this path is incorrect
            // try (Stream<String> fileLines = Files.lines(Paths.get(file.getPath()))) {
            fileLines.forEach(System.out::println);
    }
}
