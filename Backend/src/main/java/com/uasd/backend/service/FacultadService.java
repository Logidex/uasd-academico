package com.uasd.backend.service;

import com.uasd.backend.data.CatalogoTemporal;
import com.uasd.backend.model.Facultad;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FacultadService {
    private final CatalogoTemporal catalogo;
    public FacultadService(CatalogoTemporal catalogo) { this.catalogo = catalogo; }
    public List<Facultad> obtenerTodas() { return catalogo.getFacultades(); }
}
