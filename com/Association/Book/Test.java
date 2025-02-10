package com.Association.Book;

public class Test {
    public static void main(String[] args){
        Book books = new Book();
        books.setAuthor("John Doe");
        books.setTitle("Java Programming");
        Library library = new Library();
        library.setName("Public library");

        System.out.println("Title:"+books.getTitle());
        System.out.println("Author:"+books.getAuthor());
        System.out.println("Library Name:"+library.getName());


    }
}
