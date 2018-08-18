package com.kodilla.library.RepositoryTest;

import com.kodilla.library.domain.Book;
import com.kodilla.library.domain.Copy;
import com.kodilla.library.domain.Loan;
import com.kodilla.library.domain.Reader;
import com.kodilla.library.repository.BookRepository;
import com.kodilla.library.repository.CopyRepository;
import com.kodilla.library.repository.LoanRepository;
import com.kodilla.library.repository.ReaderRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.List;

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
        //Given
        Reader reader = new Reader("James", "Bond");
        Book book = new Book("Potop", "Henryk Sienkiewicz", 2000);
        Copy copy = new Copy(1L, "In library", "Potop");

        Loan loan = new Loan();
        loan.setReader(reader);
        loan.setCopy(copy);

        //When
        loanRepository.save(loan);
        Long id = loan.getId();

        List<Loan> quantity = loanRepository.findAll();


        //Then
        Assert.assertEquals(1, quantity.size());

        //CleanUp
        loanRepository.deleteById(id);
    }

    @Test
    public void testLoanUpdateReturnOfDate() {
        //Given
        Reader reader = new Reader("James", "Bond");
        Book book = new Book("Potop", "Henryk Sienkiewicz", 2000);
        Copy copy = new Copy(1L, "In library", "Potop");

        Loan loan = new Loan();
        loan.setReader(reader);
        loan.setCopy(copy);
        Long id = loan.getId();

        //When
        loanRepository.save(loan);
        loan.setReturnOfDate(LocalDate.now());
        loanRepository.save(loan);


        List<Loan> quantity = loanRepository.findAll();


        //Then
        Assert.assertEquals(1, quantity.size());

        //CleanUp
        loanRepository.deleteById(id);
    }
}
