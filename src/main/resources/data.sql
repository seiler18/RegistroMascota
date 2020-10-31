---------------------------------------------------------------------------------------------------
--CARGA DE DATOS PARA QUE SALGAN EN EL FORM 
--ESTO CON EL FIN DE NO TENER QUE CREAR OTRA API PARA PODER TRAER LOS REGISTROS DEL FORM
INSERT INTO raza (id,nombre_raza) VALUES (1, 'Pitbull');
INSERT INTO raza (id,nombre_raza) VALUES (2, 'Siberiano');
INSERT INTO raza (id,nombre_raza) VALUES (3, 'Persa');
INSERT INTO raza (id,nombre_raza) VALUES (4, 'Siames');
INSERT INTO tipo (id,nombre_tipo) VALUES (1, 'Perro');
INSERT INTO tipo (id,nombre_tipo) VALUES (2, 'Lobo');
INSERT INTO tipo (id,nombre_tipo) VALUES (3, 'Gato');
INSERT INTO sexo (id,nombre_sexo) VALUES (1, 'Masculino');
INSERT INTO sexo (id,nombre_sexo) VALUES (2, 'Femenino');
INSERT INTO comuna(id,nombre_comuna) VALUES (1,'Llanquihue');
INSERT INTO comuna(id,nombre_comuna) VALUES (2,'Puerto Varas');
INSERT INTO region(id,nombre_region) values (1,'Los Lagos');
INSERT INTO region(id,nombre_region) values (2,'Los Rios');



--CARGA DE DATOS PARA QUE SALGAN EN EL FORM

---------------------------------------------------------------------------------------------------
--DATOS QUE VIENEN DEL USUARIO QUE LOS INGRESA 
INSERT INTO mascota (id, descripcion, edad, nombre, raza_id, tipo_id) VALUES (1, 'Color negro ojos azules', 25, 'Josueito', '1', '1');
INSERT INTO mascota (id, descripcion, edad, nombre, raza_id, tipo_id) VALUES (2, 'Colores variado', 25, 'Yanarita', '2', '2');


INSERT INTO dueno (id, edad,nombre,rut) VALUES(1, 26,'Jesus Enrique','264396638');
INSERT INTO dueno (id, edad,nombre,rut) VALUES(2, 29,'Josue Valtoz','2644363463');
--DATOS QUE VIENEN DEL USUARIO QUE LOS INGRESA 

---------------------------------------------------------------------------------------------------

--
--
--
--INSERT INTO registro_mascotadueno (id, comuna, direccion, region, dueno_id, mascota_id) VALUES(1,'Llanquihue','Los Volcanes Padre Hurtado','Los Lagos',1,1);
--INSERT INTO registro_mascotadueno (id, comuna, direccion, region, dueno_id, mascota_id) VALUES(2,'Llanquihue','Los Volcanes Padre Hurtado','Los Lagos',2,2);
