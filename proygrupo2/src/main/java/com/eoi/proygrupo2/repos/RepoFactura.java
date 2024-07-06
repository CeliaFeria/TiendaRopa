package com.eoi.proygrupo2.repos;

import com.eoi.proygrupo2.entidades.DatosFacturacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoFactura extends JpaRepository<DatosFacturacion, Integer> {
}
