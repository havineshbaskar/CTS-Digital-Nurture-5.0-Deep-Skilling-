package com.example;

public class Library {

    private Book book;

    public void setBook(Book book) {
        this.book = book;
    }

    public void issueBook() {
        book.displayBook();
        System.out.println("Book Issued Successfully");
    }

}