package com.eoi.proygrupo2.repos;

import com.eoi.proygrupo2.entidades.HistorialBusquedas;
import com.eoi.proygrupo2.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepoBusquedas extends JpaRepository<HistorialBusquedas, Integer> {
    List<HistorialBusquedas> findByUsuario(Usuario usuario);
}
