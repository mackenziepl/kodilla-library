package com.kodilla.library.service;

import com.kodilla.library.mapper.CopyMapper;
import com.kodilla.library.repository.BookRepository;
import com.kodilla.library.repository.CopyRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class DbServiceCopyTest {

    @Autowired
    CopyRepository copyRepository;

    @Autowired
    DbServiceCopy dbServiceCopy;

    @Autowired
    CopyMapper copyMapper;

    @Autowired
    BookRepository bookRepository;

    @Test
    public void getAllCopies() {
    }

    @Test
    public void getCopy() {
    }

    @Test
    public void saveCopy() {
    }

    @Test
    public void saveCopy2() {
            //Given


            //When


            //Then

    }

    @Test
    public void deleteCopy() {
    }
}