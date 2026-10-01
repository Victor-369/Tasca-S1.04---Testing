package com.pruebas.proyecto.nivell1.exercici1;

import com.pruebas.proyecto.nivell1.exercici1.model.Book;
import com.pruebas.proyecto.nivell1.exercici1.model.Library;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Main {
    //TODO: La col·lecció no ha de ser nul·la després d’instanciar la classe.
    @Test
    void booksCollectionIsNotNull() {
        // Arrange
        Library library = new Library();

        // Act
        List<Book> booksCollection = library.getAllBooks();

        // Assert
        assertNotNull(booksCollection, "Collection must be not null");
    }

    //TODO: La mida de la col·lecció és correcta després d’afegir diversos llibres.
    @Test
    void collectionSizeIsCorrect() {
        // Arrange
        Library library = new Library();

        // Act
        library.addBook("Book 1");
        library.addBook("Book 2");
        library.addBook("Book 3");

        // Assert
        assertEquals(3, library.getAllBooks().size());
    }

    //TODO: Els llibres es troben a la posició esperada un cop afegits.
    @Test
    void booksInRightPositionInCollection() {
        // Arrange
        Library library = new Library();

        // Act
        library.addBook("Book 1");
        library.addBook("Book 2");
        library.addBook("Book 3");

        // Assert
        assertEquals("Book 1", library.getBookTitleByPosition(0));
        assertEquals("Book 2", library.getBookTitleByPosition(1));
        assertEquals("Book 3", library.getBookTitleByPosition(2));
    }

    //TODO: El mètode per obtenir un llibre per posició retorna el títol correcte.
    @Test
    void bookInSpecificPositionGetsRightTitle() {
        // Arrange
        Library library = new Library();

        // Act
        library.addBook("Book 1");
        library.addBook("Book 2");
        library.addBook("Book 3");

        // Assert
        assertEquals("Book 2", library.getAllBooks().get(1).getTitle());
    }

    //TODO: Afegir un llibre en una posició concreta modifica correctament la col·lecció.
    @Test
    void addBookInSpecificPositionModifyCollectionRight() {
        // Arrange
        Library library = new Library();

        // Act
        library.addBook("Book 1");
        library.addBook("Book 2");
        library.addBook("Book 3");
        library.addBookInSpecificPosition(new Book("Book 4"), 2);

        // Assert
        assertEquals("Book 4", library.getAllBooks().get(2).getTitle());
        assertEquals("Book 3", library.getAllBooks().get(3).getTitle());
    }

    //TODO: Eliminar un llibre pel títol redueix la mida de la col·lecció.
    @Test
    void removeBookReducesCollectionSize() {
        // Arrange
        Library library = new Library();

        // Act
        library.addBook("Book 1");
        library.addBook("Book 2");
        library.addBook("Book 3");

        // Assert
        assertEquals(3, library.getAllBooks().size());
        library.deleteBookByTitle("Book 3");
        assertEquals(2, library.getAllBooks().size());
    }

    //TODO: La llista ordenada retorna els llibres en ordre alfabètic (sense modificar la col·lecció original).
    @Test
    void getOrderedListOfBookKeepingOriginalOrder() {
        // Arrange
        Library library = new Library();

        // Act
        library.addBook("Book 3");
        library.addBook("Book 5");
        library.addBook("Book 1");
        library.addBook("Book 4");
        library.addBook("Book 2");

        // Assert
        assertEquals("Book 3", library.getAllBooks().get(0).getTitle());
        assertEquals("Book 5", library.getAllBooks().get(1).getTitle());
        assertEquals("Book 1", library.getAllBooks().get(2).getTitle());
        assertEquals("Book 4", library.getAllBooks().get(3).getTitle());
        assertEquals("Book 2", library.getAllBooks().get(4).getTitle());

        List<Book> orderedCollection = library.getCopyOfOrderedList();
        assertEquals("Book 1", orderedCollection.get(0).getTitle());
        assertEquals("Book 2", orderedCollection.get(1).getTitle());
        assertEquals("Book 3", orderedCollection.get(2).getTitle());
        assertEquals("Book 4", orderedCollection.get(3).getTitle());
        assertEquals("Book 5", orderedCollection.get(4).getTitle());
    }

    //TODO: No s’han de permetre llibres amb títols duplicats.
    @Test
    void doNotAllowDuplicatedBooks() {
        // Arrange
        Library library = new Library();

        // Act
        library.addBook("Book 1");

        // Assert
        assertThrows(
                IllegalArgumentException.class,
                () -> library.addBook("Book 1")
        );

        assertEquals(1, library.getAllBooks().size());
    }
}
