package com.proyecto_avion.data.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "viajero")
public class Viajero implements Serializable {

    @Id
    private Long num_documento;

    private String nombre;

    private String apellido;

    private int edad;

    private static final long serialVersion = 1L;

    @JoinColumn(name = "num_documento", referencedColumnName = "num_documento",insertable = false,updatable = false)
    @OneToOne(optional = false)
    private Documento documento;

    public Viajero() {
    }

    public Viajero(Long num_documento) {
        this.num_documento = num_documento;
    }

    public Viajero(Long num_documento, String nombre, String apellido, int edad) {
        this.num_documento = num_documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Long getNum_documento() {
        return num_documento;
    }

    public void setNum_documento(Long num_documento) {
        this.num_documento = num_documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static long getSerialVersion() {
        return serialVersion;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }
}
