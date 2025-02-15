package com.espe.autor.use_cases;

import com.espe.autor.domain.Libro;
import com.espe.autor.domain.LibroRepository;
import org.springframework.stereotype.Service;

@Service
public class CrearLibro {

    private final LibroRepository libroRepository;

    public CrearLibro(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    public Libro ejecutar(String titulo, String autor, String isbn) {
        Libro libro = new Libro(titulo, autor, isbn);
        return libroRepository.save(libro);
    }

    // Método para eliminar un libro
    public void eliminar(Libro libro) {
        libroRepository.deleteById(libro.getId());  // Elimina el libro por su ID
    }
}
