package com.cibertec.huellitas.repository;

import com.cibertec.huellitas.model.DetCita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetCitaRepository extends JpaRepository <DetCita, Long> {
}
