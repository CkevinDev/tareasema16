package com.proyecto_avion.vuelos.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "detalle_reserva")
public class DetalleReserva implements Serializable {

    @Id
    private Long num_reserva;

    private static final long serialVersionUID = 1L;

    @JoinColumn(name = "num_reserva",referencedColumnName = "num_reserva", insertable = false,updatable = false)
    @OneToOne(optional = false)
    private Reserva reserva;

    @JoinColumn(name = "num_vuelo", referencedColumnName = "num_vuelo")
    @ManyToOne(optional = false)
    private Vuelo num_vuelo;

    public DetalleReserva() {
    }

    public DetalleReserva(Long num_reserva) {
        this.num_reserva = num_reserva;
    }

    public Long getNum_reserva() {
        return num_reserva;
    }

    public void setNum_reserva(Long num_reserva) {
        this.num_reserva = num_reserva;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Vuelo getNum_vuelo() {
        return num_vuelo;
    }

    public void setNum_vuelo(Vuelo num_vuelo) {
        this.num_vuelo = num_vuelo;
    }
}
