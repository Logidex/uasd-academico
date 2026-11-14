package com.uasd.backend.service;

import com.uasd.backend.data.CatalogoTemporal;
import com.uasd.backend.model.Carrera;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CarreraService {
    private final CatalogoTemporal catalogo;
    public CarreraService(CatalogoTemporal catalogo) { this.catalogo = catalogo; }
    public List<Carrera> obtenerPorEscuela(Long idEscuela) {
        return catalogo.getCarreras().stream()
            .filter(c -> c.getIdEscuela().equals(idEscuela)).toList();
    }
}
