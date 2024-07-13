<p align="center">
  <img width="180" src="https://github.com/estifar/challenge-literalura/raw/main/otro1.jpg">
</p>



# Challenge Foro Hub

## Descripción

Challenge Foro Hub es una API Rest para la creación de un foro, desarrollada con Spring Boot y PostgreSQL. Este proyecto permite gestionar temas (tópicos) de discusión y usuarios, proporcionando funcionalidad completa para crear, leer, actualizar y eliminar temas. La autenticación y seguridad están manejadas mediante Spring Security.

## Características Principales

- **API RESTful**: Implementación de endpoints para operaciones CRUD (Crear, Leer, Actualizar y Eliminar) sobre temas de discusión y usuarios.
- **Spring Boot**: Utilizado para facilitar la configuración y el despliegue de la aplicación.
- **PostgreSQL**: Base de datos utilizada para almacenar la información de los temas y los usuarios.
- **Spring Data JPA**: Para interactuar con la base de datos de manera sencilla y eficiente.
- **Spring Security**: Configurado para manejar la autenticación y la autorización de usuarios.
- **Validación de Datos**: Uso de anotaciones de validación para asegurar la integridad de los datos.

## Endpoints

### Tópicos

- **GET /topicos**: Lista todos los tópicos.
- **GET /topicos/{id}**: Obtiene un tópico específico por su ID.
- **POST /topicos**: Crea un nuevo tópico.
- **PUT /topicos**: Actualiza un tópico existente.
- **DELETE /topicos/{id}**: Elimina un tópico por su ID.

### Usuarios

- **GET /usuarios**: Lista todos los usuarios.
- **GET /usuarios/{id}**: Obtiene un usuario específico por su ID.
- **POST /usuarios**: Crea un nuevo usuario.
- **PUT /usuarios**: Actualiza un usuario existente.
- **DELETE /usuarios/{id}**: Elimina un usuario por su ID.

### Autenticación

- **POST /login**: Autentica un usuario.

## Instalación y Configuración

### Prerrequisitos

- Java 17 o superior
- Maven
- PostgreSQL


[![Java](https://img.shields.io/badge/Java-8%2B-blue)](https://www.java.com/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.5.2-green)](https://spring.io/projects/spring-boot)
[![Hibernate](https://img.shields.io/badge/Hibernate-5.5.1-yellow)](https://hibernate.org/)
## Contribuciones

¡Las contribuciones son bienvenidas! Si deseas mejorar este proyecto, no dudes en enviar un pull request.




# 	&copy;estifar

