package com.espe.autor.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Libro {

    @Id
    private Long id;
    private String titulo;
    private String autor;

    // Constructor, Getters y Setters
    public Libro() {}

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
