package com.pruebas.proyecto.nivell2.exercici4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CheckListTest {
    @Test
    void checksObjectsInList() {
        String name = "John";
        Integer age = 33;
        Double salary = 3455.00;

        List<Object> listObjects = new ArrayList<>(List.of(name, age, salary));

        assertThat(listObjects)
                .containsExactly(name, age, salary);

        assertThat(listObjects)
                .containsExactlyInAnyOrder(salary, age, name);

        assertThat(listObjects)
                .containsOnlyOnce(age);

        listObjects.remove(name);
        assertThat(listObjects)
                .doesNotContain(name);
    }
}
