package com.espe.autor.controller;

import com.espe.autor.domain.Autor;
import com.espe.autor.use_cases.CrearAutor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/autores")
public class AutorController {
    private final CrearAutor crearAutor;

    public AutorController(CrearAutor crearAutor) {
        this.crearAutor = crearAutor;
    }

    @PostMapping
    public ResponseEntity<Autor> crearAutor(@RequestBody Autor autor) {
        Autor autorCreado = crearAutor.ejecutar(autor.getNombre(), autor.getApellido());
        return ResponseEntity.status(201).body(autorCreado);
    }
}
