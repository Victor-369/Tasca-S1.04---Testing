package com.pruebas.proyecto.nivell1.exercici2;

import com.pruebas.proyecto.nivell1.exercici2.model.CalculateIdNumber;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculateIdNumberTest {
    @ParameterizedTest
    @CsvSource({
            "48213455, 48213455G",
            "12345678, 12345678Z",
            "87654321, 87654321X",
            "34567890, 34567890V",
            "11111111, 11111111H",
            "22222222, 22222222J",
            "33333333, 33333333P",
            "44444444, 44444444A",
            "55555555, 55555555K",
            "66666666, 66666666Q"
    })

    void check_correct_Id_numbers(String number, String expected) {
        // Arrange
        CalculateIdNumber calculateIdNumber = new CalculateIdNumber();

        // Act
        String actual = calculateIdNumber.calculateLetter(number);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void check_negative_Id_number() {
        CalculateIdNumber calculateIdNumber = new CalculateIdNumber();

        assertThrows(
                IllegalArgumentException.class,
                () -> calculateIdNumber.calculateLetter("-66666666")
        );
    }

    @Test
    void check_Id_number_that_is_too_large() {
        CalculateIdNumber calculateIdNumber = new CalculateIdNumber();

        assertThrows(
                IllegalArgumentException.class,
                () -> calculateIdNumber.calculateLetter("100000000")
        );
    }
}
