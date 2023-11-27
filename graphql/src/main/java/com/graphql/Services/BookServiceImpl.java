package com.graphql.Services;

import com.graphql.modal.Book;
import com.graphql.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookServices{
    @Autowired
    private BookRepository bookRepository;
    @Override
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(String id) {
        return bookRepository.findById(id).orElseThrow(()->new RuntimeException("Unable to find book with id "+id));
    }
}
