package com.app.encuesta.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractAuditable;

import javax.persistence.*;

@Table(name = "respuesta_encuesta")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RespuestaEncuesta {

    @Id
    @Column(name = "email_usuario", nullable = false)
    private String emailUsuario;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_genero_musica", nullable = false)
    private GeneroMusica generoMusica;

}