DROP TABLE producto IF EXISTS;

CREATE TABLE producto (
    productoId VARCHAR(50) NOT NULL,
    productoNombre VARCHAR(50),
    productoDescripcion VARCHAR(100),
    precio VARCHAR(30)
);
