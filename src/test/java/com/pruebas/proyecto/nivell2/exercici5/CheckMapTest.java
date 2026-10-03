package com.pruebas.proyecto.nivell2.exercici5;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class CheckMapTest {
    @Test
    void checkKey() {
        Map<String, String> newMap = new HashMap<>();

        newMap.put("name", "John");
        newMap.put("country", "USA");

        assertThat(newMap).containsKey("country");
    }
}
