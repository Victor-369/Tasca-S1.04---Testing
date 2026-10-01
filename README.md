# IT Academy: Testing

This repository contains two Java exercises introducing unit testing with JUnit and Maven.

## Exercises

1. [Exercise 1: Library unit tests](src/main/java/com/pruebas/proyecto/nivell1/exercici1/README.md) — manage a library collection and test its behaviour with JUnit.
2. [Exercise 2: DNI letter calculation](src/main/java/com/pruebas/proyecto/nivell1/exercici2/README.md) — calculate the letter for a Spanish DNI number and test valid and invalid input.

## Project structure

```text
src/
├── main/java/com/pruebas/proyecto/nivell1/
│   ├── exercici1/model/       # Book and Library
│   └── exercici2/model/       # CalculateIdNumber
└── test/java/com/pruebas/proyecto/nivell1/
    ├── exercici1/             # LibraryTest
    └── exercici2/             # CalculateIdNumberTest
```

## Requirements and running the tests

The project uses Maven, JUnit Jupiter and Java 25. From the project root, run all tests with:

```bash
mvn test
```

See the exercise-specific README files for source paths and test coverage.
