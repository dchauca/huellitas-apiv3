package com.cibertec.huellitas.mappers;

import com.cibertec.huellitas.dtos.MascotaCreateDTO;
import com.cibertec.huellitas.dtos.MascotaDTO;
import com.cibertec.huellitas.dtos.MascotaUpdateDTO;
import com.cibertec.huellitas.model.Mascota;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper
public interface MascotaMapper {

    MascotaMapper INSTANCIA = Mappers.getMapper(MascotaMapper.class);

    MascotaDTO mascotaAMascotaDTO(Mascota mascota);
    Mascota    mascotaDTOAMascota(MascotaDTO mascotaDTO);
    Mascota    mascotaCreateDTOAMascota(MascotaCreateDTO mascotaCreateDTO);
    Mascota    mascotaUpdateDTOAMascota(MascotaUpdateDTO mascotaUpdateDTO);

    List<MascotaDTO> listaMascotaAListaMascotaDTO(List<Mascota> listaMascota);
    
}
