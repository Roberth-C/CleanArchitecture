package com.espe.autor.infrastruture;

import com.espe.autor.domain.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepositoryImpl extends JpaRepository<Autor, Long> {
    // JpaRepository ya tiene las implementaciones necesarias para las operaciones CRUD
}
