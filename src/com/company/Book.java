package com.company;

import java.util.Objects;

public class Book {
    private final String id;
    private String bookCaption;
    private Author bookAuthor;
    private int bookPublishingYear;

    public Book(String id, String bookCaption, Author bookAuthor, int bookPublishingYear) {
        this.id=id;
        this.bookCaption=bookCaption;
        this.bookAuthor=bookAuthor;
        this.bookPublishingYear=bookPublishingYear;
    }

   public String getId() {
        return id;
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
    @Override
    public String toString() {
        return bookAuthor.toString() + " \"" + bookCaption+"\". Год издания: "+bookPublishingYear;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book c2 = (Book) other;
        return id.equals(c2.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

 }
