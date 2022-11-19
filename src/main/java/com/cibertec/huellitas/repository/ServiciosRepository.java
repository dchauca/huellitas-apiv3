package com.cibertec.huellitas.repository;

import com.cibertec.huellitas.model.Servicios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiciosRepository extends JpaRepository<Servicios, Long> {
}
