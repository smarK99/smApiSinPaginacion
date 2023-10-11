package com.sm.apiSinPaginacion.services;

import com.sm.apiSinPaginacion.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PersonaService extends BaseService<Persona, Long> {

    Page<Persona> search(String filter, Pageable pageable) throws Exception;
}
