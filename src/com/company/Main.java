package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Author firstAuthor=new Author("Лев","Толстой");
        Author secondAuthor=new Author("Стивен","Кинг");

        Book firstBook=new Book("Война и мир",firstAuthor,2008);
        Book secondBook=new Book("Оно",secondAuthor,2015);

        System.out.println("firstBook.getBookCaption() = " + firstBook.getBookCaption());
        System.out.println("firstBook.getBookAuthor() = " + firstBook.getBookAuthor().getFirstName()+" "+firstBook.getBookAuthor().getLastName());
        System.out.println("firstBook.getBookPublishingYear() = " + firstBook.getBookPublishingYear());
        System.out.println();
        System.out.println("secondBook.getBookCaption() = " + secondBook.getBookCaption());
        System.out.println("secondBook.getBookAuthor() = " + secondBook.getBookAuthor().getFirstName()+" "+secondBook.getBookAuthor().getLastName());
        System.out.println("secondBook.getBookPublishingYear() = " + secondBook.getBookPublishingYear());
        System.out.println();
        secondBook.setBookPublishingYear(2020);
        System.out.println("secondBook.getBookPublishingYear() = " + secondBook.getBookPublishingYear());


     }
}
