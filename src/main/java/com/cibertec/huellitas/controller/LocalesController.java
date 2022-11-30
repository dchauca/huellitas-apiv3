package com.cibertec.huellitas.controller;

import com.cibertec.huellitas.dtos.LocalesCreateDTO;
import com.cibertec.huellitas.dtos.LocalesDTO;
import com.cibertec.huellitas.dtos.LocalesUpdateDTO;
import com.cibertec.huellitas.service.LocalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping
public class LocalesController {

    @Autowired
    private LocalesService localesService;

    @GetMapping("locales")
    public ResponseEntity<List<LocalesDTO>> listarLocales(){
        return new ResponseEntity<>(localesService.listarLocales(), HttpStatus.OK);
    }

    @GetMapping("locales/{localesId}")
    public ResponseEntity<LocalesDTO> obtenerLocalesPorId(@PathVariable("localesId") long localesid){
        return new ResponseEntity<>(localesService.obtenerLocalesPorID(localesid), HttpStatus.OK);
    }

    @PostMapping("locales")
    public ResponseEntity<LocalesDTO> registrarLocales(@RequestBody LocalesCreateDTO localesCreateDTO){
        return new ResponseEntity<>(localesService.registrarLocales(localesCreateDTO), HttpStatus.OK);
    }

    @PutMapping("locales")
    public ResponseEntity<LocalesDTO> actualizarLocales(@RequestBody LocalesUpdateDTO localesUpdateDTO){
        return new ResponseEntity<>(localesService.actualizarLocales(localesUpdateDTO), HttpStatus.OK);
    }

    @DeleteMapping("localess/{localesId}")
    public ResponseEntity<String> eliminarLocales(@PathVariable("localesId") long localesId){
        return new ResponseEntity<>(localesService.eliminarLocales(localesId), HttpStatus.OK);
    }
    
}
