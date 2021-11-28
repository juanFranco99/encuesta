CREATE TABLE public.genero_musica (
      id serial NOT NULL,
      nombre_genero varchar NOT NULL,
      CONSTRAINT genero_musica_pk PRIMARY KEY (id)
);
COMMENT ON TABLE public.genero_musica IS 'Almacena los generos de musica registrados por el usiario';

CREATE TABLE public.respuesta_encuesta (
   email_usuario varchar NOT NULL,
   id_genero_musica int NOT NULL,
   CONSTRAINT respuesta_encuesta_pk PRIMARY KEY (email_usuario),
   CONSTRAINT respuesta_encuesta_fk FOREIGN KEY (id_genero_musica) REFERENCES public.genero_musica(id)
);
COMMENT ON TABLE public.respuesta_encuesta IS 'Almacena las respuestas de los usuarios';


