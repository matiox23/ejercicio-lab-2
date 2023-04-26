package com.example.labpropuesto2.services;

import com.example.labpropuesto2.models.Book;
import com.example.labpropuesto2.repositories.BookRepository;

public class BookService {

    public BookRepository bookRepository;

    public void addBook(Book book) {
    bookRepository.save(book);
    }

}
