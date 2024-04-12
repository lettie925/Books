package com.bookappproject.bookapp.controller;

import com.bookappproject.bookapp.dao.BooksDao;
import com.bookappproject.bookapp.exception.DaoException;
import com.bookappproject.bookapp.model.Book;
import com.bookappproject.bookapp.services.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@CrossOrigin
@RequestMapping("/books")
@RestController
public class BooksController {

    private BookService bookService;
    private BooksDao booksDao;

    public BooksController(BooksDao booksDao, BookService bookService) {
        this.booksDao = booksDao;
        this.bookService = bookService;
    }
    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public List<Book> getBooksByReaderId(@PathVariable int id) {
        try {
            return bookService.getReadersBooks(id);
        } catch (DaoException e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "DAO error -" + e.getMessage());
        }
    }

    @RequestMapping(path = "", method = RequestMethod.GET)
    public List<Book> getBooks() {
        try {
            return booksDao.getBooks();
        } catch (DaoException e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "DAO error -" + e.getMessage());
        }
    }
}
