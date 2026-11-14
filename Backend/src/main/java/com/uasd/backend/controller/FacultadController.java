package com.uasd.backend.controller;

import com.uasd.backend.model.Facultad;
import com.uasd.backend.service.FacultadService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/facultades")
public class FacultadController {
    private final FacultadService service;
    public FacultadController(FacultadService service) { this.service = service; }
    @GetMapping
    public List<Facultad> obtenerTodas() { return service.obtenerTodas(); }
}
