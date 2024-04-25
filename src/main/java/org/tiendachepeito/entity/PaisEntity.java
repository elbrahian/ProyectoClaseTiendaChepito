package org.tiendachepeito.entity;

import org.tiendachepeito.dto.DepartamentoDTO;

public final class PaisEntity {
    private int id;
    private String nombre;

    private PaisEntity(final int id){
        setId(id);
    }
    private PaisEntity(final int id,final String nombre) {
        setId(id);
        setNombre(nombre);
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    private String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
