package com.cibertec.huellitas.service;

import com.cibertec.huellitas.dtos.CitaCreateDTO;
import com.cibertec.huellitas.dtos.CitaDTO;
import com.cibertec.huellitas.dtos.CitaUpdateDTO;

import java.util.List;

public interface CitaService {

    List<CitaDTO> listarCitas();
    CitaDTO obtenerCitaPorID(Long id);
    CitaDTO registrarCita(CitaCreateDTO citaCreateDTO);
    CitaDTO actualizarCita(CitaUpdateDTO citaUpdateDTO);
    String eliminarCita(Long id);
}
