package com.example.labpropuesto2.services;

import com.example.labpropuesto2.models.Book;
import com.example.labpropuesto2.models.FavoriteBook;
import com.example.labpropuesto2.models.User;

import java.util.List;

public interface FavoriteBookService {
    FavoriteBook saveFavorite(FavoriteBook favoriteBook);

    void deleteFavoriteById(Long id);
    List<FavoriteBook> getAllFavoritesByUser(User user);

    FavoriteBook addFavoriteBook(Long bookId, Long userId);

    List<Book> getFavoriteBooksByUserId(Long userId);
}
