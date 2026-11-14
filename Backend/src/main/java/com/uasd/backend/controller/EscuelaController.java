package com.uasd.backend.controller;

import com.uasd.backend.model.Escuela;
import com.uasd.backend.service.EscuelaService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/escuelas")
public class EscuelaController {
    private final EscuelaService service;
    public EscuelaController(EscuelaService service) { this.service = service; }
    @GetMapping("/facultad/{idFacultad}")
    public List<Escuela> obtenerPorFacultad(@PathVariable Long idFacultad) {
        return service.obtenerPorFacultad(idFacultad);
    }
}
