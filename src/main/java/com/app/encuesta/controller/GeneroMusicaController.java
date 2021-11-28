package com.app.encuesta.controller;

import com.app.encuesta.model.GeneroMusica;
import com.app.encuesta.service.GeneroMusicaSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("v1/genero")
public class GeneroMusicaController extends GenericController {
    @Autowired
    private GeneroMusicaSerice service;

    @GetMapping
    public ResponseEntity<List<GeneroMusica>> list(){
        return ResponseEntity.ok().body(service.finAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id){
        try {
            GeneroMusica generoMusica = service.getById(id);
            return success(generoMusica);
        }catch (Exception e) {
            return badRequest(e);
        }
    }

    @PostMapping
    public ResponseEntity<?> add(@Valid @RequestBody GeneroMusica obj ) {
        try{
            GeneroMusica objAdd = service.add(obj);
            return success(objAdd);
        } catch (Exception e) {
            return badRequest(e);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody @Valid GeneroMusica obj) {
        try {
            GeneroMusica generoMusica = service.update(id, obj);
            return success(generoMusica);
        }catch (Exception e) {
            return badRequest(e);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        try {
            service.delete(id);
            return deleteRequest();
        }catch (Exception e) {
            return badRequest(e);
        }
    }

}
