package ru.rest_test_task.controller.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.rest_test_task.model.Book;
import ru.rest_test_task.model.Review;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReviewDTO {

    private Long id;

    private int number;

    private String text;

    private double rate;

    private Book book;

    public ReviewDTO(Review text) {
        this.id = text.getId();
        this.number = text.getNumber();
        this.text = text.getText();
        this.rate = text.getRate();
        this.book = text.getBook();
    }
}
