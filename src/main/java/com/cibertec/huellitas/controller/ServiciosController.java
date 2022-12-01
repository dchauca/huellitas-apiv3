package com.cibertec.huellitas.controller;

import com.cibertec.huellitas.dtos.ServiciosCreateDTO;
import com.cibertec.huellitas.dtos.ServiciosDTO;
import com.cibertec.huellitas.dtos.ServiciosUpdateDTO;
import com.cibertec.huellitas.service.ServiciosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping
@CrossOrigin(origins = "http://localhost:4200/")
public class ServiciosController {

    @Autowired
    private ServiciosService serviciosService;

    @GetMapping("servicios")
    public ResponseEntity<List<ServiciosDTO>> listarServicios(){
        return new ResponseEntity<>(serviciosService.listarServicios(), HttpStatus.OK);
    }

    @GetMapping("servicios/{serviciosId}")
    public ResponseEntity<ServiciosDTO> obtenerServiciosPorId(@PathVariable("serviciosId") long serviciosid){
        return new ResponseEntity<>(serviciosService.obtenerServicioPorID(serviciosid), HttpStatus.OK);
    }

    @PostMapping("servicios")
    public ResponseEntity<ServiciosDTO> registrarServicios(@RequestBody ServiciosCreateDTO serviciosCreateDTO){
        return new ResponseEntity<>(serviciosService.registrarServicio(serviciosCreateDTO), HttpStatus.OK);
    }

    @PutMapping("servicios")
    public ResponseEntity<ServiciosDTO> actualizarServicios(@RequestBody ServiciosUpdateDTO serviciosUpdateDTO){
        return new ResponseEntity<>(serviciosService.actualizarServicio(serviciosUpdateDTO), HttpStatus.OK);
    }

    @DeleteMapping("servicios/{serviciosId}")
    public ResponseEntity<String> eliminarServicios(@PathVariable("serviciosId") long serviciosId){
        return new ResponseEntity<>(serviciosService.eliminarServicio(serviciosId), HttpStatus.OK);
    }
    
}
