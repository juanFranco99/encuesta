package com.app.encuesta.controller;

import com.app.encuesta.model.RespuestaEncuesta;
import com.app.encuesta.service.RespuestaEncuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("v1/respuesta")
public class RespuestaEncuestaController extends GenericController{

    @Autowired
    private RespuestaEncuestaService service;

    @GetMapping
    public ResponseEntity<List<RespuestaEncuesta>> list(){
        return ResponseEntity.ok().body(service.finAll());
    }

    @GetMapping("/{email_usuario}")
    public ResponseEntity<?> getById(@PathVariable String email_usuario){
        try {
            RespuestaEncuesta respuestaEncuesta = service.getById(email_usuario);
            return success(respuestaEncuesta);
        }catch (Exception e) {
            return badRequest(e);
        }
    }

    @PostMapping
    public ResponseEntity<?> add(@Valid @RequestBody RespuestaEncuesta obj ) {
        try{
            RespuestaEncuesta objAdd = service.add(obj);
            return success(objAdd);
        } catch (Exception e) {
            return badRequest(e);
        }
    }

    @PutMapping("/{email_usuario}")
    public ResponseEntity<?> actualizar(@PathVariable String email_usuario, @RequestBody @Valid RespuestaEncuesta obj) {
        try {
            RespuestaEncuesta respuestaEncuesta = service.update(email_usuario, obj);
            return success(respuestaEncuesta);
        }catch (Exception e) {
            return badRequest(e);
        }
    }

    @DeleteMapping("/{email_usuario}")
    public ResponseEntity<?> delete(@PathVariable String email_usuario) {
        try {
            service.delete(email_usuario);
            return deleteRequest();
        }catch (Exception e) {
            return badRequest(e);
        }
    }
}
