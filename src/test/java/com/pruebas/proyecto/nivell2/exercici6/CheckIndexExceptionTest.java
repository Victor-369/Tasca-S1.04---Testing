package com.pruebas.proyecto.nivell2.exercici6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;


class CheckIndexExceptionTest {
    @Test
    void checkArrayIndexOutOfBoundsException() {
        int[] numbers = {1, 2, 3};

        assertThatThrownBy(() -> {
            int number = numbers[10];
                }).isInstanceOf(ArrayIndexOutOfBoundsException.class);
    }
}
