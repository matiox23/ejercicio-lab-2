package com.example.labpropuesto2.repositories;

import com.example.labpropuesto2.models.Book;
import com.example.labpropuesto2.models.FavoriteBook;
import com.example.labpropuesto2.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event;

import java.util.List;
import java.util.Optional;

public interface FavoriteRepository extends JpaRepository<FavoriteBook, Long> {
    List<FavoriteBook> findAll();
    Optional<FavoriteBook> findById(Long id);
    List<FavoriteBook> findByTitleContainingIgnoreCaseOrAuthorContainingIgnoreCase(String title, String author);
    Book save( Book book);


    List<FavoriteBook> findAllByUser(User user);

    FavoriteBook save(Long bookId, Long userId);
}
