package com.app.encuesta.repository;

import com.app.encuesta.model.RespuestaEncuesta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RespuestaEncuestaRepository extends JpaRepository<RespuestaEncuesta, String> {
}