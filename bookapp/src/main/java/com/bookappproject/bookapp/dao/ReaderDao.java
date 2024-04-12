package com.bookappproject.bookapp.dao;

import com.bookappproject.bookapp.model.Reader;

import java.util.List;

public interface ReaderDao {

    List<Reader> getReaders();

    Reader getReaderById(int readerId);

    Reader getReaderByName(String name);

    Reader createReader(Reader reader);
}
