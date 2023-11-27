package com.graphql.Services;

import com.graphql.modal.Book;

import java.util.List;

public interface BookServices {
    Book createBook(Book book);
    List<Book> getAllBooks();
    Book getBookById(String id);
}
