package com.espe.autor.infrastruture;

import com.espe.autor.domain.Autor;
import com.espe.autor.domain.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class AutorRepositoryImpl implements AutorRepository {

    @Autowired
    @Lazy
    private AutorRepository autorRepository;

    @SuppressWarnings("unchecked")
    @Override
    public Autor save(Autor autor) {
        return autorRepository.save(autor);
    }

    @Override
    public List<Autor> findAll() {
        return autorRepository.findAll();
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> ids) {
        throw new UnsupportedOperationException("Unimplemented method 'deleteAllByIdInBatch'");
    }

    @Override
    public void deleteAllInBatch() {
        throw new UnsupportedOperationException("Unimplemented method 'deleteAllInBatch'");
    }

    @Override
    public void deleteAllInBatch(Iterable<Autor> entities) {
        throw new UnsupportedOperationException("Unimplemented method 'deleteAllInBatch'");
    }

    @Override
    public <S extends Autor> List<S> findAll(Example<S> example) {
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public <S extends Autor> List<S> findAll(Example<S> example, Sort sort) {
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public void flush() {
        throw new UnsupportedOperationException("Unimplemented method 'flush'");
    }

    @Override
    public Autor getById(Long arg0) {
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public Autor getOne(Long arg0) {
        throw new UnsupportedOperationException("Unimplemented method 'getOne'");
    }

    @Override
    public Autor getReferenceById(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'getReferenceById'");
    }

    @Override
    public <S extends Autor> List<S> saveAllAndFlush(Iterable<S> entities) {
        throw new UnsupportedOperationException("Unimplemented method 'saveAllAndFlush'");
    }

    @Override
    public <S extends Autor> S saveAndFlush(S entity) {
        throw new UnsupportedOperationException("Unimplemented method 'saveAndFlush'");
    }

    @Override
    public List<Autor> findAllById(Iterable<Long> ids) {
        throw new UnsupportedOperationException("Unimplemented method 'findAllById'");
    }

    @Override
    public <S extends Autor> List<S> saveAll(Iterable<S> entities) {
        throw new UnsupportedOperationException("Unimplemented method 'saveAll'");
    }

    @Override
    public long count() {
        return autorRepository.count();
    }

    @Override
    public void delete(Autor entity) {
        autorRepository.delete(entity);
    }

    @Override
    public void deleteAll() {
        autorRepository.deleteAll();
    }

    @Override
    public void deleteAll(Iterable<? extends Autor> entities) {
        autorRepository.deleteAll(entities);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
        autorRepository.deleteAllById(ids);
    }

    @Override
    public void deleteById(Long id) {
        autorRepository.deleteById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return autorRepository.existsById(id);
    }

    @Override
    public Optional<Autor> findById(Long id) {
        return autorRepository.findById(id);
    }

    @Override
    public List<Autor> findAll(Sort sort) {
        return autorRepository.findAll(sort);
    }

    @Override
    public Page<Autor> findAll(Pageable pageable) {
        return autorRepository.findAll(pageable);
    }

    @Override
    public <S extends Autor> long count(Example<S> example) {
        throw new UnsupportedOperationException("Unimplemented method 'count'");
    }

    @Override
    public <S extends Autor> boolean exists(Example<S> example) {
        throw new UnsupportedOperationException("Unimplemented method 'exists'");
    }

    @Override
    public <S extends Autor> Page<S> findAll(Example<S> example, Pageable pageable) {
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public <S extends Autor, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
        throw new UnsupportedOperationException("Unimplemented method 'findBy'");
    }

    @Override
    public <S extends Autor> Optional<S> findOne(Example<S> example) {
        throw new UnsupportedOperationException("Unimplemented method 'findOne'");
    }
}
