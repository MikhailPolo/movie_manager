package ru.netology.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MovieManagerTest {
    @Test
    public void testAddFilms() {
        MovieManager manager = new MovieManager();

        manager.addFilms("Film 1");
        manager.addFilms("Film 2");
        manager.addFilms("Film 3");
        manager.addFilms("Film 4");
        manager.addFilms("Film 5");

        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5"};
        String[] actual = manager.findAllFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastFilms() {
        MovieManager manager = new MovieManager();

        manager.addFilms("Film 1");
        manager.addFilms("Film 2");
        manager.addFilms("Film 3");
        manager.addFilms("Film 4");
        manager.addFilms("Film 5");

        String[] expected = {"Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLastFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastFilmsLimit() {
        MovieManager manager = new MovieManager(3);

        manager.addFilms("Film 1");
        manager.addFilms("Film 2");
        manager.addFilms("Film 3");
        manager.addFilms("Film 4");

        String[] expected = {"Film 4", "Film 3", "Film 2"};
        String[] actual = manager.findLastFilms();

        Assertions.assertArrayEquals(expected, actual);
    }
}
