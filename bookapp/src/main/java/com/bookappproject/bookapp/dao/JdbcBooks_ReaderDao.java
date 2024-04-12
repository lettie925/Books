package com.bookappproject.bookapp.dao;

import com.bookappproject.bookapp.exception.DaoException;
import com.bookappproject.bookapp.model.Book;
import com.bookappproject.bookapp.model.Books_Reader;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcBooks_ReaderDao implements Books_ReaderDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcBooks_ReaderDao(JdbcTemplate jdbcTemplate) { this.jdbcTemplate = jdbcTemplate; }
    @Override
    public List<Books_Reader> getBooksByReaderId(int readerId) {
        List<Books_Reader> booksList = new ArrayList<>();

        String sql = "SELECT * FROM books_reader" +
                " WHERE reader_id = ?;";

        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, readerId);
            while (results.next()) {
                Books_Reader booksReader = mapRowToBooks_Reader(results);
                booksList.add(booksReader);
            }
        } catch (CannotGetJdbcConnectionException e) {
            throw new DaoException("Unable to connect to server or database", e);
        }
        return booksList;
    }

    public Books_Reader mapRowToBooks_Reader(SqlRowSet results) {
        Books_Reader booksReader = new Books_Reader();
        booksReader.setBooks_reader_id(results.getInt("books_reader_id"));
        booksReader.setReader_id(results.getInt("reader_id"));
        booksReader.setBook_id(results.getInt("book_id"));
        booksReader.setBook_read(results.getBoolean("book_read"));
        booksReader.setBook_wtr(results.getBoolean("book_wtr"));
        booksReader.setBook_dnf(results.getBoolean("book_dnf"));
        booksReader.setBook_owned(results.getBoolean("book_owned"));

        return booksReader;
    }
}
