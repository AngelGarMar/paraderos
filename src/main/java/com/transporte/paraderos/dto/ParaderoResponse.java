package com.transporte.paraderos.dto;

import com.transporte.paraderos.entities.Paradero;
import lombok.Data;

import java.io.Serializable;

@Data
public class ParaderoResponse implements Serializable {
    private Integer id;
    private String nombre;

    public ParaderoResponse(Paradero paradero) {
        this.id = paradero.getId();
        this.nombre = paradero.getNombre();
    }
}
