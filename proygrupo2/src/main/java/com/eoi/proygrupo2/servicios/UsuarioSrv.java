package com.eoi.proygrupo2.servicios;

import com.eoi.proygrupo2.entidades.Usuario;
import com.eoi.proygrupo2.entidades.UsuarioDetalle;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface UsuarioSrv {

    Usuario login(String usuario, String contraseña);
    Usuario registrarUsuario(Usuario usuario);
    Optional<UsuarioDetalle> actualizarDetallesUsuario(UsuarioDetalle usuarioDetalle);
}
