package com.gravenium.playwithspring.web;

import java.util.LinkedHashMap;

public class Book {

    private String title;
    private String author;
    private String genre;
    private String bookType;

    private LinkedHashMap<String, String> genres;

    public Book() {
        genres = new LinkedHashMap<>();
        genres.put("Horror", "Horror");
        genres.put("Thriller", "Thriller");
        genres.put("Biography", "Biography");
        genres.put("Adventure", "Adventure");
        genres.put("Business", "Business");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public LinkedHashMap<String, String> getGenres() {
        return genres;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }
}
