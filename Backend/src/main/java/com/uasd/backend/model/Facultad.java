package com.uasd.backend.model;

public class Facultad {
    private Long idFacultad;
    private String nombre;

    public Facultad() {}
    public Facultad(Long idFacultad, String nombre) {
        this.idFacultad = idFacultad;
        this.nombre = nombre;
    }
    public Long getIdFacultad() { return idFacultad; }
    public void setIdFacultad(Long idFacultad) { this.idFacultad = idFacultad; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
}
