package com.cibertec.huellitas.service;

import com.cibertec.huellitas.dtos.DetCitaCreateDTO;
import com.cibertec.huellitas.dtos.DetCitaDTO;
import com.cibertec.huellitas.dtos.DetCitaUpdateDTO;
import com.cibertec.huellitas.mappers.DetCitaMapper;
import com.cibertec.huellitas.model.DetCita;
import com.cibertec.huellitas.repository.DetCitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetCitaServiceImpl implements DetCitaService{

    @Autowired
    private DetCitaRepository detCitaRepository;


    @Override
    public List<DetCitaDTO> listarDetCitas() {
        return DetCitaMapper.INSTANCIA.listaDetCitaAListaDetCitaDTO(detCitaRepository.findAll());
    }

    @Override
    public DetCitaDTO obtenerDetCitaPorID(Long id) {
        Optional<DetCita> detCitaOptional = detCitaRepository.findById(id);
        DetCitaDTO detCitaDTO;
        if(detCitaOptional.isPresent()){
            detCitaDTO = DetCitaMapper.INSTANCIA.detCitaADetCitaDTO(detCitaOptional.get());
        }else{
            detCitaDTO = null;
        }
        return detCitaDTO;
    }

    @Override
    public DetCitaDTO registrarDetCita(DetCitaCreateDTO detCitaCreateDTO) {
        DetCita detCita = DetCitaMapper.INSTANCIA.detCitaCreateDTOADetCita(detCitaCreateDTO);
        DetCita respuestaEntity = detCitaRepository.save(detCita);
        return DetCitaMapper.INSTANCIA.detCitaADetCitaDTO(respuestaEntity);
    }

    @Override
    public DetCitaDTO actualizarDetCita(DetCitaUpdateDTO detCitaUpdateDTO) {
        DetCita detCita = DetCitaMapper.INSTANCIA.detCitaUpdateDTOADetCita(detCitaUpdateDTO);
        DetCita respuestaEntity = detCitaRepository.save(detCita);
        return DetCitaMapper.INSTANCIA.detCitaADetCitaDTO(respuestaEntity);
    }

    @Override
    public String eliminarDetCita(Long id) {
        Optional<DetCita> detCitaOptional = detCitaRepository.findById(id);
        String resultado;
        if (detCitaOptional.isPresent()){
            detCitaRepository.delete(detCitaOptional.get());
            resultado="Registro eliminado";
        }else{
            resultado="No se pudo eliminar el registro";
        }
        return resultado;
    }
}











