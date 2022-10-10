package com.khimsolutions.springbootbookshop.service;

import com.khimsolutions.springbootbookshop.model.Book;

import java.util.List;

public interface IBookService {
    Book saveBook(Book book);

    void deleteBook(Long id);

    List<Book> findAllBooks();
}
