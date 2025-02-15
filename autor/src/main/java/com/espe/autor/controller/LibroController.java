package com.espe.autor.controller;

import com.espe.autor.domain.Libro;
import com.espe.autor.use_cases.CrearLibro;
import com.espe.autor.use_cases.ListarLibros;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibroController {

    private final CrearLibro crearLibro;
    private final ListarLibros listarLibros;

    public LibroController(CrearLibro crearLibro, ListarLibros listarLibros) {
        this.crearLibro = crearLibro;
        this.listarLibros = listarLibros;
    }

    @PostMapping
    public ResponseEntity<Libro> crearLibro(@RequestBody Libro libro) {
        Libro libroCreado = crearLibro.ejecutar(libro.getTitulo(), libro.getAutor(), libro.getIsbn());
        return ResponseEntity.status(201).body(libroCreado);
    }

    @GetMapping
    public ResponseEntity<List<Libro>> listarLibros() {
        List<Libro> libros = listarLibros.ejecutar();
        return ResponseEntity.ok(libros);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Libro> obtenerLibro(@PathVariable Long id) {
        Libro libro = listarLibros.ejecutar().stream()
                .filter(l -> l.getId().equals(id))
                .findFirst()
                .orElse(null);
        if (libro == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(libro);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarLibro(@PathVariable Long id) {
        Libro libro = listarLibros.ejecutar().stream()
                .filter(l -> l.getId().equals(id))
                .findFirst()
                .orElse(null);
        if (libro == null) {
            return ResponseEntity.notFound().build();
        }
        crearLibro.eliminar(libro); // Aquí es donde debe llamarse el método eliminar
        return ResponseEntity.noContent().build();
    }
}
