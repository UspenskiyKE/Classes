package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Author firstAuthor=new Author("1","Лев","Толстой");
        Author secondAuthor=new Author("2","Стивен","Кинг");

        Book firstBook=new Book("1","Война и мир",firstAuthor,2008);
        Book secondBook=new Book("2","Оно",secondAuthor,2015);

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

        Author thirdAuthor=new Author("3","Джек","Лондон");
        String s=thirdAuthor.toString();
        System.out.println("s = " + s);

        Author fourthAuthor=new Author("4","Михаэль", "Энде");
        Book thirdBook=new Book("3","Бесконечная история", fourthAuthor, 2020);
        String s2=thirdBook.toString();
        System.out.println("s2 = " + s2);

        System.out.println("firstAuthor.equals(firstAuthor) = " + firstAuthor.equals(firstAuthor));
        System.out.println("firstAuthor.equals(secondAuthor) = " + firstAuthor.equals(secondAuthor));

        System.out.println("secondBook.equals(firstBook) = " + secondBook.equals(firstBook));
        System.out.println("secondBook.equals(secondBook) = " + secondBook.equals(secondBook));


    }
}
