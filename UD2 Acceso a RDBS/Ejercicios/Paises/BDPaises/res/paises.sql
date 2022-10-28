drop database if exists paises;
create database paises;
use paises; 

drop table if exists country;
CREATE TABLE country (
id int not null auto_increment primary key,
name varchar(80)
);

INSERT INTO country (name) VALUES('Afganistán');
INSERT INTO country (name) VALUES('Islas Gland');
