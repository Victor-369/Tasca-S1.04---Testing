package com.pruebas.proyecto.nivell2.exercici2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ObjectReferenceTest {
    @Test
    void shouldBeSameObject() {
        String firstText = new String("Hello!");
        String secondText = firstText;

        assertThat(firstText)
                .isSameAs(secondText);
    }

    @Test
    void shouldBeDifferentObject() {
        String firstText = new String("Hello!");
        String secondText = new String("Hello!");

        assertThat(firstText)
                .isNotSameAs(secondText);
    }
}
