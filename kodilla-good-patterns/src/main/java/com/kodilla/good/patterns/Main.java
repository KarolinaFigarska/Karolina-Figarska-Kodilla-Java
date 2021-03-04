package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenges.MovieStore;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String allMovies = MovieStore.getMovies().entrySet().stream()
                .flatMap(stringListEntry -> stringListEntry.getValue().stream())
                .collect(Collectors.joining("!", " ", " "));

        System.out.println(allMovies);
    }
}
