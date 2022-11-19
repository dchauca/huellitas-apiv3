package com.cibertec.huellitas.dtos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteCreateDTO {

    private String nombres;
    private String apepat;
    private String apemat;
    private int dni;
    private int telefono;

}
