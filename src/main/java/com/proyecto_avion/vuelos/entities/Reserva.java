package com.proyecto_avion.vuelos.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "reserva")
public class Reserva implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long num_reserva;
    @Temporal(TemporalType.DATE)
    private Date fecha;
    private int total;

    private static final long serialVersionUID = 1L;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "num_reserva")
    private List<Documento> lista_documento;

    @JoinColumn(name = "cod_usuario", referencedColumnName = "cod_usuario")
    @ManyToOne(optional = false)
    private Usuario cod_usuario;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "reserva")
    private DetalleReserva detalleReserva;

    public Reserva() {
    }

    public Reserva(Long num_reserva) {
        this.num_reserva = num_reserva;
    }

    public Reserva(Long num_reserva, Date fecha, int total) {
        this.num_reserva = num_reserva;
        this.fecha = fecha;
        this.total = total;
    }

    public Long getNum_reserva() {
        return num_reserva;
    }

    public void setNum_reserva(Long num_reserva) {
        this.num_reserva = num_reserva;
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

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public List<Documento> getLista_documento() {
        return lista_documento;
    }

    public void setLista_documento(List<Documento> lista_documento) {
        this.lista_documento = lista_documento;
    }

    public Usuario getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(Usuario cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public DetalleReserva getDetalleReserva() {
        return detalleReserva;
    }

    public void setDetalleReserva(DetalleReserva detalleReserva) {
        this.detalleReserva = detalleReserva;
    }
}
