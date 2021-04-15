package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //given
        //creating Books
        Book bookNr1 = new Book("Wolf of the mountains", "Dylan Murphy", LocalDate.of(2001, 2, 15));
        Book bookNr2 = new Book("Slaves of dreams", "Phoebe Pearson", LocalDate.of(1998, 8, 17));
        Book bookNr3 = new Book("Obliteration of heaven", "Morgan Walsh", LocalDate.of(1992, 12, 25));
        Book bookNr4 = new Book("Rejecting the night", "Aimee Murphy", LocalDate.of(2009, 6, 3));
        Book bookNr5 = new Book("Gangsters and kings", "Ryan Talley", LocalDate.of(1989, 11, 1));
        Book bookNr6 = new Book("Unity without duty", "Madelynn Carson", LocalDate.of(1995, 12, 8));
        Book bookNr7 = new Book("Enemies of eternity", "Giancarlo Guerrero", LocalDate.of(2010, 3, 5));

        //creating library
        Library library = new Library("Library Nr 1");
        library.getBooks().add(bookNr1);
        library.getBooks().add(bookNr2);
        library.getBooks().add(bookNr3);
        library.getBooks().add(bookNr4);
        library.getBooks().add(bookNr5);
        library.getBooks().add(bookNr6);
        library.getBooks().add(bookNr7);

        //making a shallow copy
        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Library shallowCopy nr 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object board
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library deepCopy nr 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(bookNr7);

        //Then
        System.out.println(library);
        System.out.println(cloneLibrary);
        System.out.println(deepClonedLibrary);

        assertEquals(6, library.getBooks().size());
        assertEquals(6, cloneLibrary.getBooks().size());
        assertEquals(7, deepClonedLibrary.getBooks().size());
        assertEquals(cloneLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
