package ru.rest_test_task.controller.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.rest_test_task.model.Book;
import ru.rest_test_task.model.Review;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO implements Serializable {

    private Long id;

    private int number;

    private String title;

    private String description;

    private String author;

    private List<Review> reviewList;

    public BookDTO(Book book) {
        this.id = book.getId();
        this.number = book.getNumber();
        this.title = book.getTitle();
        this.description = book.getDescription();
        this.author = book.getAuthor();
        this.reviewList = book.getReviewList();
    }
}
