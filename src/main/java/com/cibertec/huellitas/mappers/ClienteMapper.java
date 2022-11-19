package com.cibertec.huellitas.mappers;

import com.cibertec.huellitas.dtos.ClienteCreateDTO;
import com.cibertec.huellitas.dtos.ClienteDTO;
import com.cibertec.huellitas.dtos.ClienteUpdateDTO;
import com.cibertec.huellitas.model.Cliente;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ClienteMapper {

    ClienteMapper INSTANCIA = Mappers.getMapper(ClienteMapper.class);

    ClienteDTO clienteAClienteDTO(Cliente cliente);
    Cliente    clienteDTOACliente(ClienteDTO clienteDTO);
    Cliente    clienteCreateDTOACliente(ClienteCreateDTO clienteCreateDTO);
    Cliente    clienteUpdateDTOACliente(ClienteUpdateDTO clienteUpdateDTO);

    List<ClienteDTO> listaClienteAListaClienteDTO(List<Cliente> listaCliente);

}
