package com.pruebas.proyecto.nivell2.exercici1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class IntegerExampleTest {
    @Test
    void bothAreEquals() {
        Integer valueA = 10;
        Integer valueB = 10;

        assertThat(valueA)
                .isEqualTo(valueB);
    }

    @Test
    void bothAreNotEquals() {
        Integer valueA = 10;
        Integer valueB = 30;

        assertThat(valueA)
                .isNotEqualTo(valueB);
    }
}
