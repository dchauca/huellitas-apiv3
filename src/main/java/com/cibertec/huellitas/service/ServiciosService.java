package com.cibertec.huellitas.service;

import com.cibertec.huellitas.dtos.ServiciosCreateDTO;
import com.cibertec.huellitas.dtos.ServiciosDTO;
import com.cibertec.huellitas.dtos.ServiciosUpdateDTO;

import java.util.List;

public interface ServiciosService {

    List<ServiciosDTO> listarServicios();
    ServiciosDTO obtenerServicioPorID(Long id);
    ServiciosDTO registrarServicio(ServiciosCreateDTO serviciosCreateDTO);
    ServiciosDTO actualizarServicio(ServiciosUpdateDTO serviciosUpdateDTO);
    String eliminarServicio(Long id);
    
}
