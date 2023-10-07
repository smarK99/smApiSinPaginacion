package com.sm.apiSinPaginacion.controllers;

import com.sm.apiSinPaginacion.entities.Persona;
import com.sm.apiSinPaginacion.services.PersonaService;
import com.sm.apiSinPaginacion.services.PersonaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl>{

}
