package com.espe.autor.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Long> {
    // Los métodos CRUD son manejados automáticamente por Spring Data JPA
}
