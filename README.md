CREATE DATABASE productos_venta;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(255) NOT NULL
);

//Al registrarse los usuarios nuevos seran anadidos a la tabla usuarios, el programa no permitira doblre registro con el mismo username

CREATE TABLE productos (
    id_productos INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    precio DOUBLE(255) NOT NULL,
    tipo VARCHAR(50) NOT NULL,
    ubicacion VARCHAR(50) NOT NULL
);

INSERT INTO productos (id_producto, nombre, precio, tipo, ubicacion)
    VALUES (1, 'Leche', 100.0, 'lacteos', 'Ubicacion 1'), 
    (2, 'Frijoles', 200.0, 'verduras', 'Ubicacion 2'),
    (3, 'Naranja', 300.0, 'frutas', 'Ubicacion 3');

// Para este modelo se agregaron solo 3 productos para hacer consultas, pero puede anadir los productos que desee tomando como base el codigo SQL propuesto
