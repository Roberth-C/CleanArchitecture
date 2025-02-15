package com.espe.autor.controller;

import com.espe.autor.domain.Autor;
import com.espe.autor.use_cases.CrearAutor;
import com.espe.autor.use_cases.ListarAutores;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autores")
public class AutorController {

    private final CrearAutor crearAutor;
    private final ListarAutores listarAutores;

    public AutorController(CrearAutor crearAutor, ListarAutores listarAutores) {
        this.crearAutor = crearAutor;
        this.listarAutores = listarAutores;
    }

    @PostMapping
    public ResponseEntity<Autor> crearAutor(@RequestBody Autor autor) {
        Autor autorCreado = crearAutor.ejecutar(autor.getNombre(), autor.getApellido());
        return ResponseEntity.status(201).body(autorCreado);
    }

    @GetMapping
    public ResponseEntity<List<Autor>> listarAutores() {
        List<Autor> autores = listarAutores.ejecutar();
        return ResponseEntity.ok(autores);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Autor> obtenerAutor(@PathVariable Long id) {
        Autor autor = listarAutores.ejecutar().stream()
                .filter(a -> a.getId().equals(id))
                .findFirst()
                .orElse(null);
        if (autor == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(autor);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarAutor(@PathVariable Long id) {
        Autor autor = listarAutores.ejecutar().stream()
                .filter(a -> a.getId().equals(id))
                .findFirst()
                .orElse(null);
        if (autor == null) {
            return ResponseEntity.notFound().build();
        }
        crearAutor.eliminar(autor); 
        return ResponseEntity.noContent().build();
    }
}
