package com.cibertec.huellitas.service;

import com.cibertec.huellitas.dtos.LocalesCreateDTO;
import com.cibertec.huellitas.dtos.LocalesDTO;
import com.cibertec.huellitas.dtos.LocalesUpdateDTO;
import com.cibertec.huellitas.mappers.LocalesMapper;
import com.cibertec.huellitas.model.Locales;
import com.cibertec.huellitas.repository.LocalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocalesServiceImpl implements LocalesService{

    @Autowired
    private LocalesRepository localesRepository;

    @Override
    public List<LocalesDTO> listarLocales() {
        return LocalesMapper.INSTANCIA.listaLocalesAListaLocalesDTO(localesRepository.findAll());
    }

    @Override
    public LocalesDTO obtenerLocalesPorID(Long id) {
        Optional<Locales> localesOptional = localesRepository.findById(id);
        LocalesDTO localesDTO;
        if(localesOptional.isPresent()){
            localesDTO = LocalesMapper.INSTANCIA.localesALocalesDTO(localesOptional.get());
        }else{
            localesDTO = null;
        }
        return localesDTO;
    }

    @Override
    public LocalesDTO registrarLocales(LocalesCreateDTO localesCreateDTO) {
        Locales locales = LocalesMapper.INSTANCIA.localesCreateDTOALocales(localesCreateDTO);
        Locales respuestaEntity = localesRepository.save(locales);
        return LocalesMapper.INSTANCIA.localesALocalesDTO(respuestaEntity);
    }

    @Override
    public LocalesDTO actualizarLocales(LocalesUpdateDTO localesUpdateDTO) {
        Locales locales = LocalesMapper.INSTANCIA.localesUpdateDTOALocales(localesUpdateDTO);
        Locales respuestaEntity = localesRepository.save(locales);
        return LocalesMapper.INSTANCIA.localesALocalesDTO(respuestaEntity);
    }

    @Override
    public String eliminarLocales(Long id) {
        Optional<Locales> localesOptional = localesRepository.findById(id);
        String resultado;
        if (localesOptional.isPresent()){
            localesRepository.delete(localesOptional.get());
            resultado="Registro eliminado";
        }else{
            resultado="No se puedo eliminar el registro";
        }
        return resultado;
    }
}
