package com.cibertec.huellitas.controller;

import com.cibertec.huellitas.dtos.CitaCreateDTO;
import com.cibertec.huellitas.dtos.CitaDTO;
import com.cibertec.huellitas.dtos.CitaUpdateDTO;
import com.cibertec.huellitas.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class CitaController {

    @Autowired
    private CitaService citaService;

    @GetMapping("citas")
    public ResponseEntity<List<CitaDTO>> listarCitas(){
        return new ResponseEntity<>(citaService.listarCitas(), HttpStatus.OK);
    }

    @GetMapping("citas/{citaId}")
    public ResponseEntity<CitaDTO> obtenerCitaPorId(@PathVariable("citaId") long citaId){
        return new ResponseEntity<>(citaService.obtenerCitaPorID(citaId), HttpStatus.OK);
    }

    @PostMapping("citas")
    public ResponseEntity<CitaDTO> registrarCita(@RequestBody CitaCreateDTO citaCreateDTO){
        return new ResponseEntity<>(citaService.registrarCita(citaCreateDTO), HttpStatus.OK);
    }

    @PutMapping("citas")
    public ResponseEntity<CitaDTO> actualizarCita(@RequestBody CitaUpdateDTO citaUpdateDTO){
        return new ResponseEntity<>(citaService.actualizarCita(citaUpdateDTO), HttpStatus.OK);
    }

    @DeleteMapping("citas/{citaId}")
    public ResponseEntity<String> eliminarCita(@PathVariable("citaId") long citaId){
        return new ResponseEntity<>(citaService.eliminarCita(citaId), HttpStatus.OK);
    }








}
