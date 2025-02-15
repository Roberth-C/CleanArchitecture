package com.espe.autor.infrastruture;

import com.espe.autor.domain.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepositoryImpl extends JpaRepository<Libro, Long> {
    // JpaRepository ya tiene las implementaciones necesarias para las operaciones CRUD
}
