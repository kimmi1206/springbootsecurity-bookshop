package com.khimsolutions.springbootbookshop.repository;

import com.khimsolutions.springbootbookshop.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book, Long> {
}
