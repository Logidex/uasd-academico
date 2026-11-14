package com.uasd.backend.service;

import com.uasd.backend.data.CatalogoTemporal;
import com.uasd.backend.model.Materia;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class MateriaService {

    private final CatalogoTemporal catalogo;

    public MateriaService(CatalogoTemporal catalogo) {
        this.catalogo = catalogo;
    }

    public List<Materia> obtenerPorCarrera(Long idCarrera) {
        return catalogo.getMaterias().stream()
            .filter(materia -> materia.getIdCarrera().equals(idCarrera))
            .sorted(
                Comparator.comparing(Materia::getPeriodo)
                    .thenComparing(Materia::getCodigo)
            )
            .toList();
    }
}
