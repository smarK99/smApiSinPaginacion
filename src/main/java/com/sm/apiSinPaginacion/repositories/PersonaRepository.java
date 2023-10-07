package com.sm.apiSinPaginacion.repositories;

import com.sm.apiSinPaginacion.entities.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona,Long> {

}
