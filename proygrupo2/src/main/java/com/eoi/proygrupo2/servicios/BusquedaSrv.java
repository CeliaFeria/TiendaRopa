package com.eoi.proygrupo2.servicios;

import com.eoi.proygrupo2.entidades.HistorialBusquedas;
import com.eoi.proygrupo2.entidades.Usuario;

import java.util.List;

public interface BusquedaSrv {
    void GuardarBusqueda(String terminobusqueda, Usuario usuario);
    List<HistorialBusquedas> obtenerHistorialBusquedas();
}
