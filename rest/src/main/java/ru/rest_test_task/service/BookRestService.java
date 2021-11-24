package ru.rest_test_task.service;

import org.springframework.stereotype.Service;
import ru.rest_test_task.controller.DTO.BookDTO;
import ru.rest_test_task.controller.DTO.ReviewDTO;
import ru.rest_test_task.model.Book;
import ru.rest_test_task.model.Review;

import java.util.List;
import java.util.Optional;

@Service
public interface BookRestService {

    List<BookDTO> findAllBook();

    Optional<BookDTO> findBookById(Long id);

    public static BookDTO mapToDTO(Book book) {
        return new BookDTO(
                book.getId(),
                book.getNumber(),
                book.getTitle(),
                book.getDescription(),
                book.getAuthor(),
                book.getReviewList()
        );
    }
}
