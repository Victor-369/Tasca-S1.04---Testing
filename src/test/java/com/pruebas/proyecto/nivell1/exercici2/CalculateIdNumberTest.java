package com.pruebas.proyecto.nivell1.exercici2;

import com.pruebas.proyecto.nivell1.exercici2.model.CalculateIdNumber;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculateIdNumberTest {
    @Test
    void check_correct_Id_numbers() {
        // Arrange
        CalculateIdNumber calculateIdNumber = new CalculateIdNumber();
        List<String> listOfIDs = new ArrayList<>();

        // Act
        listOfIDs.add(calculateIdNumber.calculateLetter("48213455"));
        listOfIDs.add(calculateIdNumber.calculateLetter("12345678"));
        listOfIDs.add(calculateIdNumber.calculateLetter("87654321"));
        listOfIDs.add(calculateIdNumber.calculateLetter("34567890"));
        listOfIDs.add(calculateIdNumber.calculateLetter("11111111"));
        listOfIDs.add(calculateIdNumber.calculateLetter("22222222"));
        listOfIDs.add(calculateIdNumber.calculateLetter("33333333"));
        listOfIDs.add(calculateIdNumber.calculateLetter("44444444"));
        listOfIDs.add(calculateIdNumber.calculateLetter("55555555"));
        listOfIDs.add(calculateIdNumber.calculateLetter("66666666"));

        // Assert
        assertEquals(listOfIDs.get(0), "48213455G");
        assertEquals(listOfIDs.get(1), "12345678Z");
        assertEquals(listOfIDs.get(2), "87654321X");
        assertEquals(listOfIDs.get(3), "34567890V");
        assertEquals(listOfIDs.get(4), "11111111H");
        assertEquals(listOfIDs.get(5), "22222222J");
        assertEquals(listOfIDs.get(6), "33333333P");
        assertEquals(listOfIDs.get(7), "44444444A");
        assertEquals(listOfIDs.get(8), "55555555K");
        assertEquals(listOfIDs.get(9), "66666666Q");
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
