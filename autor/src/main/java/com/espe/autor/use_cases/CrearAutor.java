package com.espe.autor.use_cases;

import com.espe.autor.domain.Autor;
import com.espe.autor.domain.AutorRepository;
import org.springframework.stereotype.Service;

@Service
public class CrearAutor {
    private final AutorRepository autorRepository;

    public CrearAutor(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    public Autor ejecutar(String nombre, String apellido) {
        Autor autor = new Autor(nombre, apellido);
        return autorRepository.save(autor);
    }
}
