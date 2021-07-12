package com.proyecto_avion.vuelos.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "tarjeta")
public class Tarjeta implements Serializable {

    @Id
    private Long numero_tarjeta;
    private String tipo;
    @Temporal(TemporalType.DATE)
    private Date fecha_caducidad;

    private static final long serialVersion = 1L;

    @JoinColumn(name = "cod_usuario", referencedColumnName = "cod_usuario")
    @ManyToOne(optional = false)
    private Usuario cod_usuario;

    public Tarjeta() {
    }

    public Tarjeta(Long numero_tarjeta) {
        this.numero_tarjeta = numero_tarjeta;
    }

    public Tarjeta(Long numero_tarjeta, String tipo, Date fecha_caducidad) {
        this.numero_tarjeta = numero_tarjeta;
        this.tipo = tipo;
        this.fecha_caducidad = fecha_caducidad;
    }

    public Long getNumero_tarjeta() {
        return numero_tarjeta;
    }

    public void setNumero_tarjeta(Long numero_tarjeta) {
        this.numero_tarjeta = numero_tarjeta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFecha_caducidad() {
        return fecha_caducidad;
    }

    public void setFecha_caducidad(Date fecha_caducidad) {
        this.fecha_caducidad = fecha_caducidad;
    }

    public static long getSerialVersion() {
        return serialVersion;
    }

    public Usuario getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(Usuario cod_usuario) {
        this.cod_usuario = cod_usuario;
    }
}
