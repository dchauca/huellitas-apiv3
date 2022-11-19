package com.cibertec.huellitas.service;

import com.cibertec.huellitas.dtos.TipoMascotaCreateDTO;
import com.cibertec.huellitas.dtos.TipoMascotaDTO;
import com.cibertec.huellitas.dtos.TipoMascotaUpdateDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TipoMascotaService {

    List<TipoMascotaDTO> listarTipoMascotas();
    TipoMascotaDTO obtenerTipoMascotaPorID(Long id);
    TipoMascotaDTO registrarTipoMascota(TipoMascotaCreateDTO tipoMascotasCreateDTO);
    TipoMascotaDTO actualizarTipoMascota(TipoMascotaUpdateDTO tipoMascotasUpdateDTO);
    String eliminarTipoMascota(Long id);
    
}
