package com.cibertec.huellitas.service;

import com.cibertec.huellitas.dtos.ClienteDTO;
import com.cibertec.huellitas.dtos.ServiciosCreateDTO;
import com.cibertec.huellitas.dtos.ServiciosDTO;
import com.cibertec.huellitas.dtos.ServiciosUpdateDTO;
import com.cibertec.huellitas.mappers.ClienteMapper;
import com.cibertec.huellitas.mappers.ServiciosMapper;
import com.cibertec.huellitas.model.Cliente;
import com.cibertec.huellitas.model.Servicios;
import com.cibertec.huellitas.repository.ClienteRepository;
import com.cibertec.huellitas.repository.ServiciosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiciosServiceImpl implements ServiciosService{

    @Autowired
    private ServiciosRepository serviciosRepository;

    @Override
    public List<ServiciosDTO> listarServicios() {
        return ServiciosMapper.INSTANCIA.listaServiciosAListaServiciosDTO(serviciosRepository.findAll());
    }

    @Override
    public ServiciosDTO obtenerServicioPorID(Long id) {
        Optional<Servicios> serviciosOptional = serviciosRepository.findById(id);
        ServiciosDTO serviciosDTO;
        if(serviciosOptional.isPresent()){
            serviciosDTO = ServiciosMapper.INSTANCIA.serviciosAServiciosDTO(serviciosOptional.get());
        }else{
            serviciosDTO = null;
        }
        return serviciosDTO;
    }

    @Override
    public ServiciosDTO registrarServicio(ServiciosCreateDTO serviciosCreateDTO) {
        Servicios servicios = ServiciosMapper.INSTANCIA.serviciosCreateDTOAServicios(serviciosCreateDTO);
        Servicios respuestaEntity = serviciosRepository.save(servicios);
        return ServiciosMapper.INSTANCIA.serviciosAServiciosDTO(respuestaEntity);
    }

    @Override
    public ServiciosDTO actualizarServicio(ServiciosUpdateDTO serviciosUpdateDTO) {
        Servicios servicios = ServiciosMapper.INSTANCIA.serviciosUpdateDTOAServicios(serviciosUpdateDTO);
        Servicios respuestaEntity = serviciosRepository.save(servicios);
        return ServiciosMapper.INSTANCIA.serviciosAServiciosDTO(respuestaEntity);
    }

    @Override
    public String eliminarServicio(Long id) {
        Optional<Servicios> serviciosOptional = serviciosRepository.findById(id);
        String resultado;
        if (serviciosOptional.isPresent()){
            serviciosRepository.delete(serviciosOptional.get());
            resultado="Registro eliminado";
        }else{
            resultado="No se puedo eliminar el registro";
        }
        return resultado;
    }
}
