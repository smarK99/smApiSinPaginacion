package com.sm.apiSinPaginacion.repositories;

import com.sm.apiSinPaginacion.entities.Persona;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface PersonaRepository extends BaseRepository<Persona,Long> {

    /*

        Agregar luego los metodos correspondientes a las queries no paginadas

    */

    //Queries
    Page<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido, Pageable pageable);

    Boolean existsByDni(int dni);

    //Query JPQL con parametros indexados
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE '%?1%' OR  p.apellido LIKE '%?1%'")
    Page<Persona> search(String filter, Pageable pageable);

    //Query JPQL con parametros nombrados
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE '%:filter%' OR  p.apellido LIKE '%:filter%'")
    Page<Persona> search2(@Param("filter") String filter, Pageable pageable);

    //Query native SQL
    @Query(
            value = "SELECT p FROM persona p WHERE persona.nombre LIKE '%?1%' OR  persona.apellido LIKE '%?1%'",
            countQuery = "SELECT count (*) FROM persona",//cuenta las paginas
            nativeQuery = true
    )
    Page<Persona> searchNative(String filter, Pageable pageable);

}
