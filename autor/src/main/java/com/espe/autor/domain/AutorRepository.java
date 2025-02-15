package com.espe.autor.domain;

import java.util.List;

public interface AutorRepository {
    Autor save(Autor autor);
    List<Autor> findAll();
    Autor findById(Long id);
    void deleteById(Long id);
}
