package com.cibertec.huellitas.mappers;

import com.cibertec.huellitas.dtos.TipoMascotaCreateDTO;
import com.cibertec.huellitas.dtos.TipoMascotaDTO;
import com.cibertec.huellitas.dtos.TipoMascotaUpdateDTO;
import com.cibertec.huellitas.model.TipoMascota;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TipoMascotaMapper {

    TipoMascotaMapper INSTANCIA = Mappers.getMapper(TipoMascotaMapper.class);

    TipoMascotaDTO tipoMascotaATipoMascotaDTO(TipoMascota tipoMascota);
    TipoMascota    tipoMascotaDTOATipoMascota(TipoMascotaDTO tipoMascotaDTO);
    TipoMascota    tipoMascotaCreateDTOATipoMascota(TipoMascotaCreateDTO tipoMascotaCreateDTO);
    TipoMascota    tipoMascotaUpdateDTOATipoMascota(TipoMascotaUpdateDTO tipoMascotaUpdateDTO);

    List<TipoMascotaDTO> listaTipoMascotaAListaTipoMascotaDTO(List<TipoMascota> listaTipoMascota);
    
}
