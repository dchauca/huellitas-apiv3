package com.cibertec.huellitas.dtos;

import com.cibertec.huellitas.model.Cliente;
import com.cibertec.huellitas.model.TipoMascota;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MascotaDTO {

    private Long idmascota;
    private TipoMascota tipoMascota;
    private String raza;
    private String nombre;
    private Cliente cliente;

}
