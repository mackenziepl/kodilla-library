package com.kodilla.library.RepositoryTest;

import com.kodilla.library.repository.BookRepository;
import com.kodilla.library.repository.CopyRepository;
import com.kodilla.library.repository.LoanRepository;
import com.kodilla.library.repository.ReaderRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoanRepositoryTest {

    @Autowired
    LoanRepository loanRepository;

    @Autowired
    ReaderRepository readerRepository;

    @Autowired
    BookRepository bookRepository;

    @Autowired
    CopyRepository copyRepository;

    @Test
    public void testLoanRepositoryFind() {
//        //Given
//        Reader reader = new Reader("James", "Bond");
//        Book book = new Book("Potop", "Henryk Sienkiewicz", 2000);
//        Copy copy = new Copy("In library");
//        book.getCopies().add(copy);
//        copy.setBook(book);
//        Loan loan = new Loan();
//        loan.setCopy(copy);
//        loan.setReader(reader);
//
//
//        //When
//
//        //bookRepository.save(book);
//        copyRepository.save(copy);
//        //readerRepository.save(reader);
//        loanRepository.save(loan);
//        List<Loan> quantity = loanRepository.findAll();
//
//        //Then
//        Assert.assertEquals(1, quantity.size());
    }
}
