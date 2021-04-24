package com.example.gestioncamiones.repository;

import com.example.gestioncamiones.model.Trabajador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItrabajadorRepository extends JpaRepository<Trabajador,Integer> {
}
