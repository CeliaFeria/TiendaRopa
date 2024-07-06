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
@Table(name = "facturas")
public class Factura implements Serializable {

    @Id
    @Column(name ="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column (name ="importe")
    private Integer importe;

    @Column (name ="fechaFactura")
    private LocalDateTime fechaFactura;

    @Column (name ="fechaVencimiento")
    private LocalDateTime fechaVencimiento;

    @OneToOne(mappedBy = "pagoFactura", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Pago pagoFacturas; // No se usa Set <> con OneToOne

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "pedido_id", foreignKey = @ForeignKey(name = "fk_pedido_factura"))
    private Pedido pedidoFactura;

}

