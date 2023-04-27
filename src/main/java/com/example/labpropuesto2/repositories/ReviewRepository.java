package com.example.labpropuesto2.repositories;

import com.example.labpropuesto2.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    List <Review> findByBookId(Long bookId);
    List <Review> findByUserId(Long userId);




}
