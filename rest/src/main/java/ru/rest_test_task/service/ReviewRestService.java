package ru.rest_test_task.service;

import org.springframework.stereotype.Service;
import ru.rest_test_task.controller.DTO.ReviewDTO;
import ru.rest_test_task.model.Review;


import java.util.List;
import java.util.Optional;

@Service
public interface ReviewRestService {

    List<ReviewDTO> findAllReview();

    Optional<ReviewDTO> findReviewById(Long id);

    public static ReviewDTO mapToDTO(Review review) {
        return new ReviewDTO(
                review.getId(),
                review.getNumber(),
                review.getText(),
                review.getRate(),
                review.getBook()
        );
    }
}
