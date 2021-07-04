package com.proyecto_avion.data.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cod_usuario;
    private String nombre;
    private String apellido;
    private String direccion;
    private String usuario;
    private String password;
    private String email;
    @Temporal(TemporalType.DATE)
    private Date create_at;

    private static final long serialVersionUID = 1L;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "cod_usuario")
    private List<Documento> lista_documento;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cod_usuario")
    private List<Reserva> lista_reserva;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cod_usuario")
    private List<Tarjeta> lista_tarjeta;


    public Usuario() {
    }

    public Usuario(Long cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public Usuario(Long cod_usuario, String nombre, String apellido, String direccion, String usuario, String password, String email, Date create_at) {
        this.cod_usuario = cod_usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.usuario = usuario;
        this.password = password;
        this.email = email;
        this.create_at = create_at;
    }

    public Long getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(Long cod_usuario) {
        this.cod_usuario = cod_usuario;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Date create_at) {
        this.create_at = create_at;
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

    public List<Reserva> getLista_reserva() {
        return lista_reserva;
    }

    public void setLista_reserva(List<Reserva> lista_reserva) {
        this.lista_reserva = lista_reserva;
    }

    public List<Tarjeta> getLista_tarjeta() {
        return lista_tarjeta;
    }

    public void setLista_tarjeta(List<Tarjeta> lista_tarjeta) {
        this.lista_tarjeta = lista_tarjeta;
    }
}
