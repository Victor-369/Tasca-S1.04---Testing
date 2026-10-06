# Exercise 1: Library unit tests

This exercise implements a library collection and uses JUnit tests to check its behaviour.

## Java classes

- `model/Book.java` — represents a book by its title.
- `model/Library.java` — manages the collection of books.

The `Library` class supports adding books, retrieving the collection in insertion order, getting a title by position, inserting a book at a position (including at the end), removing books by exact title and returning an alphabetically sorted copy. Duplicate titles are rejected, both when adding at the end and when inserting at a specific position. Title comparison is case-sensitive.

## JUnit tests

- `LibraryTest.java`

The tests check that the collection is initialised, its size and insertion order are correct, titles can be retrieved by position, insertion and deletion work, the sorted copy does not change the original order, and duplicate titles are rejected.

Run this exercise's tests from the project root with:

```bash
mvn -Dtest=LibraryTest test
```
