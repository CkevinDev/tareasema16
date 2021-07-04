package com.proyecto_avion.data.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "documento")
public class Documento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long num_documento;
    private String tipo;
    @Temporal(TemporalType.DATE)
    private Date fecha;
    private int total;
    private long stock;

    private static final long serialVersion = 1L;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "documento")
    private Viajero viajero;

    @JoinColumn(name = "num_reserva", referencedColumnName = "num_reserva")
    @ManyToOne(optional = false)
    private Reserva num_reserva;

    @JoinColumn(name = "cod_usuario",referencedColumnName = "cod_usuario")
    @ManyToOne(optional = false)
    private Usuario cod_usuario;

    public Documento() {
    }

    public Documento(Long num_documento) {
        this.num_documento = num_documento;
    }

    public Documento(Long num_documento, String tipo, Date fecha, int total, long stock) {
        this.num_documento = num_documento;
        this.tipo = tipo;
        this.fecha = fecha;
        this.total = total;
        this.stock = stock;
    }

    public Long getNum_documento() {
        return num_documento;
    }

    public void setNum_documento(Long num_documento) {
        this.num_documento = num_documento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public long getStock() {
        return stock;
    }

    public void setStock(long stock) {
        this.stock = stock;
    }

    public static long getSerialVersion() {
        return serialVersion;
    }

    public Viajero getViajero() {
        return viajero;
    }

    public void setViajero(Viajero viajero) {
        this.viajero = viajero;
    }

    public Reserva getNum_reserva() {
        return num_reserva;
    }

    public void setNum_reserva(Reserva num_reserva) {
        this.num_reserva = num_reserva;
    }

    public Usuario getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(Usuario cod_usuario) {
        this.cod_usuario = cod_usuario;
    }
}
