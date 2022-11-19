package com.cibertec.huellitas.mappers;

import com.cibertec.huellitas.dtos.LocalesCreateDTO;
import com.cibertec.huellitas.dtos.LocalesDTO;
import com.cibertec.huellitas.dtos.LocalesUpdateDTO;
import com.cibertec.huellitas.model.Locales;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface LocalesMapper {

    LocalesMapper INSTANCIA = Mappers.getMapper(LocalesMapper.class);

    LocalesDTO localesALocalesDTO(Locales locales);
    Locales    localesDTOALocales(LocalesDTO localesDTO);
    Locales    localesCreateDTOALocales(LocalesCreateDTO localesCreateDTO);
    Locales    localesUpdateDTOALocales(LocalesUpdateDTO localesUpdateDTO);

    List<LocalesDTO> listaLocalesAListaLocalesDTO(List<Locales> listaLocales);

}
