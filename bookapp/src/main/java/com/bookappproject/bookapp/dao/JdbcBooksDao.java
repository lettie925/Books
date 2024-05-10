package com.bookappproject.bookapp.dao;

import com.bookappproject.bookapp.exception.DaoException;
import com.bookappproject.bookapp.model.Book;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcBooksDao implements BooksDao{

    private final JdbcTemplate jdbcTemplate;

    public JdbcBooksDao(JdbcTemplate jdbcTemplate) { this.jdbcTemplate = jdbcTemplate; }
    @Override
    public List<Book> getBooks() {
        List <Book> books = new ArrayList<>();

        String sql = "SELECT * FROM books ORDER BY title";

        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
            while (results.next()) {
                Book book = mapRowToBook(results);
                books.add(book);
            }
        } catch (CannotGetJdbcConnectionException e) {
            throw new DaoException("Unable to connect to server or database", e);
        }
        return books;
    }

    @Override
    public Book getBookByBookId(int bookId) {
        Book book = new Book();

        String sql = "SELECT * FROM books WHERE book_id = ?";

        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, bookId);
            if (results.next()) {
                book = mapRowToBook(results);
            }
        } catch (CannotGetJdbcConnectionException e) {
            throw new DaoException("Unable to connect to server or database", e);
        }
        return book;
    }

    public Book mapRowToBook(SqlRowSet results) {
        Book book = new Book();
        book.setBook_id(results.getInt("book_id"));
        book.setTitle(results.getString("title"));
        book.setDescription(results.getString("description"));
        book.setGenre(results.getString("genre"));

        return book;
    }
}