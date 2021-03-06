//package com.kodilla.library.RepositoryTest;
//
//import com.kodilla.library.repository.BookRepository;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class BookRepositoryTest {
//
//    @Autowired
//    private BookRepository bookRepository;
//
//    @Test
//    public void testBookRepositorySave() {
//        //Given
//        Book book = new Book("Potop", "Henryk Sienkiewicz", 2000);
//
//        //When
//        bookRepository.save(book);
//
//        //Then
//        Long id = book.getId();
//        Optional<Book> readBook = bookRepository.findById(id);
//        Assert.assertEquals(id, readBook.get().getId());
//
//        //CleanUp
//        bookRepository.deleteById(id);
//    }
//
//    @Test
//    public void testBookSaveWithCopies() {
//        //Given
//        Book book = new Book("Potop", "Henryk Sienkiewicz", 2000);
//        Copy copy1 = new Copy(1L, "In library", "Potop");
//        Copy copy2 = new Copy(2L, "Unloan", "Potop");
//        book.getCopies().add(copy1);
//        book.getCopies().add(copy2);
//        copy1.setBook(book);
//        copy2.setBook(book);
//
//        //When
//        bookRepository.save(book);
//        long id = book.getId();
//
//        //Then
//        Assert.assertNotEquals(0, id);
//    }
//}
