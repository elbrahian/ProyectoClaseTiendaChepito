package org.tiendachepeito.dto;

public final class PaisDTO {
    private int id;
    private String nombre;

    public PaisDTO(String nombre) {
        setNombre(nombre);
    }

    public PaisDTO(int id, String nombre) {
        setId(id);
        setNombre(nombre);
    }

    public PaisDTO() {

    }

    public final String getNombre() {
        return nombre;
    }

    public static final PaisDTO builg() {
        return new PaisDTO();
    }

    public final PaisDTO setNombre(final String nombre) {
        this.nombre = nombre;
        return this;
    }

    public final int getId() {
        return id;
    }

    public final PaisDTO setId(final int id) {
        this.id = id;
        return this;

    }
}
