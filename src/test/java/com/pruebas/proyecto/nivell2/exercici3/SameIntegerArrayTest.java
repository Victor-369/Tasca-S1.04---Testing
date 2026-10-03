package com.pruebas.proyecto.nivell2.exercici3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SameIntegerArrayTest {
    @Test
    void bothAreSame() {
        int[] arrayOne = {1, 2, 3, 4, 5, 6};
        int[] arrayTwo = {1, 2, 3, 4, 5, 6};

        assertThat(arrayOne)
                .containsExactly(arrayTwo);
    }
}
