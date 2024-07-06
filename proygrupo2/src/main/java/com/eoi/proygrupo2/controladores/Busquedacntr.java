package com.eoi.proygrupo2.controladores;

import com.eoi.proygrupo2.entidades.Usuario;
import com.eoi.proygrupo2.servicios.BusquedaSrvImpl;
import com.eoi.proygrupo2.servicios.UsuarioSrv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Busquedacntr {

    @Autowired
    private BusquedaSrvImpl busquedaSrvImpl;

    @Autowired
    private UsuarioSrv usuarioSrv;

    @PostMapping("/busqueda")
    public String buscar(String termino, Usuario usuario) {
        busquedaSrvImpl.GuardarBusqueda(termino, usuario);
        return "resultadosBusqueda";
    }

    @GetMapping("/historial")
    public String verHistorial() {
        busquedaSrvImpl.obtenerHistorialBusquedas();
        return "historialBusquedas";
    }
}
