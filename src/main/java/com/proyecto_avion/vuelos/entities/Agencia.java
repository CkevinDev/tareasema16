package com.proyecto_avion.vuelos.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "agencia")
public class Agencia implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cod_agencia;
    private String nombre;
    private String descripcion;
    private String enc;

    private static final long serialVersion = 1L;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cod_agencia")
    private List<Vuelo> lista_vuelo;

    public Agencia() {
    }

    public Agencia(Long cod_agencia) {
        this.cod_agencia = cod_agencia;
    }

    public Agencia(Long cod_agencia, String nombre, String descripcion, String enc) {
        this.cod_agencia = cod_agencia;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.enc = enc;
    }

    public Long getCod_agencia() {
        return cod_agencia;
    }

    public void setCod_agencia(Long cod_agencia) {
        this.cod_agencia = cod_agencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEnc() {
        return enc;
    }

    public void setEnc(String enc) {
        this.enc = enc;
    }

    public static long getSerialVersion() {
        return serialVersion;
    }

    public List<Vuelo> getLista_vuelo() {
        return lista_vuelo;
    }

    public void setLista_vuelo(List<Vuelo> lista_vuelo) {
        this.lista_vuelo = lista_vuelo;
    }
}
