package com.example.book;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private List<Book> bookList = new ArrayList<>();

    public BookController() {
        bookList.add(new Book(1, "1984", "George Orwell", 1949));
        bookList.add(new Book(2, "Le Meilleur des Mondes", "Aldous Huxley", 1932));
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookList;
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable int id) {
        return bookList.stream()
                .filter(book -> book.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @PostMapping
    public void addBook(@RequestBody Book book) {
        bookList.add(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable int id) {
        bookList.removeIf(book -> book.getId() == id);
    }
}
