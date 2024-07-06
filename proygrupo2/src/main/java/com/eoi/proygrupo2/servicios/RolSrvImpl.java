package com.eoi.proygrupo2.servicios;

import com.eoi.proygrupo2.entidades.Rl;
import com.eoi.proygrupo2.repos.Reporl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolSrvImpl implements RolSrv {

        @Autowired
        Reporl rolRepository;

        public Rl crearRol(Rl rol) {
            return rolRepository.save(rol);
        }

        public List<Rl> obtenerTodosLosRoles() {
            return rolRepository.findAll();
        }
}
