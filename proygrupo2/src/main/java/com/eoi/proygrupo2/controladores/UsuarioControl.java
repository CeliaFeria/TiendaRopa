package com.eoi.proygrupo2.controladores;

import com.eoi.proygrupo2.entidades.Usuario;
import com.eoi.proygrupo2.entidades.UsuarioDetalle;
import com.eoi.proygrupo2.servicios.UsuarioSrv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class UsuarioControl {

    @Autowired
    private UsuarioSrv usuarioSrv;

    @GetMapping("/usuario/registro")
    public String mostrarFormularioRegistro(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "registro";
    }
    
    @PostMapping("/usuario/registro")
    public String registrarUsuario(@ModelAttribute("usuario") Usuario usuario) {
        usuarioSrv.registrarUsuario(usuario);
        return "/registrosatisfactorio";
    }
    @GetMapping("/usuario/login")
    public String mostrarFormularioLogin() {
        return "login";
    }

    @GetMapping("/detalles")
    public String mostrarDetallesUsuario(UsuarioDetalle usuariodetalle, Usuario usuario, Model model) {

        Optional<UsuarioDetalle> detalle = usuarioSrv.actualizarDetallesUsuario(usuariodetalle);

        if (detalle.isPresent()) {
            model.addAttribute("detalle", detalle.get());
        } else {
            model.addAttribute("detalle", new UsuarioDetalle());
        }

        model.addAttribute("usuario", usuario);
        return "detallesUsuario";
    }

    @PostMapping("/detalles")
    public String actualizarDetallesUsuario(@ModelAttribute UsuarioDetalle detalle) {
        usuarioSrv.actualizarDetallesUsuario(detalle);
        return "detallesUsuario";
    }
}


