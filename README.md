# Gestor de Empleados con JPA

Este repositorio contiene un proyecto de Java que implementa un sencillo sistema de gestión de empleados utilizando JPA (Java Persistence API). El objetivo de este proyecto es demostrar el uso práctico de JPA para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en una base de datos relacional.

## Características

- **Listar Empleados**: Muestra todos los empleados existentes en la base de datos.
- **Buscar Empleado por ID**: Permite buscar un empleado específico mediante su ID.
- **Crear un Nuevo Empleado**: Facilita la adición de nuevos empleados a la base de datos.
- **Actualizar Datos de un Empleado**: Permite modificar la información de un empleado existente.
- **Eliminar Empleado**: Habilita la eliminación de empleados de la base de datos.

## Tecnologías Utilizadas

- Java
- JPA (Java Persistence API)
- Hibernate (como proveedor de JPA)

## Requisitos Previos

Para ejecutar este proyecto, necesitarás:

- JDK (Java Development Kit)
- Configuración de una base de datos relacional (el código está configurado para usar una, pero puedes modificarlo según tus necesidades)
- Dependencias de JPA y Hibernate (usualmente gestionadas a través de Maven o Gradle)

## Cómo Ejecutar

1. Clona el repositorio en tu máquina local.
2. Configura tu base de datos y actualiza `UtilEntity` con tus credenciales de base de datos.
3. Ejecuta `Main.java` para iniciar el programa.

## crear la tabla en la base de datos

CREATE TABLE Employee ( id INT PRIMARY KEY, firstName VARCHAR(255), firstSurname VARCHAR(255), secondSurname VARCHAR(255), email VARCHAR(255), salary FLOAT );

## agregamos datos:

INSERT INTO Employee (id, firstName, firstSurname, secondSurname, email, salary) VALUES (1, 'Juan', 'Pérez', 'González', 'juan.perez@example.com', 30000.00), (2, 'Ana', 'Martínez', 'López', 'ana.martinez@example.com', 32000.00), (3, 'Carlos', 'Jiménez', 'Ruiz', 'carlos.jimenez@example.com', 35000.00), (4, 'Sofía', 'Fernández', 'Moreno', 'sofia.fernandez@example.com', 30500.00), (5, 'David', 'García', 'Santos', 'david.garcia@example.com', 31000.00), (6, 'Marta', 'Rodríguez', 'Vázquez', 'marta.rodriguez@example.com', 33000.00), (7, 'Luis', 'López', 'Torres', 'luis.lopez@example.com', 34000.00), (8, 'Lucía', 'Sánchez', 'Romero', 'lucia.sanchez@example.com', 31500.00), (9, 'Javier', 'Díaz', 'Navarro', 'javier.diaz@example.com', 32500.00), (10, 'María', 'Moreno', 'Gutiérrez', 'maria.moreno@example.com', 33500.00);

## Contribuir

Las contribuciones al proyecto son bienvenidas. Si tienes ideas para mejorar la aplicación o corregir errores, no dudes en crear un Pull Request.
