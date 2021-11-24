package ru.rest_test_task.service;

import org.springframework.stereotype.Service;
import ru.rest_test_task.controller.DTO.BookDTO;
import ru.rest_test_task.repo.BookRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class BookRestServiceImpl implements BookRestService {

    private final BookRepository bookRepository;

    public BookRestServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<BookDTO> findAllBook() {
        return bookRepository.findAll()
                .stream()
                .map(book -> new BookDTO(book))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<BookDTO> findBookById(Long id) {
        return bookRepository.findById(id).map(book -> BookRestService.mapToDTO(book));
    }
}
