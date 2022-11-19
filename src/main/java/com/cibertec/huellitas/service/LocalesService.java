package com.cibertec.huellitas.service;

import com.cibertec.huellitas.dtos.LocalesCreateDTO;
import com.cibertec.huellitas.dtos.LocalesDTO;
import com.cibertec.huellitas.dtos.LocalesUpdateDTO;

import java.util.List;

public interface LocalesService {

    List<LocalesDTO> listarLocales();
    LocalesDTO obtenerLocalesPorID(Long id);
    LocalesDTO registrarLocales(LocalesCreateDTO localesCreateDTO);
    LocalesDTO actualizarLocales(LocalesUpdateDTO localesUpdateDTO);
    String eliminarLocales(Long id);



}
