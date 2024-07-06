package com.eoi.proygrupo2.entidades;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pago")

public class Pago implements Serializable {

    @Id
    @Column(name ="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column (name ="formaPago",length = 45)
    private String formaPago;

    @Column (name ="fechaPago")
    private LocalDateTime fechaPago;

    @Column (name ="total")
    private Double total;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "facturas_id", foreignKey = @ForeignKey(name = "fk_pago_facturas"))
    private Factura pagoFactura;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "metodo_pago_id", foreignKey = @ForeignKey(name = "fk_metodo_pago_pago"))
    private MetodoPago metodo_pagoPago;

}

