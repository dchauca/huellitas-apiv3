package com.cibertec.huellitas.mappers;

import com.cibertec.huellitas.dtos.ServiciosCreateDTO;
import com.cibertec.huellitas.dtos.ServiciosDTO;
import com.cibertec.huellitas.dtos.ServiciosUpdateDTO;
import com.cibertec.huellitas.model.Servicios;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper
public interface ServiciosMapper {

    ServiciosMapper INSTANCIA = Mappers.getMapper(ServiciosMapper.class);

    ServiciosDTO serviciosAServiciosDTO(Servicios servicios);
    Servicios    serviciosDTOAServicios(ServiciosDTO serviciosDTO);
    Servicios    serviciosCreateDTOAServicios(ServiciosCreateDTO serviciosCreateDTO);
    Servicios    serviciosUpdateDTOAServicios(ServiciosUpdateDTO serviciosUpdateDTO);

    List<ServiciosDTO> listaServiciosAListaServiciosDTO(List<Servicios> listaServicios);
    
}
