package pl.sdacademy.unit.test.basic.exercises.tdd.task4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BasketTest {

    @Test
    void shouldReturnAllAddedBooksFromBasket() {
        //given
        Basket basket = new Basket(3);
        Book book1 = new Book("abc", new Author("aaa", "bbb"), 50);
        Book book2 = new Book("cba", new Author("ccc", "ddd"), 75);
        Book book3 = new Book("qwerty", new Author("eee", "fff"), 100);
        basket.addBook(book1);
        basket.addBook(book2);
        basket.addBook(book3);
        //when
        Book[] result = basket.getAllBooks();
        //then
        Book[] expectedResult = {book1, book2, book3};
        assertArrayEquals(expectedResult, result);
        assertThat(result).isEqualTo(expectedResult);

    }

    @Test
    void shouldRemoveAllAddedBooksFromBasket() {
        //given
        Basket basket = new Basket(3);
        Book book1 = new Book("abc", new Author("aaa", "bbb"), 50);
        Book book2 = new Book("cba", new Author("ccc", "ddd"), 75);
        Book book3 = new Book("qwerty", new Author("eee", "fff"), 100);
        basket.addBook(book1);
        basket.addBook(book2);
        basket.addBook(book3);
        //when
        basket.cleanBasket();
        Book[] result = basket.getAllBooks();
        //then
        Book[] expectedResult = {null, null, null};
        assertArrayEquals(expectedResult, result);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldReturnTotalAmount() {
        //given
        Basket basket = new Basket(3);
        Book book1 = new Book("abc", new Author("aaa", "bbb"), 50);
        Book book2 = new Book("cba", new Author("ccc", "ddd"), 75);
        Book book3 = new Book("qwerty", new Author("eee", "fff"), 100);
        basket.addBook(book1);
        basket.addBook(book2);
        basket.addBook(book3);
        //when
        float result = basket.getTotalAmount();
        //then
        assertEquals(225, result);
        assertThat(result).isEqualTo(225);
    }

    @Test
    void shouldNotAddBookWhenBasketIsFull() {
        //given
        Basket basket = new Basket(2);
        Book book1 = new Book("abc", new Author("aaa", "bbb"), 50);
        Book book2 = new Book("cba", new Author("ccc", "ddd"), 75);
        basket.addBook(book1);
        basket.addBook(book2);
        //when
        Book book3 = new Book("qwerty", new Author("eee", "fff"), 100);
        boolean result = basket.addBook(book3);
        //
        assertFalse(result);
        assertThat(result).isFalse();
    }

    @Test
    void shouldAddBookWhenBasketIsNotFull() {
        //given
        Basket basket = new Basket(2);
        //when
        Book book1 = new Book("qwerty", new Author("eee", "fff"), 100);
        boolean result = basket.addBook(book1);
        //
        assertTrue(result);
        assertThat(result).isTrue();
    }
}