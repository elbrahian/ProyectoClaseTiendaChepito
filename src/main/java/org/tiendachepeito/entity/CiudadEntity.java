package org.tiendachepeito.entity;

import org.tiendachepeito.crosscitting.helpers.NumericHelper;
import org.tiendachepeito.crosscitting.helpers.TextHelper;

public final class CiudadEntity {
    private int id;
    private String nombre;
    private DepartamentoEntity departamento;

    protected static final CiudadEntity build(){
        return new CiudadEntity(NumericHelper.ZERO);
    }
    private CiudadEntity(final int id){
        setId(id);
        setNombre(nombre);
        setDepartamento(departamento);
    }

    public CiudadEntity(final int id,final  String nombre,final  DepartamentoEntity departamento) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
    }

    public static final CiudadEntity build(final int id){
        return new CiudadEntity(id);
    }

    public static final CiudadEntity build(final int id, final String nombre, final DepartamentoEntity departamento){
        return new CiudadEntity(id,nombre,departamento);
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public DepartamentoEntity getDepartamento() {
        return departamento;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private void setDepartamento(DepartamentoEntity departamento) {
        this.departamento = departamento;
    }
}
