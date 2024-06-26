package com.eoi.proygrupo2.controladores;

import com.eoi.proygrupo2.entidades.Usuario;
import com.eoi.proygrupo2.servicios.BusquedaSrv;
import com.eoi.proygrupo2.servicios.UsuarioSrv;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Busquedacntr {

    @Autowired
    private BusquedaSrv busquedaSrv;

    @Autowired
    private UsuarioSrv usuarioSrv;

    @PostMapping("/busqueda")
    public String buscar(String termino, Usuario usuario) {
        busquedaSrv.GuardarBusqueda(termino, usuario);
        return "resultadosBusqueda";
    }

    @GetMapping("/historial")
    public String verHistorial() {
        busquedaSrv.obtenerHistorialBusquedas();
        return "historialBusquedas";
    }
}
