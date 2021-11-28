--AGREGANDO GENEROS DE MUSICA
INSERT INTO public.genero_musica(nombre_genero)VALUES('Pop');
INSERT INTO public.genero_musica(nombre_genero)VALUES('Rock');
INSERT INTO public.genero_musica(nombre_genero)VALUES('Jazz');
INSERT INTO public.genero_musica(nombre_genero)VALUES('Electronica');
INSERT INTO public.genero_musica(nombre_genero)VALUES('Bachata');

--AGREGANDO RESPUESTAS DE USUARIOS
INSERT INTO public.respuesta_encuesta(email_usuario, id_genero_musica)VALUES('teste@test.com', 1);
INSERT INTO public.respuesta_encuesta(email_usuario, id_genero_musica)VALUES('teste2@test.com', 1);
INSERT INTO public.respuesta_encuesta(email_usuario, id_genero_musica)VALUES('teste3@test.com', 4);
INSERT INTO public.respuesta_encuesta(email_usuario, id_genero_musica)VALUES('teste4@test.com', 2);
INSERT INTO public.respuesta_encuesta(email_usuario, id_genero_musica)VALUES('teste5@test.com', 5);
INSERT INTO public.respuesta_encuesta(email_usuario, id_genero_musica)VALUES('teste7@test.com', 3);
INSERT INTO public.respuesta_encuesta(email_usuario, id_genero_musica)VALUES('teste8@test.com', 2);
INSERT INTO public.respuesta_encuesta(email_usuario, id_genero_musica)VALUES('teste9@test.com', 2);
INSERT INTO public.respuesta_encuesta(email_usuario, id_genero_musica)VALUES('teste10@test.com', 3);
INSERT INTO public.respuesta_encuesta(email_usuario, id_genero_musica)VALUES('teste11@test.com', 5);
