# Exercise 2: DNI letter calculation

This exercise calculates the Spanish DNI check letter from an eight-digit number and checks valid and invalid input.

## Java class

- `model/CalculateIdNumber.java` — exposes `calculateLetter(String number)`, which returns the number followed by its corresponding letter. Invalid formats, including negative and overlong numbers, cause an `IllegalArgumentException`.

## JUnit tests

- `CalculateIdNumberTest.java`

The tests check ten valid DNI numbers and their expected results, a negative number and a number with more than eight digits. The ten valid examples are currently checked in one test method; they are not yet expressed as a JUnit parameterised test.

Run this exercise's tests from the project root with:

```bash
mvn -Dtest=CalculateIdNumberTest test
```
