package com.eoi.proygrupo2.servicios;

import com.eoi.proygrupo2.entidades.Rl;

import java.util.List;

public interface RolSrv {
    Rl crearRol(Rl rol);
    List<Rl> obtenerTodosLosRoles();

}
