package com.pruebas.proyecto.nivell1.exercici2.model;

public class CalculateIdNumber {
    public String calculateLetter(String number) {
        validateNumber(number);

        int idNumber = Integer.parseInt(number);
        String letters = "TRWAGMYFPDXBNJZSQVHLCKE";

        return number + letters.charAt(idNumber % letters.length());
    }

    private void validateNumber(String number) {
        if (number == null || !number.matches("\\d{8}")) {
            throw new IllegalArgumentException("Wrong format of number");
        }
    }
}
