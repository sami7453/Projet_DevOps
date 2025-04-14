package com.example.book;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BookTests {

	@Test
	void testBookConstructorAndGetters() {
		Book book = new Book(1, "1984", "George Orwell", 1949);

		assertEquals(1, book.getId());
		assertEquals("1984", book.getTitle());
		assertEquals("George Orwell", book.getAuthor());
		assertEquals(1949, book.getYear());
	}

	@Test
	void testSetters() {
		Book book = new Book();
		book.setId(2);
		book.setTitle("Sapiens");
		book.setAuthor("Yuval Noah Harari");
		book.setYear(2011);

		assertEquals(2, book.getId());
		assertEquals("Sapiens", book.getTitle());
		assertEquals("Yuval Noah Harari", book.getAuthor());
		assertEquals(2011, book.getYear());
	}
}
