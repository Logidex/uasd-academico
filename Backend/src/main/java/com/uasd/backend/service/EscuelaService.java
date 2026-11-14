package com.uasd.backend.service;

import com.uasd.backend.data.CatalogoTemporal;
import com.uasd.backend.model.Escuela;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EscuelaService {
    private final CatalogoTemporal catalogo;
    public EscuelaService(CatalogoTemporal catalogo) { this.catalogo = catalogo; }
    public List<Escuela> obtenerPorFacultad(Long idFacultad) {
        return catalogo.getEscuelas().stream()
            .filter(e -> e.getIdFacultad().equals(idFacultad)).toList();
    }
}
