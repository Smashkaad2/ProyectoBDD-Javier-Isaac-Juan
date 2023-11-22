delete from estado;
delete from cargo;
delete from equipo;
delete from tipo;
delete from clinica;
delete from suministro;
delete from corral;
delete from staff;
delete from dueno;
delete from mascota;
delete from factura;
delete from infopago;
delete from metodopago;
delete from cita;
delete from tratamiento;
delete from tratamientofactura;

--Estado
insert into Estado (id_estado, nombre_estado) values (0, 'Vivo');
insert into Estado (id_estado, nombre_estado) values (1, 'Muerto');
insert into Estado (id_estado, nombre_estado) values (2, 'Iniciado');
insert into Estado (id_estado, nombre_estado) values (3, 'En Curso');
insert into Estado (id_estado, nombre_estado) values (4, 'Finalizado');
insert into Estado (id_estado, nombre_estado) values (5, 'Con Cupo');
insert into Estado (id_estado, nombre_estado) values (6, 'Sin cupo');
--Cargo
insert into Cargo (cargo_id, descripcion) values (1, 'DoctorSr');
insert into Cargo (cargo_id, descripcion) values (2, 'DoctorSup');
insert into Cargo (cargo_id, descripcion) values (3, 'Doctorjr');


--Equipo
insert into Equipo (id_equipo, nombre_equipo) values (1, 'Thunder');
insert into Equipo (id_equipo, nombre_equipo) values (2, 'Fire');
insert into Equipo (id_equipo, nombre_equipo) values (3, 'Water');


--Tipo
insert into Tipo (id_tipo, nombre ) values (1, 'Doctores');
insert into Tipo (id_tipo, nombre ) values (2, 'Veterinarios');
insert into Tipo (id_tipo, nombre) values (3, 'Cedula de Ciudadania');
insert into Tipo (id_tipo, nombre) values (4, 'Tarjeta de Identidad');
insert into Tipo (id_tipo, nombre) values (5, 'Inyeccion');
insert into Tipo (id_tipo, nombre) values (6, 'Pastillas');
insert into Tipo (id_tipo, nombre) values (7, 'Perro');
insert into Tipo (id_tipo, nombre) values (8, 'Gato');
insert into Tipo (id_tipo, nombre) values (9, 'Loro');
insert into Tipo (id_tipo, nombre) values (10, 'Pez payaso');
insert into Tipo (id_tipo, nombre) values (11, 'Peje Lagarto');

--Clinica
insert into Clinica (clinica_id, direccion, telefono) values (1, '97 Sherman Point', 9409475383);
insert into Clinica (clinica_id, direccion, telefono) values (2, '0947 Mesta Place', 8132197704);
insert into Clinica (clinica_id, direccion, telefono) values (3, '3821 Negro Arroyo NMX', 2314567819);


--Suministros
insert into Suministro (suministro_id, tipo_suministro, clinica_id, nombre, descripcion, dosis, tipo_metodo_administracion, nivel_prioridad, cantidad) values (1, 1, 3, 'Tizanidine', 'Dove, rock', 'tres dosis', 5, 5, 1);
insert into Suministro (suministro_id, tipo_suministro, clinica_id, nombre, descripcion, dosis, tipo_metodo_administracion, nivel_prioridad, cantidad) values (2, 1, 1, 'Gabapentin', 'Hyena, spotted', 'cuatro dosis', 6,10, 3);
insert into Suministro (suministro_id, tipo_suministro, clinica_id, nombre, descripcion, dosis, tipo_metodo_administracion, nivel_prioridad, cantidad) values (3, 2, 2, 'glipizide', 'Snake, tiger', 'dos dosis', 5, 3, 1);
insert into Suministro (suministro_id, tipo_suministro, clinica_id, nombre, descripcion, dosis, tipo_metodo_administracion, nivel_prioridad, cantidad) values (4, 2, 3, 'Simvastatin', 'Black-capped capuchin', 'una dosis', 6, 8, 2);
insert into Suministro (suministro_id, tipo_suministro, clinica_id, nombre, descripcion, dosis, tipo_metodo_administracion, nivel_prioridad, cantidad) values (5, 2, 1, 'lansoprazole', 'African bush squirrel', 'tres dosis', 3, 2, 1);




