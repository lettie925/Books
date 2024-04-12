package com.bookappproject.bookapp.dao;

import com.bookappproject.bookapp.model.Book;

import java.util.List;

public interface BooksDao {
    List<Book> getBooks();

    Book getBookByBookId(int bookId);
}
