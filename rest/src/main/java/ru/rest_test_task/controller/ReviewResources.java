package ru.rest_test_task.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.rest_test_task.controller.DTO.BookDTO;
import ru.rest_test_task.controller.DTO.ReviewDTO;
import ru.rest_test_task.service.BookRestService;
import ru.rest_test_task.service.ReviewRestService;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/api/v1/review")
public class ReviewResources {

    private final ReviewRestService reviewRestService;

    public ReviewResources(ReviewRestService reviewRestService) {
        this.reviewRestService = reviewRestService;
    }

    @GetMapping(path = "/all", produces = "application/json")
    public List<ReviewDTO> findAll() {
        return reviewRestService.findAllReview().stream().collect(Collectors.toList());
    }

    @GetMapping(path = "/{id}", produces = "application/json")
    public ReviewDTO findById(@PathVariable("id") Long id) {
        ReviewDTO reviewDTO = reviewRestService.findReviewById(id)
                .orElseThrow(() -> new NotFoundException());

        return reviewDTO;
    }
}
