package com.eoi.proygrupo2.servicios;


import com.eoi.proygrupo2.entidades.HistorialBusquedas;
import com.eoi.proygrupo2.entidades.Usuario;
import com.eoi.proygrupo2.repos.RepoBusquedas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusquedaSrv {

    @Autowired
    RepoBusquedas repoBusquedas;

    public void GuardarBusqueda(String terminobusqueda, Usuario usuario) {
        HistorialBusquedas busqueda = new HistorialBusquedas();
        busqueda.setUsuario(usuario);
        busqueda.setBusqueda(terminobusqueda);
        repoBusquedas.save(busqueda);
    }

    public List<HistorialBusquedas> obtenerHistorialBusquedas() {
        return repoBusquedas.findAll(); //habria que darle el usuario????
    }
}
