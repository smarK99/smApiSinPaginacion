package com.sm.apiSinPaginacion.services;

import com.sm.apiSinPaginacion.entities.Persona;
import com.sm.apiSinPaginacion.repositories.BaseRepository;
import com.sm.apiSinPaginacion.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona,Long> implements PersonaService{

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;
    }


    @Override
    public Page<Persona> search(String filter, Pageable pageable) throws Exception {
        try{
            //Aca puedo llamar a cualquier query de las que tengo en el repo
            Page<Persona> personas = personaRepository.findByNombreContainingOrApellidoContaining(filter, filter, pageable);
            return personas;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}

