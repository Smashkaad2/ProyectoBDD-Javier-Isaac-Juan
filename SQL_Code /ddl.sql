drop table TratamientoFactura;
drop table Tratamiento;
drop table InfoPago;
drop table Cita;
drop table Staff;
drop table Equipo;
drop table Tipo;
drop table Corral;
drop table Suministro;
drop table Factura;
drop table Mascota;
drop table Dueno;
drop table Clinica;
drop table Cargo;
drop table MetodoPago;
drop table Estado;

-- CREACION DE TABLA ESTADO
-- SE LE ANNADIO FOREIGN A ESTADO ACTUAL EN TABLA MASCOTA
-- ESTAB MAL REFERENCIADO EL CODIGO DEL TRATAMIENTOD PORQUE IBA AL ESTADO
-- LE FALTABA FOREIGN A TIPO_METODO_ADMINISTRACION


--TODAS LAS PARAMETRICAS ESTAN ARRIBA
create table Estado 
(
    id_estado int,
    nombre_estado varchar(50),
    PRIMARY KEY(id_estado)
);

create table Cargo(
    cargo_id int,
    descripcion varchar(50),
    PRIMARY KEY(cargo_id)
);

create table Equipo
(
	id_equipo int,
	nombre_equipo varchar(50),
	PRIMARY KEY(id_equipo)
);


create table Tipo
(
	id_tipo int,
	nombre varchar(50),
	PRIMARY KEY(id_tipo)
);

create table Clinica
(
	clinica_id int,
	direccion varchar(50),
	telefono int,
	PRIMARY KEY (clinica_id)
);

create table MetodoPago
(
	metodoPago_id int,
	nombre varchar(20),
	PRIMARY KEY (metodoPago_id)

);

--AQUI EMPIEZAN LAS TABLAS GRANDOTAS

create table Suministro
(
	suministro_id int,
	tipo_suministro int,
	clinica_id int,
	nombre varchar(30),
	descripcion varchar(50),
	dosis varchar(50),
	tipo_metodo_administracion int,
	nivel_prioridad int,
	cantidad int,
	PRIMARY KEY (suministro_id),
	FOREIGN KEY (clinica_id) REFERENCES Clinica(clinica_id),
    FOREIGN KEY (tipo_metodo_administracion) REFERENCES Tipo(id_tipo)
);

create table Corral
(

	corral_id int,
	clinica_id int,
	ocupacion int,
	capacidad int,
	estado_ocupacion int,
	PRIMARY KEY (corral_id),
	FOREIGN KEY (clinica_id) REFERENCES Clinica(clinica_id),
	FOREIGN KEY (estado_ocupacion) REFERENCES Estado(id_estado)


);

create table Staff
(
	id_staff int,
	numero_documento int,
	nombre varchar(30),
	apellido varchar(30),
	direccion varchar(50),
	num_telefono int,
	fecha_nacimiento date,
	sexo char, -- me preocupa un poquin que sea solo char, tal vez varchar
	salario_anual float(10),
	username varchar(30),
	contrasena varchar(30),
	id_tipo_documento int,
	clinica_id int,
	id_equipo int,
	cargo_id int,
	PRIMARY KEY (id_staff),
	FOREIGN KEY (id_tipo_documento) REFERENCES Tipo(id_tipo),
	FOREIGN KEY (clinica_id) REFERENCES Clinica(clinica_id),
	FOREIGN KEY (id_equipo) REFERENCES Equipo(id_equipo),
	FOREIGN KEY (cargo_id) REFERENCES Cargo(cargo_id)
);


create table Dueno
(
	dueno_id int,
	clinica_id int,
	nombre varchar(20),
	apellido varchar(20),
	direccion varchar(20),
	telefono_casa int,
	tipo_documento int,
	numero_documento int,
	username varchar(50),
	contrasena varchar(50),
	PRIMARY KEY (dueno_id),
	FOREIGN KEY (clinica_id) REFERENCES Clinica(clinica_id),
	FOREIGN KEY (tipo_documento) REFERENCES Tipo(id_tipo)
);


create table Mascota
(
	mascota_id int,
	nombre varchar(20),
    tipo_mascota int,
	dueno_id int,
	descripcion varchar(50),
	fecha_nacimiento Date,
	fecha_registro Date,
	estado_actual int,
	PRIMARY KEY (mascota_id),
	FOREIGN KEY (dueno_id) REFERENCES Dueno(dueno_id),
    FOREIGN KEY (tipo_mascota) REFERENCES Tipo(id_tipo),
    FOREIGN KEY (estado_actual) REFERENCES Estado(id_estado)
);


create table Factura
(
	factura_id int,
	fecha Date,
	fecha_pago Date,
	mascota_id int,
	total_pagar float,
	PRIMARY KEY (factura_id),
	FOREIGN KEY (mascota_id) REFERENCES Mascota(mascota_id)
);



create table InfoPago
(
	metodoPago_id int,
	factura_id int,
	abono float,
	PRIMARY KEY (metodoPago_id,factura_id),
	FOREIGN KEY (metodoPago_id) REFERENCES MetodoPago(metodoPago_id),
	FOREIGN KEY (factura_id) REFERENCES Factura(factura_id)
	
);


create table Cita
(
	cita_id int,
	fecha date,
	hora numeric(4,2),
	staff_id int,
	mascota_id int,
	PRIMARY KEY (cita_id),
	FOREIGN KEY (staff_id) REFERENCES Staff(id_staff),
	FOREIGN KEY (mascota_id) REFERENCES Mascota(mascota_id)
);

create table Tratamiento
(
	codigo_tratamiento int,
	costo float,
	corral_id int NULL,
	suministro_id int,
	PRIMARY KEY (codigo_tratamiento),
	FOREIGN KEY (corral_id) REFERENCES Corral(corral_id),
	FOREIGN KEY (suministro_id) REFERENCES Suministro(suministro_id)

);

create table TratamientoFactura
(
	codigo_tratamiento_id int,
	factura_id int,
	estado_tratamiento int,
	mascota_id int,
	id_staff int,
	fecha Date,
	hora varchar(20),
	descripcion varchar(50),
	PRIMARY KEY (codigo_tratamiento_id, factura_id),
	FOREIGN KEY (factura_id) REFERENCES Factura(factura_id),
	FOREIGN KEY (id_staff) REFERENCES Staff(id_staff),
	FOREIGN KEY (mascota_id) REFERENCES Mascota(mascota_id),
	FOREIGN KEY (codigo_tratamiento_id) REFERENCES Tratamiento(codigo_tratamiento),
    FOREIGN KEY (estado_tratamiento) REFERENCES Estado(id_estado)

);
