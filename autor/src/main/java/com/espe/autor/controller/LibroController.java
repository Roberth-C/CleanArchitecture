package com.espe.autor.controller;

import com.espe.autor.domain.Libro;
import com.espe.autor.use_cases.ListarLibros;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibroController {

    private final ListarLibros listarLibros;

    public LibroController(ListarLibros listarLibros) {
        this.listarLibros = listarLibros;
    }

    @GetMapping
    public ResponseEntity<List<Libro>> listarLibros() {
        List<Libro> libros = listarLibros.ejecutar();
        return ResponseEntity.ok(libros);
    }
}
