package com.example.labpropuesto2.controllers;


import com.example.labpropuesto2.models.Review;
import com.example.labpropuesto2.services.ReviewService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReviewController {

    private final ReviewService reviewService;
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @PostMapping
    public ResponseEntity<Review> addReview(@RequestParam Long bookId,
                                            @RequestParam Long userId, @RequestParam String title, @RequestParam
                                            String comment, @RequestParam Integer rating) {
        Review newReview = reviewService.addReview(bookId, userId, title,
                comment, rating);
        return ResponseEntity.ok(newReview);
    }

    @GetMapping("/book/{bookId}")
    public ResponseEntity<List<Review>> getReviewsByBookId(@PathVariable
                                                           Long bookId) {
        List<Review> reviews = reviewService.getReviewsByBookId(bookId);
        return ResponseEntity.ok(reviews);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Review>> getReviewsByUserId(@PathVariable
                                                           Long userId) {
        List<Review> reviews = reviewService.getReviewsByUserId(userId);
        return ResponseEntity.ok(reviews);
    }


}
