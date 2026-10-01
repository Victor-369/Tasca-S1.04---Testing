# Tasca S1.04 - Testing

This repository contains Java exercises introducing unit testing with JUnit and Maven.

## Exercises

1. [Exercise 1: Library unit tests](src/main/java/com/pruebas/proyecto/nivell1/exercici1/README.md) — manage a library collection and test its behaviour with JUnit.
2. [Exercise 2: DNI letter calculation](src/main/java/com/pruebas/proyecto/nivell1/exercici2/README.md) — calculate the letter for a Spanish DNI number and test valid and invalid input.
3. [Exercise 3: Exception handling](src/main/java/com/pruebas/proyecto/nivell1/exercici3/README.md) — test that accessing an invalid array position throws the expected exception.

## Project structure

```text
src/
├── main/java/com/pruebas/proyecto/nivell1/
│   ├── exercici1/model/       # Book and Library
│   ├── exercici2/model/       # CalculateIdNumber
│   └── exercici3/             # ArrayExceptionExample
└── test/java/com/pruebas/proyecto/nivell1/
    ├── exercici1/             # LibraryTest
    ├── exercici2/             # CalculateIdNumberTest
    └── exercici3/             # ArrayExceptionExampleTest
```

## Requirements and running the tests

The project uses Maven, JUnit Jupiter and Java 25. From the project root, run all tests with:

```bash
mvn test
```

See the exercise-specific README files for source paths and test coverage.
