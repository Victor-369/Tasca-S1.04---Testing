package com.pruebas.proyecto.nivell1.exercici1.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Library {
    private final List<Book> booksCollection;

    public Library() {
        this.booksCollection = new ArrayList<>();
    }

    public void addBook(String title) {
        validateBookDoesNotExist(title);

        booksCollection.add(new Book(title));
    }

    public List<Book> getAllBooks() {
        return List.copyOf(booksCollection);
    }

    public String getBookTitleByPosition(int position) {
        validateExistsBooksInCollection();
        validateReadIndex(position);

        return booksCollection.get(position).getTitle();
    }

    public void addBookInSpecificPosition(Book book, int position) {
        Objects.requireNonNull(book, "Book must not be null.");
        validateInsertIndex(position);
        validateBookDoesNotExist(book.getTitle());

        booksCollection.add(position, book);
    }

    public void deleteBookByTitle(String title) {
        validateExistsBooksInCollection();

        booksCollection.removeIf(book -> book.getTitle().equals(title));
    }

    public List<Book> getCopyOfOrderedList() {
        validateExistsBooksInCollection();

        return List.copyOf(booksCollection.stream().sorted(Comparator.comparing(Book::getTitle)).toList());
    }

    private void validateReadIndex(int position) {
        if (position < 0 || position >= booksCollection.size()) {
            throw new IllegalArgumentException("There is no book at that position.");
        }
    }

    private void validateInsertIndex(int position) {
        if (position < 0 || position > booksCollection.size()) {
            throw new IllegalArgumentException("Invalid position to insert a book.");
        }
    }

    public void validateExistsBooksInCollection() {
        if (booksCollection.isEmpty()) {
            throw new IllegalArgumentException("There are no books in the library.");
        }
    }

    private void validateBookDoesNotExist(String title) {
        boolean bookExistsInCollection = booksCollection.stream()
                .anyMatch(b -> b.getTitle().equals(title));

        if (bookExistsInCollection) {
            throw new IllegalArgumentException("A book with this title already exists in the collection.");
        }
    }
}
