package ru.rest_test_task.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rest_test_task.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}