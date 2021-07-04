package com.proyecto_avion.data.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "vuelo")
public class Vuelo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long num_vuelo;


    private String ciudad_origen;

    private String ciudad_destino;

    @Temporal(TemporalType.DATE)
    private Date fecha_ida;

    @Temporal(TemporalType.DATE)
    private Date fecha_vuelta;

    private double precio;

    private int stock;

    private static final long serialVersion = 1L;

    @JoinColumn(name = "cod_agencia", referencedColumnName = "cod_agencia")
    @ManyToOne(optional = false)
    private Agencia cod_agencia;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "num_vuelo")
    private List<DetalleReserva> lista_detalle_reserva;

    public Vuelo() {
    }

    public Vuelo(Long num_vuelo) {
        this.num_vuelo = num_vuelo;
    }

    public Vuelo(Long num_vuelo, String ciudad_origen, String ciudad_destino, Date fecha_ida, Date fecha_vuelta, double precio, int stock) {
        this.num_vuelo = num_vuelo;
        this.ciudad_origen = ciudad_origen;
        this.ciudad_destino = ciudad_destino;
        this.fecha_ida = fecha_ida;
        this.fecha_vuelta = fecha_vuelta;
        this.precio = precio;
        this.stock = stock;
    }

    public Long getNum_vuelo() {
        return num_vuelo;
    }

    public void setNum_vuelo(Long num_vuelo) {
        this.num_vuelo = num_vuelo;
    }

    public String getCiudad_origen() {
        return ciudad_origen;
    }

    public void setCiudad_origen(String ciudad_origen) {
        this.ciudad_origen = ciudad_origen;
    }

    public String getCiudad_destino() {
        return ciudad_destino;
    }

    public void setCiudad_destino(String ciudad_destino) {
        this.ciudad_destino = ciudad_destino;
    }

    public Date getFecha_ida() {
        return fecha_ida;
    }

    public void setFecha_ida(Date fecha_ida) {
        this.fecha_ida = fecha_ida;
    }

    public Date getFecha_vuelta() {
        return fecha_vuelta;
    }

    public void setFecha_vuelta(Date fecha_vuelta) {
        this.fecha_vuelta = fecha_vuelta;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public static long getSerialVersion() {
        return serialVersion;
    }

    public Agencia getCod_agencia() {
        return cod_agencia;
    }

    public void setCod_agencia(Agencia cod_agencia) {
        this.cod_agencia = cod_agencia;
    }

    public List<DetalleReserva> getLista_detalle_reserva() {
        return lista_detalle_reserva;
    }

    public void setLista_detalle_reserva(List<DetalleReserva> lista_detalle_reserva) {
        this.lista_detalle_reserva = lista_detalle_reserva;
    }
}
