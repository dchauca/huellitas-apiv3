package com.cibertec.huellitas.service;

import com.cibertec.huellitas.dtos.ClienteDTO;
import com.cibertec.huellitas.dtos.MascotaCreateDTO;
import com.cibertec.huellitas.dtos.MascotaDTO;
import com.cibertec.huellitas.dtos.MascotaUpdateDTO;
import com.cibertec.huellitas.mappers.ClienteMapper;
import com.cibertec.huellitas.mappers.MascotaMapper;
import com.cibertec.huellitas.model.Cliente;
import com.cibertec.huellitas.model.Mascota;
import com.cibertec.huellitas.repository.ClienteRepository;
import com.cibertec.huellitas.repository.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MascotaServiceImpl implements MascotaService{

    @Autowired
    private MascotaRepository mascotaRepository;

    @Override
    public List<MascotaDTO> listarMascotas() {
        return MascotaMapper.INSTANCIA.listaMascotaAListaMascotaDTO(mascotaRepository.findAll());
    }

    @Override
    public MascotaDTO obtenerMascotaPorID(Long id) {

        Optional<Mascota> mascotaOptional = mascotaRepository.findById(id);
        MascotaDTO mascotaDTO;
        if(mascotaOptional.isPresent()){
            mascotaDTO = MascotaMapper.INSTANCIA.mascotaAMascotaDTO(mascotaOptional.get());
        }else{
            mascotaDTO = null;
        }
        return mascotaDTO;
    }

    @Override
    public MascotaDTO registrarMascota(MascotaCreateDTO mascotaCreateDTO) {

        Mascota mascota = MascotaMapper.INSTANCIA.mascotaCreateDTOAMascota(mascotaCreateDTO);
        Mascota respuestaEntity = mascotaRepository.save(mascota);
        return MascotaMapper.INSTANCIA.mascotaAMascotaDTO(respuestaEntity);
    }

    @Override
    public MascotaDTO actualizarMascota(MascotaUpdateDTO mascotaUpdateDTO) {
        Mascota mascota = MascotaMapper.INSTANCIA.mascotaUpdateDTOAMascota(mascotaUpdateDTO);
        Mascota respuestaEntity = mascotaRepository.save(mascota);
        return MascotaMapper.INSTANCIA.mascotaAMascotaDTO(respuestaEntity);
    }

    @Override
    public String eliminarMascota(Long id) {
        Optional<Mascota> mascotaOptional = mascotaRepository.findById(id);
        String resultado;
        if (mascotaOptional.isPresent()){
            mascotaRepository.delete(mascotaOptional.get());
            resultado="Registro eliminado";
        }else{
            resultado="No se puedo eliminar el registro";
        }
        return resultado;
    }
}
