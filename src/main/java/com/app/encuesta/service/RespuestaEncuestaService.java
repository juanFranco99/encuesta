package com.app.encuesta.service;

import com.app.encuesta.exception.RecursoNoEncontradoException;
import com.app.encuesta.model.RespuestaEncuesta;
import com.app.encuesta.repository.RespuestaEncuestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RespuestaEncuestaService {

    @Autowired
    private RespuestaEncuestaRepository repository;

    public List<RespuestaEncuesta> finAll(){
        return repository.findAll();
    }

    public RespuestaEncuesta getById(String email_usuario){
        Optional<RespuestaEncuesta> opt = repository.findById(email_usuario);
        if(opt.isEmpty())  {
            throw new RecursoNoEncontradoException(String.format("El genero con el id %s no fue encontrado", email_usuario));
        }

        return opt.get();
    }

    public RespuestaEncuesta add(RespuestaEncuesta obj){
        repository.save(obj);
        return obj;
    }

    public RespuestaEncuesta update(String email_usuario, RespuestaEncuesta obj){
        Optional<RespuestaEncuesta> opt = repository.findById(email_usuario);
        if(opt.isEmpty()){
            throw new RecursoNoEncontradoException(String.format("El genero con el id %s no fue encontrado", email_usuario));
        }
        RespuestaEncuesta objUpdate = opt.get();
        objUpdate.setGeneroMusica(obj.getGeneroMusica());
        repository.save(objUpdate);
        return  objUpdate;
    }

    public void delete(String email_usuario){
        Optional<RespuestaEncuesta> opt = repository.findById(email_usuario);

        if(opt.isEmpty()){
            throw new RecursoNoEncontradoException(String.format("El genero con el id %s no fue encontrado", email_usuario));
        }

        repository.deleteById(email_usuario);

    }
}
