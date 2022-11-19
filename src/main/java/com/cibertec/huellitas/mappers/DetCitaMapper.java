package com.cibertec.huellitas.mappers;

import com.cibertec.huellitas.dtos.*;
import com.cibertec.huellitas.model.DetCita;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface DetCitaMapper {

    DetCitaMapper INSTANCIA = Mappers.getMapper(DetCitaMapper.class);

    DetCitaDTO detCitaADetCitaDTO(DetCita detCita);
    DetCita    detCitaDTOADetCita(DetCitaDTO detCitaDTO);
    DetCita    detCitaCreateDTOADetCita(DetCitaCreateDTO detCitaCreateDTO);
    DetCita    detCitaUpdateDTOADetCita(DetCitaUpdateDTO detCitaUpdateDTO);

    List<DetCitaDTO> listaDetCitaAListaDetCitaDTO(List<DetCita> listaDetCita);

}
