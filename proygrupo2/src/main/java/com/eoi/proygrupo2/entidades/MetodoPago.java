package com.eoi.proygrupo2.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "metodo_pago")

public class MetodoPago implements Serializable {

    @Id
    @Column(name ="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column (name ="nombre", length = 45)
    private String nombre;

    @Column (name ="pago_externo", length = 45)
    private String pago_externo;

    @OneToMany(mappedBy = "metodo_pagoPago", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Pago> pagoMetodo_pago;

}

