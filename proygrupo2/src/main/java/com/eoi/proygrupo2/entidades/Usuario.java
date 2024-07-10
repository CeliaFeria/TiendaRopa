package com.eoi.proygrupo2.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Usuario {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String contraseña;
    private String email;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "usuario_roles",
            joinColumns = @JoinColumn(name = "id", nullable = false),
            inverseJoinColumns = @JoinColumn(name="rol_id", nullable = false)
    )
    private List<Rl> roles;

    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
    private UsuarioDetalle detalle;

    @OneToMany(mappedBy = "usuarioPedido", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Pedido> pedidoUsuario;
}
