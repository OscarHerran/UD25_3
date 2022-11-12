DROP table IF EXISTS almacenes;

create table almacenes(
    id int auto_increment PRIMARY KEY,
    lugar nvarchar(100),
    capacidad int
);

insert into almacenes (lugar, capacidad) values ('Barcelona', 85000);
insert into almacenes (lugar, capacidad) values ('Sant Cugat', 23000);
insert into almacenes (lugar, capacidad) values ('Reus', 55000);
insert into almacenes (lugar, capacidad) values ('Tarragona', 80000);
insert into almacenes (lugar, capacidad) values ('Madrid', 12000);

DROP table IF EXISTS cajas;

create table cajas(
    num_referencia char (5) PRIMARY KEY,
    contenido nvarchar(100),
    valor int,
    id_almacen int,
    FOREIGN KEY(id_almacen) REFERENCES almacenes(id) ON DELETE CASCADE ON UPDATE CASCADE
);

insert into cajas (num_referencia, contenido, valor, id_almacen) values ('123A', 'lapices', 12, 1);
insert into cajas (num_referencia, contenido, valor, id_almacen) values ('123B', 'cámaras', 250, 2);
insert into cajas (num_referencia, contenido, valor, id_almacen) values ('123C', 'libros', 240,3);
insert into cajas (num_referencia, contenido, valor, id_almacen) values ('123D', 'diskettes', 30, 4);
insert into cajas (num_referencia, contenido, valor, id_almacen) values ('123E', 'usb', 25, 5);