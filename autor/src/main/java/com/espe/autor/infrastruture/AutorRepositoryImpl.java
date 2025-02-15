package com.espe.autor.infrastruture;

import com.espe.autor.domain.Autor;
import com.espe.autor.domain.AutorRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AutorRepositoryImpl implements AutorRepository {
    private List<Autor> autores = new ArrayList<>();
    private Long idCounter = 1L;

    @Override
    public Autor save(Autor autor) {
        autor.setId(idCounter++);
        autores.add(autor);
        return autor;
    }

    @Override
    public List<Autor> findAll() {
        return autores;
    }

    @Override
    public Autor findById(Long id) {
        return autores.stream()
                .filter(autor -> autor.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        autores.removeIf(autor -> autor.getId().equals(id));
    }
}
