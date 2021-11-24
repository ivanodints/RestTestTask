package ru.rest_test_task.service;

import org.springframework.stereotype.Service;
import ru.rest_test_task.controller.DTO.BookDTO;
import ru.rest_test_task.controller.DTO.ReviewDTO;
import ru.rest_test_task.repo.ReviewRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ReviewRestServiceImpl implements ReviewRestService {

    private final ReviewRepository reviewRepository;

    public ReviewRestServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public List<ReviewDTO> findAllReview() {
        return reviewRepository.findAll()
                .stream()
                .map(review -> new ReviewDTO(review))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<ReviewDTO> findReviewById(Long id) {
        return reviewRepository.findById(id).map(review -> ReviewRestService.mapToDTO(review));
    }
}
