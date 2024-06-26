package com.eoi.proygrupo2.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class UsuarioDetalle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String Dni;
    private Date FechaNacimiento;
    private String Nombre;
    private String Apellido;
    private String direccion;

    @OneToOne
    @JoinColumn(name="usuario_id", referencedColumnName = "id")
    private Usuario usuario;
}
