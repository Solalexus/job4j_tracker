package ru.job4j.pojo;

public class Book {
    private String title;
    private int quantityPages;

    public Book(String title, int quantityPages) {
        this.title = title;
        this.quantityPages = quantityPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuantityPages() {
        return quantityPages;
    }

    public void setQuantityPages(int quantityPages) {
        this.quantityPages = quantityPages;
    }
}
