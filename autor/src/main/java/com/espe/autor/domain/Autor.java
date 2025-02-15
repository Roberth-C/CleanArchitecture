package com.espe.autor.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Autor {

    @Id
    private Long id;
    private String nombre;
    private String apellido;

    // Constructor, Getters y Setters
    public Autor() {}

    public Autor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
