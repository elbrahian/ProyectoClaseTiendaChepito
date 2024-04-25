package org.tiendachepeito.entity;

import org.tiendachepeito.dto.PaisDTO;

public final class DepartamentoEntity {
    private int id;

    private String nombre;
    private PaisEntity pais;

    private DepartamentoEntity(final int id, final String nombre, final PaisEntity pais){
        setId(id);
        setNombre(nombre);
        setPais(pais);
    }


    public final int getId() {
        return id;
    }

    private final DepartamentoEntity setId(int id) {
        this.id = id;
        return this;
    }

    public final String getNombre() {
        return nombre;
    }

    private final DepartamentoEntity setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public final PaisEntity getPais() {
        return pais;
    }

    private DepartamentoEntity setPais(PaisEntity pais) {
        this.pais = pais;
        return this;
    }
}
