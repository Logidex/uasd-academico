# Backend - UASD Académica

Backend Spring Boot organizado en una sola carpeta Maven.

## Requisitos
- JDK 27 (el proyecto original declara Java 27).
- No requiere Maven instalado; utiliza `mvnw.cmd`.

## Ejecutar en Windows
Abre PowerShell dentro de esta carpeta y ejecuta:

```powershell
java -version
.\mvnw.cmd clean test
.\mvnw.cmd spring-boot:run
```

La API inicia en `http://localhost:8080`.

## Rutas implementadas

- `GET /api/facultades`
- `GET /api/escuelas/facultad/{idFacultad}`
- `GET /api/carreras/escuela/{idEscuela}`
- `GET /api/materias/carrera/{idCarrera}`

## Organización

- `controller`: rutas HTTP.
- `model`: objetos que se devuelven como JSON.
- `service`: filtros y consultas.
- `data/CatalogoTemporal.java`: ejemplos temporales para probar el recorrido completo.
- `config`: configuración CORS para Vite en `http://localhost:5173`.
- `exception`: respuesta JSON para errores no controlados.

## Importante

Los registros de `CatalogoTemporal` son datos demostrativos y no representan el catálogo completo ni oficial de la UASD. Los endpoints y sus modelos permiten probar el flujo; los datos definitivos se incorporarán en una etapa posterior.
