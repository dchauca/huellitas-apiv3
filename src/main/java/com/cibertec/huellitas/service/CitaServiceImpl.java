package com.cibertec.huellitas.service;

import com.cibertec.huellitas.dtos.CitaCreateDTO;
import com.cibertec.huellitas.dtos.CitaDTO;
import com.cibertec.huellitas.dtos.CitaUpdateDTO;
import com.cibertec.huellitas.mappers.CitaMapper;
import com.cibertec.huellitas.model.Cita;
import com.cibertec.huellitas.repository.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CitaServiceImpl implements CitaService {

    @Autowired
    private CitaRepository citaRepository;

    @Override
    public List<CitaDTO> listarCitas() {

        return CitaMapper.INSTANCIA.listaCitaAListaCitaDTO(citaRepository.findAll());
    }

    @Override
    public CitaDTO obtenerCitaPorID(Long id) {
        Optional<Cita> citaOptional = citaRepository.findById(id);
        CitaDTO citaDTO;
        if(citaOptional.isPresent()){
            citaDTO = CitaMapper.INSTANCIA.citaACitaDTO(citaOptional.get());
        }else{
            citaDTO = null;
        }
        return citaDTO;
    }

    @Override
    public CitaDTO registrarCita(CitaCreateDTO citaCreateDTO) {
        Cita cita = CitaMapper.INSTANCIA.citaCreateDTOACita(citaCreateDTO);
        Cita respuestaEntity = citaRepository.save(cita);
        return CitaMapper.INSTANCIA.citaACitaDTO(respuestaEntity);
    }

    @Override
    public CitaDTO actualizarCita(CitaUpdateDTO citaUpdateDTO) {
        Cita cita = CitaMapper.INSTANCIA.citaUpdateDTOACita(citaUpdateDTO);
        Cita respuestaEntity = citaRepository.save(cita);
        return CitaMapper.INSTANCIA.citaACitaDTO(respuestaEntity);
    }

    @Override
    public String eliminarCita(Long id) {
        Optional<Cita> citaOptional = citaRepository.findById(id);
        String resultado;
        if (citaOptional.isPresent()){
            citaRepository.delete(citaOptional.get());
            resultado="Registro eliminado";
        }else{
            resultado="No se puedo eliminar el registro";
        }
        return resultado;
    }
}









