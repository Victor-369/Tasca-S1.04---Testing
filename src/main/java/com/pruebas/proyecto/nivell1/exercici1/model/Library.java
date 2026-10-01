package com.pruebas.proyecto.nivell1.exercici1.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Library {
    private final List<Book> booksCollection;

    public Library() {
        this.booksCollection = new ArrayList<>();
    }

    public void addBook(String title) {
        bookExistsInCollection(title);

        booksCollection.add(new Book(title));
    }

    public List<Book> getAllBooks() {
        return List.copyOf(booksCollection);
    }

    public String getBookTitleByPosition(int position) {
        validateExistsBooksInCollection();
        validateIndex(position);

        return booksCollection.get(position).getTitle();
    }

    public void addBookInSpecificPosition(Book book, int position) {
        validateExistsBooksInCollection();
        validateIndex(position);

        booksCollection.add(position, book);
    }

    public void deleteBookByTitle(String title) {
        validateExistsBooksInCollection();

        booksCollection.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
    }

    public List<Book> getCopyOfOrderedList() {
        validateExistsBooksInCollection();

        return List.copyOf(booksCollection.stream().sorted(Comparator.comparing(Book::getTitle)).toList());
    }


    private void validateIndex(int position) {
        if (position < 0 || position >= booksCollection.size()) {
            throw new IllegalArgumentException("There is no book at that position.");
        }
    }

    public void validateExistsBooksInCollection() {
        if (booksCollection.isEmpty()) {
            throw new IllegalArgumentException("There are no books in the library.");
        }
    }

    private void bookExistsInCollection(String title) {
        boolean bookExistsInCollection = booksCollection.stream()
                .anyMatch(b -> b.getTitle().equals(title));

        if (bookExistsInCollection) {
            throw new IllegalArgumentException("A book with this title already exists in the collection.");
        }
    }
}
