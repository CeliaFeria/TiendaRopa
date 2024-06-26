package com.eoi.proygrupo2.repos;

import com.eoi.proygrupo2.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoUsuario extends JpaRepository<Usuario, Integer> {
}
