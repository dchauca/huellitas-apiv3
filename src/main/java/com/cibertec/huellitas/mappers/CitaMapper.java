package com.cibertec.huellitas.mappers;


import com.cibertec.huellitas.dtos.CitaCreateDTO;
import com.cibertec.huellitas.dtos.CitaDTO;
import com.cibertec.huellitas.dtos.CitaUpdateDTO;
import com.cibertec.huellitas.model.Cita;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CitaMapper {

    CitaMapper INSTANCIA = Mappers.getMapper(CitaMapper.class);

    CitaDTO citaACitaDTO(Cita cita);
    Cita    citaDTOACita(CitaDTO citaDTO);
    Cita    citaCreateDTOACita(CitaCreateDTO citaCreateDTO);
    Cita    citaUpdateDTOACita(CitaUpdateDTO citaUpdateDTO);

    List<CitaDTO> listaCitaAListaCitaDTO(List<Cita> listaCita);
}
