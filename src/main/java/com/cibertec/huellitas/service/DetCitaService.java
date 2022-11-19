package com.cibertec.huellitas.service;

import com.cibertec.huellitas.dtos.DetCitaCreateDTO;
import com.cibertec.huellitas.dtos.DetCitaDTO;
import com.cibertec.huellitas.dtos.DetCitaUpdateDTO;

import java.util.List;

public interface DetCitaService {

    List<DetCitaDTO> listarDetCitas();
    DetCitaDTO obtenerDetCitaPorID(Long id);
    DetCitaDTO registrarDetCita(DetCitaCreateDTO detCitaCreateDTO);
    DetCitaDTO actualizarDetCita(DetCitaUpdateDTO detCitaUpdateDTO);
    String eliminarDetCita(Long id);

}
