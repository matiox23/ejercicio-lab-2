package com.example.labpropuesto2.controllers;

import com.example.labpropuesto2.models.Book;
import com.example.labpropuesto2.services.BookService;

public class BookController {

    public BookService  bookService;
    public void addBook(){
        Book book = new Book();
        bookService.addBook(book);
    }
}
