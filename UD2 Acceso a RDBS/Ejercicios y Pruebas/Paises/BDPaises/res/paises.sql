drop database if exists paises;
create database paises;
use paises; 

drop table if exists country;
CREATE TABLE country (
pais varchar(80)
);

INSERT INTO country (pais) VALUES('Afganistán');
INSERT INTO country (pais) VALUES('Islas Gland');
