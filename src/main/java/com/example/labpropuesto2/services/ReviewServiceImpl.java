package com.example.labpropuesto2.services;

import com.example.labpropuesto2.models.Book;
import com.example.labpropuesto2.models.Review;
import com.example.labpropuesto2.models.User;
import com.example.labpropuesto2.repositories.BookRepository;
import com.example.labpropuesto2.repositories.ReviewRepository;
import com.example.labpropuesto2.repositories.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ReviewServiceImpl implements  ReviewService{

    private final ReviewRepository reviewRepository;
    private final BookRepository bookRepository;
    private final UserRepository userRepository;
    @Autowired
    public ReviewServiceImpl(ReviewRepository reviewRepository, BookRepository bookRepository, UserRepository userRepository) {
        this.reviewRepository = reviewRepository;
        this.bookRepository = bookRepository;
        this.userRepository = userRepository;
    }


    @Override
    public List<Review> getReviewsByBookId(Long bookId) {
        return reviewRepository.findAll();
    }
    @Override
    public Review createReview(Review review, Long bookId, Long userId) {
        return null;
    }


    @Override
    public Review getReviewByBookIdAndUserId(Long bookId, Long userId) {
        return null;
    }

    @Override
    public Review updateReview(Long id, Review reviewDetails) {
        Review review = getReviewById(id);
        review.setTitle(reviewDetails.getTitle());
        review.setComment(reviewDetails.getComment());
        review.setRating(reviewDetails.getRating());
        review.setUpadateAt(LocalDateTime.now());
        return review;
    }

    @Override
    public void deleteReview(Long id) {

    }

    @Override
    public Review getReviewById(Long id) {
        return null;
    }

    @Override
    public Review addReview(Long bookId, Long userId, Review review) {
        Book book = bookRepository.findById(bookId).orElseThrow(() -> new
                EntityNotFoundException("Book not found with id " + bookId));
        User user = userRepository.findById(userId).orElseThrow(() -> new
                EntityNotFoundException("User not found with id " + userId));
        review.setBook(book);
        review.setUser(user);
        return reviewRepository.save(review);
    }

    @Override
    public Review addReview(Long bookId, Long userId, String title, String comment, Integer rating) {
        return null;
    }

    @Override
    public List<Review> getReviewsByUserId(Long userId) {
         return (List<Review>) reviewRepository.findById(userId).orElseThrow(() -> new
                EntityNotFoundException("Review not found with id " + userId));
    }
}
