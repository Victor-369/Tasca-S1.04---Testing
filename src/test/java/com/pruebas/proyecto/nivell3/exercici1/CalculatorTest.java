package com.pruebas.proyecto.nivell3.exercici1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void calculatorStartsWithTotalZero() {
        assertThat(calculator.getTotal()).isZero();
    }

    @Test
    void calculatorAdd() {
        calculator.add(10);
        calculator.add(3);

        assertThat(calculator.getTotal()).isEqualTo(13);
    }

    @Test
    void calculatorSubtract() {
        calculator.add(10);
        calculator.subtract(3);

        assertThat(calculator.getTotal()).isEqualTo(7);
    }

    @Test
    void calculatorMultiply() {
        calculator.add(3);
        calculator.multiply(10);

        assertThat(calculator.getTotal()).isEqualTo(30);
    }

    @Test
    void calculatorDivide() {
        calculator.add(10);
        calculator.divide(2);

        assertThat(calculator.getTotal()).isEqualTo(5);
    }

    @Test
    void calculatorDivideByZero() {
        Assertions.assertThatThrownBy(() -> {
            calculator.divide(0);
        }).isInstanceOf(ArithmeticException.class);
    }

    @Test
    void calculatorReset() {
        calculator.add(3434);
        calculator.reset();

        assertThat(calculator.getTotal()).isZero();
    }
}
