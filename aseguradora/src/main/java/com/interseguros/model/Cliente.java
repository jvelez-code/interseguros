package com.interseguros.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Generación automática del ID
    @Column(name = "cod_cliente", nullable = false)
    private Integer codCliente;

    @Column(name = "tipo_documento")
    private String tipoDocumento;

    @Column(name = "cedula_cliente")
    private String cedulaCliente;

    @Column(name = "correo_cliente")
    private String correoCliente;

    @ManyToOne
    @JoinColumn(name = "cod_ubicacion", nullable = false, foreignKey = @ForeignKey(name = "fk_cliente_ubicacion"))
    private Ubicacion ubicacion;

    public Cliente() {
    }

    public Integer getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Integer codCliente) {
        this.codCliente = codCliente;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
}


