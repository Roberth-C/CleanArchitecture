package com.espe.autor.use_cases;

import com.espe.autor.domain.Libro;
import com.espe.autor.domain.LibroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListarLibros {
    private final LibroRepository libroRepository;

    public ListarLibros(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    public List<Libro> ejecutar() {
        return libroRepository.findAll();
    }
}
