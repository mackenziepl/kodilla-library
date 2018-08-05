package com.kodilla.library.RepositoryTest;

import com.kodilla.library.domain.Book;
import com.kodilla.library.domain.Copy;
import com.kodilla.library.repository.BookRepository;
import com.kodilla.library.repository.CopyRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CopyRepositoryTest {

    @Autowired
    private CopyRepository copyRepository;

    @Autowired
    private BookRepository bookRepository;

    @Test
    public void testCopyRepositoryFindStatus() {
        //Given
        Book book = new Book("Potop", "Henryk Sienkiewicz", 2000);
        Copy copy1 = new Copy("In library");
        Copy copy2 = new Copy("Unloan");
        book.getCopies().add(copy1);
        book.getCopies().add(copy2);
        copy1.setBook(book);
        copy2.setBook(book);

        //When
        bookRepository.save(book);
        List<Copy> readCopies = copyRepository.findByStatus("In library");

        //Then
        Assert.assertEquals(1, readCopies.size());
    }
}
