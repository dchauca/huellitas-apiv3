package com.cibertec.huellitas.controller;

import com.cibertec.huellitas.dtos.MascotaCreateDTO;
import com.cibertec.huellitas.dtos.MascotaDTO;
import com.cibertec.huellitas.dtos.MascotaUpdateDTO;
import com.cibertec.huellitas.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping
public class MascotaController {

    @Autowired
    private MascotaService mascotaService;

    @GetMapping("mascota")
    public ResponseEntity<List<MascotaDTO>> listarMascota(){
        return new ResponseEntity<>(mascotaService.listarMascotas(), HttpStatus.OK);
    }

    @GetMapping("mascota/{mascotaId}")
    public ResponseEntity<MascotaDTO> obtenerMascotaPorId(@PathVariable("mascotaId") long mascotaid){
        return new ResponseEntity<>(mascotaService.obtenerMascotaPorID(mascotaid), HttpStatus.OK);
    }

    @PostMapping("mascota")
    public ResponseEntity<MascotaDTO> registrarMascota(@RequestBody MascotaCreateDTO mascotaCreateDTO){
        return new ResponseEntity<>(mascotaService.registrarMascota(mascotaCreateDTO), HttpStatus.OK);
    }

    @PutMapping("mascota")
    public ResponseEntity<MascotaDTO> actualizarMascota(@RequestBody MascotaUpdateDTO mascotaUpdateDTO){
        return new ResponseEntity<>(mascotaService.actualizarMascota(mascotaUpdateDTO), HttpStatus.OK);
    }

    @DeleteMapping("mascotas/{mascotaId}")
    public ResponseEntity<String> eliminarMascota(@PathVariable("mascotaId") long mascotaId){
        return new ResponseEntity<>(mascotaService.eliminarMascota(mascotaId), HttpStatus.OK);
    }
    
}
