package com.cibertec.huellitas.service;

import com.cibertec.huellitas.dtos.MascotaCreateDTO;
import com.cibertec.huellitas.dtos.MascotaDTO;
import com.cibertec.huellitas.dtos.MascotaUpdateDTO;

import java.util.List;

public interface MascotaService {

    List<MascotaDTO> listarMascotas();
    MascotaDTO obtenerMascotaPorID(Long id);
    MascotaDTO registrarMascota(MascotaCreateDTO mascotaCreateDTO);
    MascotaDTO actualizarMascota(MascotaUpdateDTO mascotaUpdateDTO);
    String eliminarMascota(Long id);
    
}
