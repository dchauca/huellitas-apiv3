package com.cibertec.huellitas.service;

import com.cibertec.huellitas.dtos.ClienteDTO;
import com.cibertec.huellitas.dtos.TipoMascotaCreateDTO;
import com.cibertec.huellitas.dtos.TipoMascotaDTO;
import com.cibertec.huellitas.dtos.TipoMascotaUpdateDTO;
import com.cibertec.huellitas.mappers.ClienteMapper;
import com.cibertec.huellitas.mappers.TipoMascotaMapper;
import com.cibertec.huellitas.model.Cliente;
import com.cibertec.huellitas.model.TipoMascota;
import com.cibertec.huellitas.repository.ClienteRepository;
import com.cibertec.huellitas.repository.TipoMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoMascotaServiceImpl implements TipoMascotaService{

    @Autowired
    private TipoMascotaRepository tipoMascotaRepository;

    @Override
    public List<TipoMascotaDTO> listarTipoMascotas() {
        return TipoMascotaMapper.INSTANCIA.listaTipoMascotaAListaTipoMascotaDTO(tipoMascotaRepository.findAll());
    }

    @Override
    public TipoMascotaDTO obtenerTipoMascotaPorID(Long id) {
        Optional<TipoMascota> tipoMascotaOptional = tipoMascotaRepository.findById(id);
        TipoMascotaDTO tipoMascotaDTO;
        if(tipoMascotaOptional.isPresent()){
            tipoMascotaDTO = TipoMascotaMapper.INSTANCIA.tipoMascotaATipoMascotaDTO(tipoMascotaOptional.get());
        }else{
            tipoMascotaDTO = null;
        }
        return tipoMascotaDTO;
    }

    @Override
    public TipoMascotaDTO registrarTipoMascota(TipoMascotaCreateDTO tipoMascotasCreateDTO) {
        TipoMascota tipoMascota = TipoMascotaMapper.INSTANCIA.tipoMascotaCreateDTOATipoMascota(tipoMascotasCreateDTO);
        TipoMascota respuestaEntity = tipoMascotaRepository.save(tipoMascota);
        return TipoMascotaMapper.INSTANCIA.tipoMascotaATipoMascotaDTO(respuestaEntity);
    }

    @Override
    public TipoMascotaDTO actualizarTipoMascota(TipoMascotaUpdateDTO tipoMascotasUpdateDTO) {
        TipoMascota tipoMascota = TipoMascotaMapper.INSTANCIA.tipoMascotaUpdateDTOATipoMascota(tipoMascotasUpdateDTO);
        TipoMascota respuestaEntity = tipoMascotaRepository.save(tipoMascota);
        return TipoMascotaMapper.INSTANCIA.tipoMascotaATipoMascotaDTO(respuestaEntity);
    }

    @Override
    public String eliminarTipoMascota(Long id) {
        Optional<TipoMascota> tipoMascotaOptional = tipoMascotaRepository.findById(id);
        String resultado;
        if (tipoMascotaOptional.isPresent()){
            tipoMascotaRepository.delete(tipoMascotaOptional.get());
            resultado="Registro eliminado";
        }else{
            resultado="No se puedo eliminar el registro";
        }
        return resultado;
    }
}
