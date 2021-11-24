package ru.rest_test_task.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "book")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Long id;

    @Column(name = "book_number", nullable = false)
    private int number;

    @Column(name = "book_title", nullable = false)
    private String title;

    @Column(name = "book_description", nullable = false)
    private String description;

    @Column(name = "book_author", nullable = false)
    private String author;

    @OneToMany(mappedBy = "book",
            cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Review> reviewList;

}
