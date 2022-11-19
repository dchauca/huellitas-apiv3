package com.cibertec.huellitas.service;

import com.cibertec.huellitas.dtos.*;
import com.cibertec.huellitas.mappers.ClienteMapper;
import com.cibertec.huellitas.model.Cliente;
import com.cibertec.huellitas.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {


    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<ClienteDTO> listarClientes() {
        return ClienteMapper.INSTANCIA.listaClienteAListaClienteDTO(clienteRepository.findAll());
    }

    @Override
    public ClienteDTO obtenerClientePorID(Long id) {
        Optional<Cliente> clienteOptional = clienteRepository.findById(id);
        ClienteDTO clienteDTO;
        if(clienteOptional.isPresent()){
            clienteDTO = ClienteMapper.INSTANCIA.clienteAClienteDTO(clienteOptional.get());
        }else{
            clienteDTO = null;
        }
        return clienteDTO;
    }

    @Override
    public ClienteDTO registrarCliente(ClienteCreateDTO clienteCreateDTO) {
        Cliente cliente = ClienteMapper.INSTANCIA.clienteCreateDTOACliente(clienteCreateDTO);
        Cliente respuestaEntity = clienteRepository.save(cliente);
        return ClienteMapper.INSTANCIA.clienteAClienteDTO(respuestaEntity);
    }

    @Override
    public ClienteDTO actualizarCliente(ClienteUpdateDTO clienteUpdateDTO) {
        Cliente cliente = ClienteMapper.INSTANCIA.clienteUpdateDTOACliente(clienteUpdateDTO);
        Cliente respuestaEntity = clienteRepository.save(cliente);
        return ClienteMapper.INSTANCIA.clienteAClienteDTO(respuestaEntity);
    }

    @Override
    public String eliminarCliente(Long id) {
        Optional<Cliente> clienteOptional = clienteRepository.findById(id);
        String resultado;
        if (clienteOptional.isPresent()){
            clienteRepository.delete(clienteOptional.get());
            resultado="Registro eliminado";
        }else{
            resultado="No se puedo eliminar el registro";
        }
        return resultado;
    }

}
