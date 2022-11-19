package com.cibertec.huellitas.dtos;

import com.cibertec.huellitas.model.Cliente;
import com.cibertec.huellitas.model.Locales;
import com.cibertec.huellitas.model.Mascota;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
public class CitaCreateDTO {

    private Date fecha;
    private Cliente cliente;
    private Mascota mascota;
    private Locales locales;

}
