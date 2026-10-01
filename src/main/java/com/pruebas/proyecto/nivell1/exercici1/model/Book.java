package com.pruebas.proyecto.nivell1.exercici1.model;

import java.util.Objects;

public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() { return title; }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (this == o) return true;
        Book book = (Book) o;
        return Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(title);
    }
}
