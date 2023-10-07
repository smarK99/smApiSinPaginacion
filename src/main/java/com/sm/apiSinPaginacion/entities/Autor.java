package com.sm.apiSinPaginacion.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "autor")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Autor extends Base{

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    //Hasta 1500 caracteres
    @Column(name = "biografia", length = 1500)
    private String biografia;
}
