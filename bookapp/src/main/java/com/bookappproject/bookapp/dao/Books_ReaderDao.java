package com.bookappproject.bookapp.dao;

import com.bookappproject.bookapp.model.Books_Reader;

import java.util.List;

public interface Books_ReaderDao {
    List<Books_Reader> getBooksByReaderId(int readerId);
}
