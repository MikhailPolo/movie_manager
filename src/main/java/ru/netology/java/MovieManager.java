package ru.netology.java;

public class MovieManager {
    private String[] movies = new String[0];

    private int limit;

    public MovieManager() {
        this.limit = 10;
    }

    public MovieManager(int limit) {
        this.limit = limit;
    }

    public void addFilms(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAllFilms() {
        return movies;
    }

    public String[] findLastFilms() {
        int maxLength;
        if (movies.length < limit) {
            maxLength = movies.length;
        } else {
            maxLength = limit;
        }
        String[] tmp = new String[maxLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }
}
