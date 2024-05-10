package com.bookappproject.bookapp.services;

import com.bookappproject.bookapp.dao.BooksDao;
import com.bookappproject.bookapp.dao.Books_ReaderDao;
import com.bookappproject.bookapp.model.Book;
import com.bookappproject.bookapp.model.Books_Reader;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookService {
    private Books_ReaderDao booksReaderDao;
    private BooksDao booksDao;

    public BookService(Books_ReaderDao booksReaderDao, BooksDao booksDao) {
        this.booksReaderDao = booksReaderDao;
        this.booksDao = booksDao;
    }
    public List<Book> getReadersBooks(int readerId) {
        // Gets the list of books for the specific reader
        List<Books_Reader> bookReaderList = booksReaderDao.getBooksByReaderId(readerId);

        // Creates empty list for the readers books
        List <Book> bookList = new ArrayList<>();

        // Creates a list of Books by creating the Book with the bookId
        for (Books_Reader booksReader : bookReaderList) {
            Book book = booksDao.getBookByBookId(booksReader.getBook_id());
            bookList.add(book);
        }

        return bookList;
    }
}