package ru.job4j.oop.pojo;

public class Book {
    private String title;
    private int naberOfPages;

    public Book(String title, int naberOfPages) {
        this.naberOfPages = naberOfPages;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNaberOfPages() {
        return naberOfPages;
    }

    public void setNaberOfPages(int naberOfPages) {
        this.naberOfPages = naberOfPages;
    }
}
