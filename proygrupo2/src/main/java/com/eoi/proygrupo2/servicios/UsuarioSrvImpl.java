package com.eoi.proygrupo2.servicios;

import com.eoi.proygrupo2.entidades.Usuario;
import com.eoi.proygrupo2.entidades.UsuarioDetalle;
import com.eoi.proygrupo2.repos.RepoDetalleUsuario;
import com.eoi.proygrupo2.repos.RepoUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioSrvImpl implements UsuarioSrv {

    @Autowired
    private RepoUsuario repoUsuario;

    @Autowired
    private RepoDetalleUsuario repoDetalleUsuario;

    @Override
    public Usuario login(String usuario, String password) {
        return null;
    }

    @Override
    public Usuario registrarUsuario(Usuario usuario) {
        // contraseña????
        return repoUsuario.save(usuario);
    }

    @Override
    public Optional<UsuarioDetalle> actualizarDetallesUsuario(UsuarioDetalle usuarioDetalle ) {
        return Optional.of(repoDetalleUsuario.save(usuarioDetalle));
    }


}
