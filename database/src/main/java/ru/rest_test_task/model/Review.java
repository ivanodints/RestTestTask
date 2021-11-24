package ru.rest_test_task.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "review")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private Long id;

    @Column(name = "review_number", nullable = false)
    private int number;

    @Column(name = "review_text")
    private String text;

    @Column(name = "review_rate")
    private double rate;

    @ManyToOne(optional = true)
    @JsonIgnore
    private Book book;

}
