package com.company;

public class Book {
    private String bookCaption;
    private Author bookAuthor;
    private int bookPublishingYear;

    public Book(String bookCaption, Author bookAuthor, int bookPublishingYear) {
        this.bookCaption=bookCaption;
        this.bookAuthor=bookAuthor;
        this.bookPublishingYear=bookPublishingYear;
    }

    public String getBookCaption() {
        return bookCaption;
    }
    public Author getBookAuthor() {
        return bookAuthor;
    }
    public int getBookPublishingYear() {
        return bookPublishingYear;
    }
    public void setBookPublishingYear(int bookPublishingYear) {
        this.bookPublishingYear=bookPublishingYear;
    }

 }
