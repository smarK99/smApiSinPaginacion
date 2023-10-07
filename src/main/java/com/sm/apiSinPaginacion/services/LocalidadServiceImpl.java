package com.sm.apiSinPaginacion.services;

import com.sm.apiSinPaginacion.entities.Localidad;
import com.sm.apiSinPaginacion.repositories.BaseRepository;
import com.sm.apiSinPaginacion.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements LocalidadService {

    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}
