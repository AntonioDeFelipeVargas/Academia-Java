DROP TABLE producto IF EXISTS;

CREATE TABLE producto (
    productoId VARCHAR(20) NOT NULL,
    productoNombre VARCHAR(20),
    productoDescripcion VARCHAR(60),
    precio VARCHAR(30)
);
