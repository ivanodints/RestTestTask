package ru.rest_test_task.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rest_test_task.model.Book;


public interface BookRepository extends JpaRepository<Book, Long> {
}
