package com.graphql.controllors;

import com.graphql.Services.BookServices;
import com.graphql.input.BookInput;
import com.graphql.modal.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BookControllor {
    @Autowired
    private BookServices bookServices;
    @MutationMapping("createBook")
    public Book createBook(@Argument BookInput book){
        Book b = new Book();
        b.setTitle(book.getTitle());
        b.setAuthor(book.getAuthor());
        b.setPrice(book.getPrice());
        b.setPages(book.getPages());
        b.setDescription(book.getDescription());
        return bookServices.createBook(b);
    }

    @QueryMapping("getBook")
    public Book getBoookById(@Argument String id){
        return bookServices.getBookById(id);
    }

    @QueryMapping("allBooks")
    public List<Book> getAllBooks(){
        return bookServices.getAllBooks();
    }

}
