package com.uasd.backend.model;

public class Escuela {
    private Long idEscuela;
    private String nombre;
    private Long idFacultad;

    public Escuela() {}
    public Escuela(Long idEscuela, String nombre, Long idFacultad) {
        this.idEscuela = idEscuela;
        this.nombre = nombre;
        this.idFacultad = idFacultad;
    }
    public Long getIdEscuela() { return idEscuela; }
    public void setIdEscuela(Long idEscuela) { this.idEscuela = idEscuela; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public Long getIdFacultad() { return idFacultad; }
    public void setIdFacultad(Long idFacultad) { this.idFacultad = idFacultad; }
}
