# Exercise 3: Exception handling

This exercise demonstrates how to trigger and test an expected exception in Java.

## Java class

- `ArrayExceptionExample.java` — provides `getElement(int position)`, which returns an element from an integer array. The array contains five elements, so positions outside the range `0` to `4` cause an `ArrayIndexOutOfBoundsException`.

## JUnit tests

- `src/test/java/com/pruebas/proyecto/nivell1/exercici3/ArrayExceptionExampleTest.java`

The tests use JUnit's `assertThrows` to verify that `getElement` throws an `ArrayIndexOutOfBoundsException` for a position beyond the end of the array and for a negative position.

Run this exercise's tests from the project root with:

```bash
mvn -Dtest=ArrayExceptionExampleTest test
```
