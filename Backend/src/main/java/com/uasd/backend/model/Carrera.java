package com.uasd.backend.model;

public class Carrera {
    private Long idCarrera;
    private String codigo;
    private String nombre;
    private Long idEscuela;

    public Carrera() {}
    public Carrera(Long idCarrera, String codigo, String nombre, Long idEscuela) {
        this.idCarrera = idCarrera;
        this.codigo = codigo;
        this.nombre = nombre;
        this.idEscuela = idEscuela;
    }
    public Long getIdCarrera() { return idCarrera; }
    public void setIdCarrera(Long idCarrera) { this.idCarrera = idCarrera; }
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public Long getIdEscuela() { return idEscuela; }
    public void setIdEscuela(Long idEscuela) { this.idEscuela = idEscuela; }
}
