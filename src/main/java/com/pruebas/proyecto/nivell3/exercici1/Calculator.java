package com.pruebas.proyecto.nivell3.exercici1;

public class Calculator {
    private int total;

    public Calculator() {
        total = 0;
    }

    public int getTotal() {
        return total;
    }

    public void add(int value) {
        total += value;
    }

    public void subtract(int value) {
        total -= value;
    }

    public void multiply(int value) {
        total *= value;
    }

    public void divide(int value) {
        checkValueForDivision(value);

        total /= value;
    }

    public void reset() {
        total = 0;
    }

    private void checkValueForDivision(int value) {
        if (value == 0) throw new ArithmeticException("Value must be different of cero");
    }
}
