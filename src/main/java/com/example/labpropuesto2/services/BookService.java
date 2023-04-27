package com.example.labpropuesto2.services;

import com.example.labpropuesto2.models.Book;
import com.example.labpropuesto2.repositories.BookRepository;

import java.util.List;

public interface BookService {

    Book createBook(Book book);
    Book getBookById (Long id);

    List<Book> getAllBooks();

    Book updateBook( Long id, Book book);

    void deleteBook(Long id);
    List<Book> serachBook(String keyword);

}
