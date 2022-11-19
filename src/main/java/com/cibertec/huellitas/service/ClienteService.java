package com.cibertec.huellitas.service;

import com.cibertec.huellitas.dtos.ClienteCreateDTO;
import com.cibertec.huellitas.dtos.ClienteDTO;
import com.cibertec.huellitas.dtos.ClienteUpdateDTO;

import java.util.List;

public interface ClienteService {

    List<ClienteDTO> listarClientes();
    ClienteDTO obtenerClientePorID(Long id);
    ClienteDTO registrarCliente(ClienteCreateDTO ClienteCreateDTO);
    ClienteDTO actualizarCliente(ClienteUpdateDTO ClienteUpdateDTO);
    String eliminarCliente(Long id);

}

