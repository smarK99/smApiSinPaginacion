package com.sm.apiSinPaginacion.controllers;

import com.sm.apiSinPaginacion.entities.Autor;
import com.sm.apiSinPaginacion.entities.Localidad;
import com.sm.apiSinPaginacion.services.AutorServiceImpl;
import com.sm.apiSinPaginacion.services.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl>{

}
