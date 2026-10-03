# Tasca S1.04 - Testing

This repository contains Java exercises introducing unit testing with JUnit and Maven, progressing from basic unit tests to Test-Driven Development (TDD).

## Exercises

### Level 1: Unit testing basics

1. [Exercise 1: Library unit tests](src/main/java/com/pruebas/proyecto/nivell1/exercici1/README.md) — manage a library collection and test its behaviour with JUnit.
2. [Exercise 2: DNI letter calculation](src/main/java/com/pruebas/proyecto/nivell1/exercici2/README.md) — calculate the letter for a Spanish DNI number and test valid and invalid input.
3. [Exercise 3: Exception handling](src/main/java/com/pruebas/proyecto/nivell1/exercici3/README.md) — test that accessing an invalid array position throws the expected exception.

### Level 3: Test-Driven Development

1. [Exercise 1: Calculator](src/main/java/com/pruebas/proyecto/nivell3/exercici1/README.md) — build a calculator with an internal total step by step, following the Red → Green → Refactor cycle.

## Project structure

```
src/
├── main/java/com/pruebas/proyecto/
│   ├── nivell1/
│   │   ├── exercici1/model/       # Book and Library
│   │   ├── exercici2/model/       # CalculateIdNumber
│   │   └── exercici3/             # ArrayExceptionExample
│   └── nivell3/
│       └── exercici1/             # Calculator
└── test/java/com/pruebas/proyecto/
    ├── nivell1/
    │   ├── exercici1/             # LibraryTest
    │   ├── exercici2/             # CalculateIdNumberTest
    │   └── exercici3/             # ArrayExceptionExampleTest
    └── nivell3/
        └── exercici1/             # CalculatorTest
```

## Requirements and running the tests

The project uses Maven, JUnit Jupiter and Java 25. From the project root, run all tests with:

```
mvn test
```

To run the tests for a single exercise, pass the test class name, for example:

```
mvn -Dtest=CalculatorTest test
```

See the exercise-specific README files for source paths and test coverage.

## Licence

This project is released under the [MIT Licence](LICENSE).