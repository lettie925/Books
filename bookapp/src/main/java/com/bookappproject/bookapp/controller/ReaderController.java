package com.bookappproject.bookapp.controller;

import com.bookappproject.bookapp.dao.ReaderDao;
import com.bookappproject.bookapp.exception.DaoException;
import com.bookappproject.bookapp.model.Reader;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@CrossOrigin
@RequestMapping("/readers")
@RestController
public class ReaderController {
    private ReaderDao readerDao;

    public ReaderController(ReaderDao readerDao) {
        this.readerDao = readerDao;
    }

    @RequestMapping(path = "", method = RequestMethod.GET)
    public List<Reader> getList() {
        try {
            return readerDao.getReaders();
        } catch (DaoException e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "DAO error -" + e.getMessage());
        }
    }
}
