package com.app.encuesta.repository;

import com.app.encuesta.model.RespuestaEncuesta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RespuestaEncuestaRepository extends JpaRepository<RespuestaEncuesta, String> {
    @Query(value = "select count(gm.nombre_genero), gm.nombre_genero from genero_musica gm  \n" +
            "join respuesta_encuesta re \n" +
            "on gm.id = re.id_genero_musica \n" +
            "group by gm.nombre_genero \n" +
            "order by gm.nombre_genero ", nativeQuery = true)
    List<Object[]> getResumenEncuesta();

}