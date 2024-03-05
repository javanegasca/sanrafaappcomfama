package com.example.sanrafa.moldes;

import java.io.Serializable;

public class Sitios implements Serializable {
    private String nombre;
    private String direccion;
    private String horario;
    private String descripcion;
    private String precio;
    private String recomendaciones;
    private String telefeno;
    private Integer calificacion;

    private Integer fotografia;

    public Sitios() {
    }

    public Sitios(String nombre, String direccion, String horario, String descripcion, String precio, String recomendaciones, String telefeno, Integer calificacion, Integer fotografia) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.horario = horario;
        this.descripcion = descripcion;
        this.precio = precio;
        this.recomendaciones = recomendaciones;
        this.telefeno = telefeno;
        this.calificacion = calificacion;
        this.fotografia = fotografia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getRecomendaciones() {
        return recomendaciones;
    }

    public void setRecomendaciones(String recomendaciones) {
        this.recomendaciones = recomendaciones;
    }

    public String getTelefeno() {
        return telefeno;
    }

    public void setTelefeno(String telefeno) {
        this.telefeno = telefeno;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public Integer getFotografia() {
        return fotografia;
    }

    public void setFotografia(Integer fotografia) {
        this.fotografia = fotografia;
    }
}
