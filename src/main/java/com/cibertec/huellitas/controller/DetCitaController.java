package com.cibertec.huellitas.controller;

import com.cibertec.huellitas.dtos.DetCitaCreateDTO;
import com.cibertec.huellitas.dtos.DetCitaDTO;
import com.cibertec.huellitas.dtos.DetCitaUpdateDTO;
import com.cibertec.huellitas.service.DetCitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class DetCitaController {

    @Autowired
    private DetCitaService detCitaService;

    @GetMapping("detCitas")
    public ResponseEntity<List<DetCitaDTO>> listarDetCitas(){
        return new ResponseEntity<>(detCitaService.listarDetCitas(), HttpStatus.OK);
    }

    @GetMapping("detCitas/{detCitaId}")
    public ResponseEntity<DetCitaDTO> obtenerDetCitaPorId(@PathVariable("detCitaId") long detCitaid){
        return new ResponseEntity<>(detCitaService.obtenerDetCitaPorID(detCitaid), HttpStatus.OK);
    }

    @PostMapping("detCitas")
    public ResponseEntity<DetCitaDTO> registrarDetCita(@RequestBody DetCitaCreateDTO detCitaCreateDTO){
        return new ResponseEntity<>(detCitaService.registrarDetCita(detCitaCreateDTO), HttpStatus.OK);
    }

    @PutMapping("detCitas")
    public ResponseEntity<DetCitaDTO> actualizarDetCita(@RequestBody DetCitaUpdateDTO detCitaUpdateDTO){
        return new ResponseEntity<>(detCitaService.actualizarDetCita(detCitaUpdateDTO), HttpStatus.OK);
    }

    @DeleteMapping("detCitas/{detCitaId}")
    public ResponseEntity<String> eliminarDetCita(@PathVariable("detCitaId") long detCitaId){
        return new ResponseEntity<>(detCitaService.eliminarDetCita(detCitaId), HttpStatus.OK);
    }


}
