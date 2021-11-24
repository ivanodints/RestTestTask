package ru.rest_test_task.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.rest_test_task.controller.DTO.BookDTO;
import ru.rest_test_task.service.BookRestService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/book")
public class BookResources {

    private final BookRestService bookRestService;

    public BookResources(BookRestService bookRestService) {
        this.bookRestService = bookRestService;
    }

    @GetMapping(path = "/all", produces = "application/json")
    public List<BookDTO> findAll() {
        return bookRestService.findAllBook().stream().collect(Collectors.toList());
    }

    @GetMapping(path = "/{id}", produces = "application/json")
    public BookDTO findById(@PathVariable("id") Long id) {
        BookDTO bookDTO = bookRestService.findBookById(id)
                .orElseThrow(() -> new NotFoundException());

        return bookDTO;
    }
}
