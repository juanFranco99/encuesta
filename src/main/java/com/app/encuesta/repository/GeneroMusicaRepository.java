package com.app.encuesta.repository;

import com.app.encuesta.model.GeneroMusica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeneroMusicaRepository extends JpaRepository<GeneroMusica, Long> {
}