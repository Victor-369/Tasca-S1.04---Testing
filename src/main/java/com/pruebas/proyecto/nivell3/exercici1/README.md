# Level 3, Exercise 1: Calculator (TDD)

This exercise uses Test-Driven Development (TDD) to build a calculator with an internal state, one small step at a time. Each test describes a single behaviour, and the `Calculator` class grows only as far as the tests require.

## Objective

To apply the **Red → Green → Refactor** cycle and let the tests shape the design of the class:

1. 🔴 **Red** — write one small, failing test.
2. 🟢 **Green** — write the minimum code needed to make it pass.
3. ♻️ **Refactor** — tidy up the code while keeping all tests green.

## Java classes

- `Calculator.java` — keeps a running total, which starts at `0`.

| Method | Behaviour |
| --- | --- |
| `getTotal()` | Returns the current total. |
| `add(x)` | Increases the total by `x`. |
| `subtract(x)` | Decreases the total by `x`. |
| `multiply(x)` | Multiplies the total by `x`. |
| `divide(x)` | Divides the total by `x`. Throws an `ArithmeticException` if `x` is zero. |
| `reset()` | Sets the total back to `0`. |

## JUnit tests

- `CalculatorTest.java`

The tests were written one at a time, in this order, and together they cover every behaviour above:

1. The initial total is `0`.
2. `add(x)` increases the total.
3. `subtract(x)` decreases the total.
4. `multiply(x)` multiplies the total by the given value.
5. `divide(x)` updates the total correctly.
6. Dividing by zero throws an `ArithmeticException`.
7. `reset()` returns the total to `0`.
8. `getTotal()` returns the current total after a series of operations.

Run this exercise's tests from the project root with:

```
mvn -Dtest=CalculatorTest test
```

## Commit convention

Commit messages are short, descriptive and written in English, using a prefix to show the type of change:

```
test: initialise with total 0
feat: implement add method
```

## Key takeaways

- Write one test for one behaviour; there is no need to plan every test in advance.
- Keep the class simple and focused on a clear responsibility.
- Tests do more than validate the code: they define it.