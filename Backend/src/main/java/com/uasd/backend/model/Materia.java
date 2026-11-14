package com.uasd.backend.model;

public class Materia {
    private Long idMateria;
    private String codigo;
    private String nombre;
    private Integer creditos;
    private Integer periodo;
    private Long idCarrera;

    public Materia() {
    }

    public Materia(Long idMateria, String codigo, String nombre,
                   Integer creditos, Integer periodo, Long idCarrera) {
        this.idMateria = idMateria;
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.periodo = periodo;
        this.idCarrera = idCarrera;
    }

    public Long getIdMateria() { return idMateria; }
    public void setIdMateria(Long idMateria) { this.idMateria = idMateria; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Integer getCreditos() { return creditos; }
    public void setCreditos(Integer creditos) { this.creditos = creditos; }

    public Integer getPeriodo() { return periodo; }
    public void setPeriodo(Integer periodo) { this.periodo = periodo; }

    public Long getIdCarrera() { return idCarrera; }
    public void setIdCarrera(Long idCarrera) { this.idCarrera = idCarrera; }
}