--Corral
insert into Corral (corral_id, clinica_id, ocupacion, capacidad, estado_ocupacion) values (1, 1, 2, 10, 5);
insert into Corral (corral_id, clinica_id, ocupacion, capacidad, estado_ocupacion) values (2, 2, 2, 20, 6);
insert into Corral (corral_id, clinica_id, ocupacion, capacidad, estado_ocupacion) values (3, 1, 1, 33, 5);
insert into Corral (corral_id, clinica_id, ocupacion, capacidad, estado_ocupacion) values (4, 3, 4, 15, 5);



--Staff
insert into Staff (id_staff, numero_documento, nombre, apellido, direccion, num_telefono, fecha_nacimiento, sexo, salario_anual, username, contrasena, id_tipo_documento, clinica_id, id_equipo, cargo_id) values (1, '6512135202', 'Petunia', 'Strongitharm', '17 Corben Plaza', '9181796271', TO_DATE('15/06/2023', 'DD/MM/YYYY'), 'F', 1254485.42, 'pstrongitharm0', 'kG9}WFrW#}R(Ax', 3, 1, 1, 1);
insert into Staff (id_staff, numero_documento, nombre, apellido, direccion, num_telefono, fecha_nacimiento, sexo, salario_anual, username, contrasena, id_tipo_documento, clinica_id, id_equipo, cargo_id) values (2, '2644174981', 'Flinn', 'Colson', '074 Westend Road', '4517784794', TO_DATE('14/05/2023', 'DD/MM/YYYY'), 'M', 2550252.19, 'fcolson1', 'cS1/{}Qo02`d', 3, 1, 2, 1);
insert into Staff (id_staff, numero_documento, nombre, apellido, direccion, num_telefono, fecha_nacimiento, sexo, salario_anual, username, contrasena, id_tipo_documento, clinica_id, id_equipo, cargo_id) values (3, '4283727129', 'Wilma', 'Deboy', '84 Talmadge Point', '7587606533', TO_DATE('24/09/2023', 'DD/MM/YYYY'), 'F', 8645806.72, 'wdeboy2', 'oQ7#pDgNW>m,', 3, 1, 3, 1);
insert into Staff (id_staff, numero_documento, nombre, apellido, direccion, num_telefono, fecha_nacimiento, sexo, salario_anual, username, contrasena, id_tipo_documento, clinica_id, id_equipo, cargo_id) values (4, '3305954011', 'Darsey', 'O''Sheeryne', '3 Crowley Place', '8117841261', TO_DATE('24/09/2023', 'DD/MM/YYYY'), 'F', 723165.14, 'dosheeryne3', 'rH8?5tCksBJ)l', 3, 2, 3, 2);
insert into Staff (id_staff, numero_documento, nombre, apellido, direccion, num_telefono, fecha_nacimiento, sexo, salario_anual, username, contrasena, id_tipo_documento, clinica_id, id_equipo, cargo_id) values (5, '3605954011', 'Javier', 'P''Sheeryne', '3 Crowley Place', '8117841262', TO_DATE('24/09/2023', 'DD/MM/YYYY'), 'M', 783165.14, 'kaadtrash', 'rH8?5tCkDBJ)l', 3, 2, 3, 3);
insert into Staff (id_staff, numero_documento, nombre, apellido, direccion, num_telefono, fecha_nacimiento, sexo, salario_anual, username, contrasena, id_tipo_documento, clinica_id, id_equipo, cargo_id) values (6, '8621383062', 'Ulla', 'Gerding', '16238 Longview Plaza', '9354078535', TO_DATE('14/05/2023', 'DD/MM/YYYY'), 'F', 8888179.65, 'ugerding5', 'yL0~#"*\aZ2""P', 3, 1, 1, 3);
insert into Staff (id_staff, numero_documento, nombre, apellido, direccion, num_telefono, fecha_nacimiento, sexo, salario_anual, username, contrasena, id_tipo_documento, clinica_id, id_equipo, cargo_id) values (7, '2336612140', 'Jonis', 'Gonnel', '4555 Graedel Road', '2719087559', TO_DATE('14/05/2023', 'DD/MM/YYYY'), 'F', 5163505.59, 'jgonnel6', 'jM8}5tm4,o', 3, 1, 3, 1);
insert into Staff (id_staff, numero_documento, nombre, apellido, direccion, num_telefono, fecha_nacimiento, sexo, salario_anual, username, contrasena, id_tipo_documento, clinica_id, id_equipo, cargo_id) values (8, '9759002748', 'Abba', 'Dillestone', '219 Surrey Trail', '7375133766', TO_DATE('14/05/2023', 'DD/MM/YYYY'), 'M', 8081619.40, 'adillestone7', 'bE7$dG+)<FnzEvG', 3, 2, 1, 2);
insert into Staff (id_staff, numero_documento, nombre, apellido, direccion, num_telefono, fecha_nacimiento, sexo, salario_anual, username, contrasena, id_tipo_documento, clinica_id, id_equipo, cargo_id) values (9, '6956548781', 'Ada', 'Endacott', '37 Old Shore Point', '9541286894', TO_DATE('14/05/2023', 'DD/MM/YYYY'), 'F', 9178468.47, 'aendacott8', 'vV6|r))F!mx', 3, 3, 2, 1);
insert into Staff (id_staff, numero_documento, nombre, apellido, direccion, num_telefono, fecha_nacimiento, sexo, salario_anual, username, contrasena, id_tipo_documento, clinica_id, id_equipo, cargo_id) values (10, '7155228752', 'Taffy', 'Dugood', '759 Grayhawk Drive', '7054450448', TO_DATE('14/05/2023', 'DD/MM/YYYY'), 'F', 3894791.03, 'tdugood9', 'aQ8+PNe)gr5\', 3, 3, 3, 3);


--Dueno
insert into Dueno (dueno_id, clinica_id, nombre, apellido, direccion, telefono_casa, tipo_documento, numero_documento, username, contrasena) values (1, 2, 'Court', 'Mardling', '3 Killdeer Junction', 6637938869, 4, '7558903748', 'cmardling0', 'xW0.5frS..');
insert into Dueno (dueno_id, clinica_id, nombre, apellido, direccion, telefono_casa, tipo_documento, numero_documento, username, contrasena) values (2, 1, 'Hali', 'Yurasov', '6750 Coolidge Circle', 5542380279, 3, '8595334063', 'hyurasov1', 'aN0=bpXchS<_4');
insert into Dueno (dueno_id, clinica_id, nombre, apellido, direccion, telefono_casa, tipo_documento, numero_documento, username, contrasena) values (3, 3, 'Avie', 'Dmytryk', '1 Service Lane', 4458967544, 4, '1857200195', 'admytryk2', 'jI6.rVXHi3(=*B<');
insert into Dueno (dueno_id, clinica_id, nombre, apellido, direccion, telefono_casa, tipo_documento, numero_documento, username, contrasena) values (4, 2, 'Laird', 'McIlhatton', '226 Crescent Oaks', 3602173650, 3, '7224184311', 'lmcilhatton3', 'wZ9+\FyC#$9Bh');
insert into Dueno (dueno_id, clinica_id, nombre, apellido, direccion, telefono_casa, tipo_documento, numero_documento, username, contrasena) values (5, 2, 'Tiffie', 'Deeprose', '01 Hudson Pass', 9361057345, 4, '2323928310', 'tdeeprose4', 'qM0)4ylj9B%F');
insert into Dueno (dueno_id, clinica_id, nombre, apellido, direccion, telefono_casa, tipo_documento, numero_documento, username, contrasena) values (6, 1, 'Idaline', 'Gidman', '78 Kingsford Alley', 5255985270, 3, '8049022448', 'igidman5', 'tZ9)#7+I?0?)j');


--Mascota
insert into Mascota (mascota_id, nombre, tipo_mascota, dueno_id, descripcion, fecha_nacimiento, fecha_registro, estado_actual) values (1, 'Firulais',7, 1, 'Lamprotornis nitens', TO_DATE('2022/07/21', 'YYYY/MM/DD'),  TO_DATE('2023/07/21', 'YYYY/MM/DD'), 1);
insert into Mascota (mascota_id, nombre, tipo_mascota, dueno_id, descripcion, fecha_nacimiento, fecha_registro, estado_actual) values (2, 'Rocky',8, 1, 'Grus rubicundus', TO_DATE('17/03/2023', 'DD/MM/YYYY'), TO_DATE('25/09/2023', 'DD/MM/YYYY'), 1);
insert into Mascota (mascota_id, nombre, tipo_mascota, dueno_id, descripcion, fecha_nacimiento, fecha_registro, estado_actual) values (3, 'Joseco',9, 1, 'Panthera leo', TO_DATE('26/02/2023','DD/MM/YYYY'), TO_DATE('07/08/2023','DD/MM/YYYY'), 1);
insert into Mascota (mascota_id, nombre, tipo_mascota, dueno_id, descripcion, fecha_nacimiento, fecha_registro, estado_actual) values (4, 'Ramiro',10, 2, 'Macropus agilis', TO_DATE('25/08/2023','DD/MM/YYYY'), TO_DATE('29/09/2023','DD/MM/YYYY'), 1);
insert into Mascota (mascota_id, nombre, tipo_mascota, dueno_id, descripcion, fecha_nacimiento, fecha_registro, estado_actual) values (5, 'Rockefeller',11, 3, 'Tiliqua scincoides', TO_DATE('28/04/2023','DD/MM/YYYY'), TO_DATE('31/08/2023','DD/MM/YYYY'), 1);
insert into Mascota (mascota_id, nombre, tipo_mascota, dueno_id, descripcion, fecha_nacimiento, fecha_registro, estado_actual) values (6, 'Lenin',7, 4, 'Nesomimus trifasciatus', TO_DATE('27/07/2023','DD/MM/YYYY'), TO_DATE('04/05/2023','DD/MM/YYYY'), 1);
insert into Mascota (mascota_id, nombre, tipo_mascota, dueno_id, descripcion, fecha_nacimiento, fecha_registro, estado_actual) values (7, 'Marx',8, 5, 'Eremophila alpestris', TO_DATE('08/08/2023','DD/MM/YYYY'), TO_DATE('04/08/2023','DD/MM/YYYY'), 0);
insert into Mascota (mascota_id, nombre, tipo_mascota, dueno_id, descripcion, fecha_nacimiento, fecha_registro, estado_actual) values (8, 'Timochenko',9, 6, 'Ursus arctos', TO_DATE('16/10/2023','DD/MM/YYYY'), TO_DATE('07/12/2022','DD/MM/YYYY'), 0);
insert into Mascota (mascota_id, nombre, tipo_mascota, dueno_id, descripcion, fecha_nacimiento, fecha_registro, estado_actual) values (9, 'DR Uribe',7, 2, 'Lamprotornis sp.', TO_DATE('06/12/2022','DD/MM/YYYY'), TO_DATE('17/08/2023','DD/MM/YYYY'), 1);
insert into Mascota (mascota_id, nombre, tipo_mascota, dueno_id, descripcion, fecha_nacimiento, fecha_registro, estado_actual) values (10, 'Taylor',7, 4, 'Tachybaptus ruficollis', TO_DATE('12/02/2023','DD/MM/YYYY'), TO_DATE('13/10/2023','DD/MM/YYYY'), 1);


--Facturas
insert into Factura (factura_id, fecha, fecha_pago, mascota_id, total_pagar) values (1, TO_DATE('15/06/2023', 'DD/MM/YYYY'), TO_DATE('16/08/2023', 'DD/MM/YYYY'), 2, 100000);
insert into Factura (factura_id, fecha, fecha_pago, mascota_id, total_pagar) values (2, TO_DATE('21/06/2023', 'DD/MM/YYYY'), TO_DATE('15/04/2023', 'DD/MM/YYYY'), 1, 200000);
insert into Factura (factura_id, fecha, fecha_pago, mascota_id, total_pagar) values (3, TO_DATE('01/05/2023', 'DD/MM/YYYY'), TO_DATE('14/05/2023', 'DD/MM/YYYY'), 3, 300000);
insert into Factura (factura_id, fecha, fecha_pago, mascota_id, total_pagar) values (4, TO_DATE('24/09/2023', 'DD/MM/YYYY'), TO_DATE('19/02/2023', 'DD/MM/YYYY'), 4, 400000);
insert into Factura (factura_id, fecha, fecha_pago, mascota_id, total_pagar) values (5, TO_DATE('22/09/2023', 'DD/MM/YYYY'), TO_DATE('13/12/2022', 'DD/MM/YYYY'), 6, 4000000);
insert into Factura (factura_id, fecha, fecha_pago, mascota_id, total_pagar) values (6, TO_DATE('14/06/2023', 'DD/MM/YYYY'), TO_DATE('25/01/2023', 'DD/MM/YYYY'), 7, 5000000);
insert into Factura (factura_id, fecha, fecha_pago, mascota_id, total_pagar) values (7, TO_DATE('06/12/2022', 'DD/MM/YYYY'), TO_DATE('27/02/2023', 'DD/MM/YYYY'), 5, 100000);
insert into Factura (factura_id, fecha, fecha_pago, mascota_id, total_pagar) values (8, TO_DATE('17/03/2023', 'DD/MM/YYYY'), TO_DATE('18/01/2023', 'DD/MM/YYYY'), 8, 200000);
insert into Factura (factura_id, fecha, fecha_pago, mascota_id, total_pagar) values (9, TO_DATE('26/08/2023', 'DD/MM/YYYY'), TO_DATE('18/12/2022', 'DD/MM/YYYY'), 10, 300000);
insert into Factura (factura_id, fecha, fecha_pago, mascota_id, total_pagar) values (10, TO_DATE('09/03/2023', 'DD/MM/YYYY'), TO_DATE('02/09/2023', 'DD/MM/YYYY'), 9, 250000);

--MetodoPago
insert into MetodoPago (metodoPago_id, nombre) values (1, 'Efectivo');
insert into MetodoPago (metodoPago_id, nombre) values (2, 'Tarjeta');
insert into MetodoPago (metodoPago_id, nombre) values (3, 'Cheque');


--InfoPago
insert into InfoPago (metodoPago_id, factura_id, abono) values (1, 1, 278361.35);
insert into InfoPago (metodoPago_id, factura_id, abono) values (2, 2, 7772405.06);
insert into InfoPago (metodoPago_id, factura_id, abono) values (3, 3, 8887453.28);
insert into InfoPago (metodoPago_id, factura_id, abono) values (1, 4, 9153301.89);
insert into InfoPago (metodoPago_id, factura_id, abono) values (2, 5, 8609828.57);
insert into InfoPago (metodoPago_id, factura_id, abono) values (3, 6, 7558628.62);
insert into InfoPago (metodoPago_id, factura_id, abono) values (1, 7, 461581.02);
insert into InfoPago (metodoPago_id, factura_id, abono) values (2, 8, 8517111.41);
insert into InfoPago (metodoPago_id, factura_id, abono) values (3, 9, 232737.10);
insert into InfoPago (metodoPago_id, factura_id, abono) values (1, 10, 3494725.61);


--Cita
insert into Cita (cita_id, fecha, hora, staff_id, mascota_id) values (1, TO_DATE('27/09/2023','DD/MM/YYYY'), 15.00, 1, 1);
insert into Cita (cita_id, fecha, hora, staff_id, mascota_id) values (2, TO_DATE('24/12/2022','DD/MM/YYYY'), 20.00, 2, 2);
insert into Cita (cita_id, fecha, hora, staff_id, mascota_id) values (3, TO_DATE('16/05/2023','DD/MM/YYYY'), 13.00, 3, 3);
insert into Cita (cita_id, fecha, hora, staff_id, mascota_id) values (4, TO_DATE('08/07/2023','DD/MM/YYYY'), 14.00, 4, 4);
insert into Cita (cita_id, fecha, hora, staff_id, mascota_id) values (5, TO_DATE('21/05/2023','DD/MM/YYYY'), 15.30, 5, 5);
insert into Cita (cita_id, fecha, hora, staff_id, mascota_id) values (6, TO_DATE('11/03/2023','DD/MM/YYYY'), 16.00, 6, 6);
insert into Cita (cita_id, fecha, hora, staff_id, mascota_id) values (7, TO_DATE('01/11/2023','DD/MM/YYYY'), 17.00, 7, 7);
insert into Cita (cita_id, fecha, hora, staff_id, mascota_id) values (8, TO_DATE('11/05/2023','DD/MM/YYYY'), 18.00, 8, 8);
insert into Cita (cita_id, fecha, hora, staff_id, mascota_id) values (9, TO_DATE('07/01/2023','DD/MM/YYYY'), 19.00, 9, 9);
insert into Cita (cita_id, fecha, hora, staff_id, mascota_id) values (10, TO_DATE('09/11/2023','DD/MM/YYYY'), 10.00, 10, 10);


--Tratamientos
insert into Tratamiento (codigo_tratamiento, costo, corral_id, suministro_id) values (1, 3898422.59, 1, 5);
insert into Tratamiento (codigo_tratamiento, costo, corral_id, suministro_id) values (2, 4478507.69, 1, 2);
insert into Tratamiento (codigo_tratamiento, costo, corral_id, suministro_id) values (3, 859159.54, 3, 3);
insert into Tratamiento (codigo_tratamiento, costo, corral_id, suministro_id) values (4, 8771424.68, 4, 1);
insert into Tratamiento (codigo_tratamiento, costo, corral_id, suministro_id) values (5, 5651547.54, 1, 2);
insert into Tratamiento (codigo_tratamiento, costo, corral_id, suministro_id) values (6, 2108769.45, 2, 4);
insert into Tratamiento (codigo_tratamiento, costo, corral_id, suministro_id) values (7, 5133885.13, 2, 5);
insert into Tratamiento (codigo_tratamiento, costo, corral_id, suministro_id) values (8, 3187604.44, 1, 3);
insert into Tratamiento (codigo_tratamiento, costo, corral_id, suministro_id) values (9, 3130839.75, 1, 1);
insert into Tratamiento (codigo_tratamiento, costo, corral_id, suministro_id) values (10, 8571884.73, 4, 2);
insert into Tratamiento (codigo_tratamiento, costo, corral_id, suministro_id) values (11, 6712781.18, 2, 1);
insert into Tratamiento (codigo_tratamiento, costo, corral_id, suministro_id) values (12, 760331.26, 1, 2);
insert into Tratamiento (codigo_tratamiento, costo, corral_id, suministro_id) values (13, 8491977.11, 3, 3);
insert into Tratamiento (codigo_tratamiento, costo, corral_id, suministro_id) values (14, 6917887.17, 4, 4);
insert into Tratamiento (codigo_tratamiento, costo, corral_id, suministro_id) values (15, 285131.66, 2, 5);






--facturaTratamientos
insert into TratamientoFactura (codigo_tratamiento_id, factura_id, estado_tratamiento, mascota_id, id_staff, fecha, hora, descripcion) values (1, 10, 2, 1, 1, TO_DATE('03/04/2023','DD/MM/YYYY'), 14.38, 'Omar Palacios');
insert into TratamientoFactura (codigo_tratamiento_id, factura_id, estado_tratamiento, mascota_id, id_staff, fecha, hora, descripcion) values (2, 8, 2, 2, 2, TO_DATE('12/10/2023','DD/MM/YYYY'), 14.03, 'Jose Gonzalez');
insert into TratamientoFactura (codigo_tratamiento_id, factura_id, estado_tratamiento, mascota_id, id_staff, fecha, hora, descripcion) values (3, 9, 3, 3, 3, TO_DATE('02/05/2023','DD/MM/YYYY'), 22.43, 'Pedro Ramirez');
insert into TratamientoFactura (codigo_tratamiento_id, factura_id, estado_tratamiento, mascota_id, id_staff, fecha, hora, descripcion) values (4, 3, 3, 4, 4, TO_DATE('24/05/2023','DD/MM/YYYY'), 6.16, 'Maria Rojas');
insert into TratamientoFactura (codigo_tratamiento_id, factura_id, estado_tratamiento, mascota_id, id_staff, fecha, hora, descripcion) values (5, 2, 4, 5, 5, TO_DATE('02/12/2022','DD/MM/YYYY'), 12.50, 'NavarroKenny Bell Wolf');
insert into TratamientoFactura (codigo_tratamiento_id, factura_id, estado_tratamiento, mascota_id, id_staff, fecha, hora, descripcion) values (6, 1, 4, 6, 6, TO_DATE('27/09/2023','DD/MM/YYYY'), 0.01, 'Gustavo Duque');
insert into TratamientoFactura (codigo_tratamiento_id, factura_id, estado_tratamiento, mascota_id, id_staff, fecha, hora, descripcion) values (7, 4, 2, 7, 7, TO_DATE('17/04/2023','DD/MM/YYYY'), 6.54, 'Andres Pastrana');
insert into TratamientoFactura (codigo_tratamiento_id, factura_id, estado_tratamiento, mascota_id, id_staff, fecha, hora, descripcion) values (8, 5, 3, 8, 8, TO_DATE('14/09/2023','DD/MM/YYYY'), 12.57, 'Roberto Pumarejo');
insert into TratamientoFactura (codigo_tratamiento_id, factura_id, estado_tratamiento, mascota_id, id_staff, fecha, hora, descripcion) values (9, 6, 4, 9, 9, TO_DATE('21/09/2023','DD/MM/YYYY'), 9.50, 'Kenny Bell');
insert into TratamientoFactura (codigo_tratamiento_id, factura_id, estado_tratamiento, mascota_id, id_staff, fecha, hora, descripcion) values (10, 7, 2, 10, 10, TO_DATE('27/05/2023','DD/MM/YYYY'), 22.32, 'Elsa Bueso');
