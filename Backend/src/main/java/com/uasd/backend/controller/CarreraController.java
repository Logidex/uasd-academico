package com.uasd.backend.controller;

import com.uasd.backend.model.Carrera;
import com.uasd.backend.service.CarreraService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/carreras")
public class CarreraController {
    private final CarreraService service;
    public CarreraController(CarreraService service) { this.service = service; }
    @GetMapping("/escuela/{idEscuela}")
    public List<Carrera> obtenerPorEscuela(@PathVariable Long idEscuela) {
        return service.obtenerPorEscuela(idEscuela);
    }
}
