-- public.genero_musica definition

-- Drop table

-- DROP TABLE public.genero_musica;

CREATE TABLE public.genero_musica
(
    id            serial4 NOT NULL,
    nombre_genero varchar NOT NULL
);

CREATE TABLE public.respuesta_encuesta (
                                           email_usuario varchar NOT NULL,
                                           id_genero_musica int NOT NULL,
                                           CONSTRAINT respuesta_encuesta_pk PRIMARY KEY (email_usuario),
                                           CONSTRAINT respuesta_encuesta_fk FOREIGN KEY (id_genero_musica) REFERENCES public.genero_musica(id)
);
COMMENT ON TABLE public.respuesta_encuesta IS 'Almacena las respuestas de los usuarios';

-- Column comments

COMMENT ON COLUMN public.respuesta_encuesta.email_usuario IS 'Email del usuario y PK';
COMMENT ON COLUMN public.respuesta_encuesta.id_genero_musica IS 'id genero de musica seleccionada por el usuario';
