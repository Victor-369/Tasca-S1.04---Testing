package com.pruebas.proyecto.nivell1.exercici1.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Library {
    private List<Book> booksCollection;

    public Library() {
        this.booksCollection = new ArrayList<>();
    }

    public void addBook(String title) {
        if (bookExistsInCollection(title)) {
            throw new IllegalArgumentException("A book with this title already exists in the collection.");
        } else {
            booksCollection.add(new Book(title));
        }
    }

    public List<Book> getAllBooks() {
        //validateExistsBooksInCollection();

        return List.copyOf(booksCollection);
    }

    public String getBookTitleByPosition(int position) {
        //validateExistsBooksInCollection();
        //validateIndex(position);

        return booksCollection.get(position).getTitle();
    }

    public void addBookInSpecificPosition(Book book, int position) {
        //validateExistsBooksInCollection();
        //validateIndex(position);

        booksCollection.add(position, book);
    }

    public boolean deleteBookByTitle(String title) {
        //validateExistsBooksInCollection();

        return booksCollection.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
    }

    public List<Book> getCopyOfOrderedList() {
        //validateExistsBooksInCollection();

        return List.copyOf(booksCollection.stream().sorted(Comparator.comparing(Book::getTitle)).toList());
    }


//    private void validateIndex(int position) {
//        if (!(position > 0 && position < booksCollection.size())) {
//            throw new IllegalArgumentException("There is no book at that position.");
//        }
//    }
//
//    public void validateExistsBooksInCollection() {
//        if (booksCollection.isEmpty()) {
//            throw new IllegalArgumentException("There are no books in the library.");
//        }
//    }

    private boolean bookExistsInCollection(String title) {
        return booksCollection.stream()
                .anyMatch(b -> b.getTitle().equals(title));
    }
}
