package com.espe.autor.domain;

import java.util.List;

public interface LibroRepository {
    Libro save(Libro libro);
    List<Libro> findAll();
    Libro findById(Long id);
    void deleteById(Long id);
}
