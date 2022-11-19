package com.cibertec.huellitas.dtos;

import com.cibertec.huellitas.model.Cita;
import com.cibertec.huellitas.model.Servicios;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DetCitaUpdateDTO {
    private Long iddetcita;
    private Cita cita;
    private Servicios servicios;
}
