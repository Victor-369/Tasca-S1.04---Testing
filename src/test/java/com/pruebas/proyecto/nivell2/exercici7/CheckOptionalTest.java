package com.pruebas.proyecto.nivell2.exercici7;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

class CheckOptionalTest {
    @Test
    void checkOptional() {
        Optional<Integer> optionalEmpty = Optional.empty();

        assertThat(optionalEmpty).isEmpty();
    }
}
