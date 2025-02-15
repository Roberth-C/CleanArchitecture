package com.espe.autor.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
    // Métodos CRUD proporcionados automáticamente por Spring Data JPA
}
