package com.app.encuesta.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Table(name = "genero_musica")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GeneroMusica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_genero")
    @NotBlank(message = "El nombre del genero debe ser informado")
    private String nombreGenero;


}