# Backend 

Backend del proyecto, desarrollado con Java y Spring Boot. Está organizado como un proyecto Maven independiente dentro de la carpeta `Backend`.

## Requisitos

- **JDK 27** o compatible con la versión declarada en el proyecto.
- No es necesario instalar Maven. El proyecto incluye Maven Wrapper (`mvnw.cmd`).

## Cómo ejecutar el proyecto en Windows

1. Abre PowerShell dentro de la carpeta `Backend`.
2. Comprueba que Java esté instalado:

```powershell
java -version
```

3. Ejecuta las pruebas del proyecto:

```powershell
.\mvnw.cmd clean test
```

4. Inicia el servidor:

```powershell
.\mvnw.cmd spring-boot:run
```

La API estará disponible en:

`http://localhost:8080`

## Endpoints de la API

### Facultades

| Método | Endpoint | Descripción |
|---|---|---|
| GET | `/api/facultades` | Obtener todas las facultades. |

### Escuelas

| Método | Endpoint | Descripción |
|---|---|---|
| GET | `/api/escuelas/facultad/{idFacultad}` | Obtener las escuelas de una facultad específica. |

### Carreras

| Método | Endpoint | Descripción |
|---|---|---|
| GET | `/api/carreras/escuela/{idEscuela}` | Obtener las carreras de una escuela. |

### Materias

| Método | Endpoint | Descripción |
|---|---|---|
| GET | `/api/materias/carrera/{idCarrera}` | Obtener las materias de una carrera. |

**Nota:** Los endpoints de facultades y escuelas corresponden a la funcionalidad desarrollada y probada en esta etapa. Las funcionalidades de carreras y materias quedan bajo la responsabilidad del integrante del equipo asignado a ellas.

## Estructura del proyecto

```text
Backend/
├── .mvn/
├── src/
│   ├── main/
│   │   ├── java/com/uasd/backend/
│   │   │   ├── config/
│   │   │   ├── controller/
│   │   │   ├── data/
│   │   │   ├── exception/
│   │   │   ├── model/
│   │   │   └── service/
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README_BACKEND.md
```

### Descripción de los paquetes

- **controller:** contiene los controladores y las rutas HTTP de la API.
- **model:** contiene las clases que representan los objetos devueltos en formato JSON.
- **service:** contiene la lógica de consulta y filtrado de información.
- **data:** contiene `CatalogoTemporal.java`, donde se encuentran los datos utilizados para las pruebas.
- **config:** contiene la configuración CORS para permitir la comunicación con el frontend.
- **exception:** contiene el manejo de errores de la API.

## Configuración CORS

El backend incluye configuración CORS para permitir solicitudes desde el frontend desarrollado con Vite, utilizando:

`http://localhost:5173`

## Estado del desarrollo

- [x] Estructura inicial del backend con Spring Boot.
- [x] Configuración de Maven Wrapper.
- [x] Modelos de facultades y escuelas.
- [x] Endpoint para consultar todas las facultades.
- [x] Endpoint para consultar escuelas por facultad.
- [x] Pruebas de funcionamiento de las consultas de facultades y escuelas.
- [ ] Completar la funcionalidad de carreras.
- [ ] Completar la funcionalidad de materias.

## Consideraciones

Los datos contenidos en `CatalogoTemporal.java` se utilizan para realizar pruebas del funcionamiento de la API. Los datos demostrativos de carreras y materias no deben considerarse información oficial de la UASD.

Las funcionalidades de carreras y materias serán completadas e integradas por el integrante del equipo responsable de esa parte del backend.
