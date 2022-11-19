-- Borra la bd si existe
DROP DATABASE IF EXISTS bd_huellitas;
-- Creamos la bd
CREATE DATABASE bd_huellitas;
-- Activamos la bd
USE bd_huellitas;
 
DROP TABLE IF EXISTS tb_locales;
CREATE TABLE tb_locales(
	idlocal	INT NOT NULL AUTO_INCREMENT,
	nombreLocal VARCHAR(45),
	PRIMARY KEY (idlocal)
);


DROP TABLE IF EXISTS tb_servicios;
CREATE TABLE tb_servicios(
	idservicio	INT NOT NULL AUTO_INCREMENT,
	descripserv VARCHAR(45),
	PRIMARY KEY (idservicio)
);

DROP TABLE IF EXISTS tb_tipomascota;
CREATE TABLE tb_tipomascota(
	idtipo	INT NOT NULL AUTO_INCREMENT,
	descripcion VARCHAR(45),
	PRIMARY KEY (idtipo)
);

DROP TABLE IF EXISTS tb_cliente;
CREATE TABLE tb_cliente(
	idcliente INT NOT NULL AUTO_INCREMENT,
	nombres VARCHAR(45),
	apepat VARCHAR(45),
	apemat VARCHAR(45),
	dni INT,
	telefono INT,
	PRIMARY KEY (idcliente)
);

DROP TABLE IF EXISTS tb_mascota;
CREATE TABLE tb_mascota(
	idmascota INT NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(45),
	idtipo INT,
	raza VARCHAR(45),
	idcliente INT,
	PRIMARY KEY (idmascota),
	FOREIGN KEY (idtipo)
			REFERENCES tb_tipomascota(idtipo),
	FOREIGN KEY (idcliente)
			REFERENCES tb_cliente(idcliente)
);


DROP TABLE IF EXISTS tb_cita;
CREATE TABLE tb_cita(
	idcita INT NOT NULL AUTO_INCREMENT,
	fecha DATE,
	idcliente INT,
	idmascota INT,
	idlocal INT,
	PRIMARY KEY (idcita),
	FOREIGN KEY (idcliente)
			REFERENCES tb_cliente(idcliente),
	FOREIGN KEY (idmascota)
			REFERENCES tb_mascota(idmascota),
	FOREIGN KEY (idlocal)
			REFERENCES tb_locales(idlocal)
);

DROP TABLE IF EXISTS tb_detcita;
CREATE TABLE tb_detcita(
	iddetcita INT NOT NULL AUTO_INCREMENT,
    idcita INT,
	idservicio INT,
	PRIMARY KEY (iddetcita),
	FOREIGN KEY (idcita)
			REFERENCES tb_cita(idcita),
    FOREIGN KEY (idservicio)
			REFERENCES tb_servicios(idservicio)
);









