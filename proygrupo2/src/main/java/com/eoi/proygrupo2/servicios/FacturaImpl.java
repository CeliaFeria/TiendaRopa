package com.eoi.proygrupo2.servicios;

import com.eoi.proygrupo2.entidades.DatosFacturacion;
import com.eoi.proygrupo2.entidades.HistorialBusquedas;
import com.eoi.proygrupo2.entidades.Usuario;
import com.eoi.proygrupo2.repos.RepoFactura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaImpl {

    @Autowired
    RepoFactura repoFactura;


    public void GuardarFactura(Usuario usuario, String apellidos,String Dni, String nombre ) {
        DatosFacturacion facturacion = new DatosFacturacion();
        facturacion.setUsuario(usuario);
        facturacion.setApellidos(apellidos);
        facturacion.setDni(Dni);
        facturacion.setNombre(nombre);
        repoFactura.save(facturacion);
    }

    public List<DatosFacturacion> listaFacturas() {
        return repoFactura.findAll(); //habria que darle el usuario????
    }


}
