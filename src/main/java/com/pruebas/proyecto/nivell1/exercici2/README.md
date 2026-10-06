# Exercise 2: DNI letter calculation

This exercise calculates the Spanish DNI check letter from an eight-digit number and checks valid and invalid input.

## Java class

- `model/CalculateIdNumber.java` — exposes `calculateLetter(String number)`, which returns the number followed by its corresponding letter. Invalid formats, including negative and overlong numbers, cause an `IllegalArgumentException`.

## JUnit tests

- `CalculateIdNumberTest.java`

The tests check ten valid DNI numbers and their expected results (as a JUnit parameterised test with `@CsvSource`), a negative number and a number with more than eight digits.

Run this exercise's tests from the project root with:

```bash
mvn -Dtest=CalculateIdNumberTest test
```
