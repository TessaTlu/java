package com.company;

public class Book {
    private String title;
    private String author;
    private int pagesCapacity;

    public Book() {
        title = "No title";
        author = "No name";
        pagesCapacity = 0;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, int pagesCapacity) {
        this.title = title;
        this.author = author;
        this.pagesCapacity = pagesCapacity;
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

    public int getPagesCapacity() {
        return pagesCapacity;
    }

    public void setPagesCapacity(int pagesCapacity) {
        this.pagesCapacity = pagesCapacity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pagesCapacity=" + pagesCapacity +
                '}';
    }

    public boolean isBoring() {
        if (title.length() > 40 && pagesCapacity >= 700) {
            return true;
        } else {
            return false;
        }
    }
}