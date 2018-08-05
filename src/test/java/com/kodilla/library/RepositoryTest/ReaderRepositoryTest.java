package com.kodilla.library.RepositoryTest;

import com.kodilla.library.domain.Reader;
import com.kodilla.library.repository.ReaderRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ReaderRepositoryTest {

    @Autowired
    private ReaderRepository readerRepository;


    @Test
    public void testReaderRepositorySave() {
        //Given
        Reader reader = new Reader("James", "Bond");

        //When
        readerRepository.save(reader);

        //Then
        Long id = reader.getId();
        Optional<Reader> readReader = readerRepository.findById(id);
        Assert.assertEquals(id, readReader.get().getId());

        //CleanUp
        readerRepository.deleteById(id);
    }
}