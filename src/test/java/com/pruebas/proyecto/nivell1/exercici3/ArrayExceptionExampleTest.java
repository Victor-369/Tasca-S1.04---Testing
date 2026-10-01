package com.pruebas.proyecto.nivell1.exercici3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class ArrayExceptionExampleTest {
    private final ArrayExceptionExample example = new ArrayExceptionExample();

    @Test
    void getElement_positionTooLarge_throwsException() {
        assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> example.getElement(10));
    }

    @Test
    void getElement_negativePosition_throwsException() {
        assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> example.getElement(-1));
    }
}
