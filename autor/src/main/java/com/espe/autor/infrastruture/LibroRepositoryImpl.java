package com.espe.autor.infrastruture;

import com.espe.autor.domain.Libro;
import com.espe.autor.domain.LibroRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LibroRepositoryImpl implements LibroRepository {
    private List<Libro> libros = new ArrayList<>();
    private Long idCounter = 1L;

    @Override
    public Libro save(Libro libro) {
        libro.setId(idCounter++);
        libros.add(libro);
        return libro;
    }

    @Override
    public List<Libro> findAll() {
        return libros;
    }

    @Override
    public Libro findById(Long id) {
        return libros.stream()
                .filter(libro -> libro.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        libros.removeIf(libro -> libro.getId().equals(id));
    }
}
