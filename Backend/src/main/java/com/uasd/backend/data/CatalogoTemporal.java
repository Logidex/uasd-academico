
package com.uasd.backend.data;

import com.uasd.backend.model.Carrera;
import com.uasd.backend.model.Escuela;
import com.uasd.backend.model.Facultad;
import com.uasd.backend.model.Materia;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CatalogoTemporal {

    // LAS 9 FACULTADES DE LA UASD
    private final List<Facultad> facultades = List.of(
        new Facultad(1L, "Facultad de Humanidades"),
        new Facultad(2L, "Facultad de Ciencias"),
        new Facultad(3L, "Facultad de Ciencias Económicas y Sociales"),
        new Facultad(4L, "Facultad de Ciencias Jurídicas y Políticas"),
        new Facultad(5L, "Facultad de Ingeniería y Arquitectura"),
        new Facultad(6L, "Facultad de Ciencias de la Salud"),
        new Facultad(7L, "Facultad de Ciencias Agronómicas y Veterinarias"),
        new Facultad(8L, "Facultad de Artes"),
        new Facultad(9L, "Facultad de Ciencias de la Educación")
    );

    // ESCUELAS ORGANIZADAS POR FACULTAD
    private final List<Escuela> escuelas = List.of(

        // FACULTAD DE HUMANIDADES
        new Escuela(1L, "Escuela de Comunicación Social", 1L),
        new Escuela(2L, "Escuela de Filosofía", 1L),
        new Escuela(3L, "Escuela de Idiomas", 1L),
        new Escuela(4L, "Escuela de Letras", 1L),
        new Escuela(5L, "Escuela de Psicología", 1L),
        new Escuela(6L, "Escuela de Historia y Antropología", 1L),

        // FACULTAD DE CIENCIAS
        new Escuela(7L, "Escuela de Biología", 2L),
        new Escuela(8L, "Escuela de Geografía", 2L),
        new Escuela(9L, "Escuela de Física", 2L),
        new Escuela(10L, "Escuela de Matemáticas", 2L),
        new Escuela(11L, "Escuela de Microbiología y Parasitología", 2L),
        new Escuela(12L, "Escuela de Química", 2L),
        new Escuela(13L, "Escuela de Informática", 2L),

        // FACULTAD DE CIENCIAS ECONÓMICAS Y SOCIALES
        new Escuela(14L, "Escuela de Administración", 3L),
        new Escuela(15L, "Escuela de Economía", 3L),
        new Escuela(16L, "Escuela de Mercadotecnia", 3L),
        new Escuela(17L, "Escuela de Estadística", 3L),
        new Escuela(18L, "Escuela de Sociología", 3L),
        new Escuela(19L, "Escuela de Contabilidad", 3L),
        new Escuela(20L, "Escuela de Turismo y Hotelería", 3L),

        // FACULTAD DE CIENCIAS JURÍDICAS Y POLÍTICAS
        new Escuela(21L, "Escuela de Derecho", 4L),
        new Escuela(22L, "Escuela de Ciencias Políticas", 4L),

        // FACULTAD DE INGENIERÍA Y ARQUITECTURA
        new Escuela(23L, "Escuela de Arquitectura", 5L),
        new Escuela(24L, "Escuela de Ingeniería Electromecánica", 5L),
        new Escuela(25L, "Escuela de Ingeniería Civil", 5L),
        new Escuela(26L, "Escuela de Ingeniería Química", 5L),
        new Escuela(27L, "Escuela de Agrimensura", 5L),
        new Escuela(28L, "Escuela de Ingeniería Industrial", 5L),

        // FACULTAD DE CIENCIAS DE LA SALUD
        new Escuela(29L, "Escuela de Farmacia", 6L),
        new Escuela(30L, "Escuela de Enfermería", 6L),
        new Escuela(31L, "Escuela de Odontología", 6L),
        new Escuela(32L, "Escuela de Bioanálisis", 6L),
        new Escuela(33L, "Escuela de Medicina", 6L),
        new Escuela(34L, "Escuela de Salud Pública", 6L),
        new Escuela(35L, "Escuela de Ciencias Fisiológicas", 6L),
        new Escuela(36L, "Escuela de Ciencias Morfológicas", 6L),

        // FACULTAD DE CIENCIAS AGRONÓMICAS Y VETERINARIAS
        new Escuela(37L, "Escuela de Agronomía", 7L),
        new Escuela(38L, "Escuela de Zootecnia", 7L),
        new Escuela(39L, "Escuela de Veterinaria", 7L),

        // FACULTAD DE ARTES
        new Escuela(40L, "Escuela de Crítica e Historia del Arte", 8L),
        new Escuela(41L, "Escuela de Publicidad", 8L),
        new Escuela(42L, "Escuela de Teatro y Danza", 8L),
        new Escuela(43L, "Escuela de Música", 8L),
        new Escuela(44L, "Escuela de Cine, Televisión y Fotografía", 8L),
        new Escuela(45L, "Escuela de Diseño Industrial y de Moda", 8L),
        new Escuela(46L, "Escuela de Artes Plásticas", 8L),

        // FACULTAD DE CIENCIAS DE LA EDUCACIÓN
        new Escuela(47L, "Escuela de Teoría y Gestión Educativa", 9L),
        new Escuela(48L, "Escuela de Educación Infantil y Básica", 9L),
        new Escuela(49L, "Escuela de Educación Media", 9L),
        new Escuela(50L, "Escuela de Orientación y Pedagogía", 9L),
        new Escuela(51L, "Escuela de Educación Física y Ciencias del Deporte", 9L),
        new Escuela(52L, "Escuela de Bibliotecología, Tecnología e Innovación", 9L)
    );

    /*
     * DATOS TEMPORALES DE CARRERAS Y MATERIAS.
     * Esta sección queda pendiente de ser sustituida
     * por el compañero responsable de esas funcionalidades.
     */
    private final List<Carrera> carreras = List.of(
        new Carrera(1L, "200820", "Licenciatura en Informática", 13L),
        new Carrera(2L, "DEMO-MAT", "Licenciatura en Matemática", 10L),
        new Carrera(3L, "DEMO-CIV", "Ingeniería Civil", 25L)
    );

    private final List<Materia> materias = List.of(
        new Materia(1L, "INF-101", "Introducción a la Informática", 3, 1, 1L),
        new Materia(2L, "MAT-101", "Matemática Básica", 4, 1, 1L),
        new Materia(3L, "INF-102", "Programación I", 4, 2, 1L),
        new Materia(4L, "INF-103", "Introducción a los Sistemas", 3, 2, 1L),
        new Materia(5L, "MAT-201", "Álgebra", 4, 1, 2L),
        new Materia(6L, "CIV-101", "Introducción a la Ingeniería Civil", 3, 1, 3L)
    );

    public List<Facultad> getFacultades() {
        return facultades;
    }

    public List<Escuela> getEscuelas() {
        return escuelas;
    }

    public List<Carrera> getCarreras() {
        return carreras;
    }

    public List<Materia> getMaterias() {
        return materias;
    }
}
