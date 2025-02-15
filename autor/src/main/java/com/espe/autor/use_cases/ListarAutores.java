package com.espe.autor.use_cases;

import com.espe.autor.domain.Autor;
import com.espe.autor.domain.AutorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListarAutores {
    private final AutorRepository autorRepository;

    public ListarAutores(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    public List<Autor> ejecutar() {
        return autorRepository.findAll();
    }
}
