package com.sm.apiSinPaginacion.services;

import com.sm.apiSinPaginacion.entities.Persona;
import com.sm.apiSinPaginacion.repositories.BaseRepository;
import com.sm.apiSinPaginacion.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona,Long> implements PersonaService{

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;
    }


}

