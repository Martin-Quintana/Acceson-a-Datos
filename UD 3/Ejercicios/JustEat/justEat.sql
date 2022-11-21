drop database if exists JustEat;
create database JustEat;
use JustEat;


drop table if exists Restaurantes;
create table Restaurantes (
idRestaurante int unsigned not null auto_increment primary key,
nombre varchar (35) not null,
posicion varchar(40) not null,
descripcion varchar (50) not null,
tipo_de_cocina varchar(40) not null
);


drop table if exists Platos;
create table Platos (
idPlato int unsigned not null auto_increment primary key,
restaurante int unsigned,
nombre varchar (35) not null,
descripcion varchar (50) not null,
precio float not null,

foreign key (restaurante) references Restaurantes(idRestaurante)
on delete cascade
on update cascade,
unique index FK_plato_pertenece (restaurante)

)engine InnoDB;

drop table if exists Clientes;
create table Clientes (
idClientes int unsigned not null auto_increment primary key,
nombre varchar(35) not null,
correo varchar(60) not null,

unique index AK_correo (correo)
) engine InnoDB;


drop table if exists Clientes_Restaurantes;
create table Clientes_Restaurantes (
cliente int unsigned not null,
restaurante int unsigned not null,
valoracion enum('1', '2', '3', '4', '5' ),

primary key(cliente, restaurante),

foreign key (cliente) references Clientes (idClientes)
	on delete cascade
    on update cascade,
foreign key (restaurante) references Restaurantes (idRestaurante)
	on delete cascade
    on update cascade,
index FK_cliente_restaurante(cliente),
index FK_restaurante_cliente(restaurante)
) engine InnoDB;



drop table if exists Clientes_Platos;
create table Clientes_Platos (
cliente int unsigned not null,
plato int unsigned not null,

primary key(cliente, plato),

foreign key (cliente) references Clientes (idClientes)
	on delete cascade
    on update cascade,
foreign key (plato) references Platos (idPlato)
	on delete cascade
    on update cascade,
index FK_cliente_plato(cliente),
index FK_plato_cliente(plato)      
) engine InnoDB;
