package com.example.labpropuesto2.services;

import com.example.labpropuesto2.models.Book;
import com.example.labpropuesto2.models.FavoriteBook;

import java.util.List;

public interface FavoriteBookService {
    FavoriteBook addFavoriteBook(Long bookId, Long userId);
    List <Book> getFavoriteBookByUserId( Long userId);
    void removeFavoriteBook(Long bookId, Long userId);
}
