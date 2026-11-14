package com.uasd.backend.controller;

import com.uasd.backend.model.Materia;
import com.uasd.backend.service.MateriaService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/materias")
public class MateriaController {
    private final MateriaService service;
    public MateriaController(MateriaService service) { this.service = service; }
    @GetMapping("/carrera/{idCarrera}")
    public List<Materia> obtenerPorCarrera(@PathVariable Long idCarrera) {
        return service.obtenerPorCarrera(idCarrera);
    }
}
