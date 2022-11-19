package com.cibertec.huellitas.controller;

import com.cibertec.huellitas.dtos.TipoMascotaCreateDTO;
import com.cibertec.huellitas.dtos.TipoMascotaDTO;
import com.cibertec.huellitas.dtos.TipoMascotaUpdateDTO;
import com.cibertec.huellitas.service.TipoMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class TipoMascotaController {

    @Autowired
    private TipoMascotaService tipoMascotaService;

    @GetMapping("tipoMascotas")
    public ResponseEntity<List<TipoMascotaDTO>> listarTipoMascotas(){
        return new ResponseEntity<>(tipoMascotaService.listarTipoMascotas(), HttpStatus.OK);
    }

    @GetMapping("/tipoMascotas/{tipoMascotaId}")
    public ResponseEntity<TipoMascotaDTO> obtenerTipoMascotaPorId(@PathVariable("tipoMascotaId") long tipoMascotaid){
        return new ResponseEntity<>(tipoMascotaService.obtenerTipoMascotaPorID(tipoMascotaid), HttpStatus.OK);
    }

    @PostMapping("tipoMascotas")
    public ResponseEntity<TipoMascotaDTO> registrarTipoMascota(@RequestBody TipoMascotaCreateDTO tipoMascotaCreateDTO){
        return new ResponseEntity<>(tipoMascotaService.registrarTipoMascota(tipoMascotaCreateDTO), HttpStatus.OK);
    }

    @PutMapping("tipoMascotas")
    public ResponseEntity<TipoMascotaDTO> actualizarTipoMascota(@RequestBody TipoMascotaUpdateDTO tipoMascotaUpdateDTO){
        return new ResponseEntity<>(tipoMascotaService.actualizarTipoMascota(tipoMascotaUpdateDTO), HttpStatus.OK);
    }

    @DeleteMapping("/tipoMascotas/{tipoMascotaId}")
    public ResponseEntity<String> eliminarTipoMascota(@PathVariable("tipoMascotaId") long tipoMascotaId){
        return new ResponseEntity<>(tipoMascotaService.eliminarTipoMascota(tipoMascotaId), HttpStatus.OK);
    }


}
