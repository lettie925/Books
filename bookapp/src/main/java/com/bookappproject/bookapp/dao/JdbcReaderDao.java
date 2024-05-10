package com.bookappproject.bookapp.dao;

import com.bookappproject.bookapp.model.Reader;
import com.bookappproject.bookapp.exception.DaoException;


import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcReaderDao implements ReaderDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcReaderDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Reader> getReaders() {

        List<Reader> readers = new ArrayList<>();

        String sql = "SELECT * FROM reader ORDER BY name";

        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
            while (results.next()) {
                Reader reader = mapRowToReader(results);
                readers.add(reader);
            }
        } catch (CannotGetJdbcConnectionException e) {
            throw new DaoException("Unable to connect to server or database", e);
        }
        return readers;
    }

    @Override
    public Reader getReaderById(int readerId) {
        Reader reader = new Reader();

        String sql = "SELECT * from reader where reader_id = ?";

        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, readerId);
            if (results.next()) {
                reader = mapRowToReader(results);
            }
        } catch (CannotGetJdbcConnectionException e) {
            throw new DaoException("Unable to connect to server or database", e);
        }
        return reader;
    }

    @Override
    public Reader getReaderByName(String name) {
        return null;
    }

    @Override
    public Reader createReader(Reader reader) {
        return null;
    }

    public Reader mapRowToReader(SqlRowSet results) {
        Reader reader = new Reader();

        reader.setReader_id(results.getInt("reader_id"));
        reader.setName(results.getString("name"));
        reader.setAge(results.getInt("age"));
        reader.setFavorite_book(results.getString("favorite_book"));
        reader.setFavorite_genre(results.getString("favorite_genre"));

        return reader;
    }
}