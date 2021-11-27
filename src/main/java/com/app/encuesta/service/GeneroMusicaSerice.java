package com.app.encuesta.service;

import com.app.encuesta.exception.RecursoNoEncontradoException;
import com.app.encuesta.model.GeneroMusica;
import com.app.encuesta.repository.GeneroMusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GeneroMusicaSerice {

    @Autowired
    private GeneroMusicaRepository repository;

    public List<GeneroMusica> finAll(){
        return repository.findAll();
    }

    public GeneroMusica getById(Long id){
        Optional<GeneroMusica> opt = repository.findById(id);
        if(!opt.isPresent())  {
            throw new RecursoNoEncontradoException(String.format("El genero con el id %s no fue encontrado", id));
        }

        return opt.get();
    }

    public GeneroMusica add(GeneroMusica obj){
        repository.save(obj);
        return obj;
    }

    public GeneroMusica update(Long id, GeneroMusica obj){
        Optional<GeneroMusica> opt = repository.findById(id);
        if(!opt.isPresent()){
            throw new RecursoNoEncontradoException(String.format("El genero con el id %s no fue encontrado", id));
        }
        GeneroMusica objUpdate = opt.get();
        objUpdate.setNombreGenero(obj.getNombreGenero());
        repository.save(objUpdate);
        return  objUpdate;
    }

    public void delete(Long id){
        Optional<GeneroMusica> opt = repository.findById(id);

        if(!opt.isPresent()){
            throw new RecursoNoEncontradoException(String.format("El genero con el id %s no fue encontrado", id));
        }

        repository.deleteById(id);

    }
}
