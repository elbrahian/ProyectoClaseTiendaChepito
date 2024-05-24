package co.edu.uco.tiendachepito.entity;


import co.edu.uco.tiendachepito.crosscutting.crosscutting.helpers.NumericHelper;
import co.edu.uco.tiendachepito.crosscutting.crosscutting.helpers.ObjectHelper;
import co.edu.uco.tiendachepito.crosscutting.crosscutting.helpers.TextHelper;

public final class CiudadEntity {

    private int id;
    private String nombre;
    private DepartamentoEntity departamento;

    private CiudadEntity(final int id, final String nombre, final DepartamentoEntity departamento) {
        setId(id);
        setNombre(nombre);
        setDepartamento(departamento);
    }

    private CiudadEntity(final int id) {
        setId(id);
        setNombre(TextHelper.EMPTY);
        setDepartamento(DepartamentoEntity.build());
    }

    public static final CiudadEntity build (final int id){
        return new CiudadEntity(id);
    }

    public static final CiudadEntity build(final int id, final String nombre, final DepartamentoEntity departamento){
        return new CiudadEntity(id);
    }

    protected static final CiudadEntity build(){
        return new CiudadEntity(NumericHelper.ZERO);
    }

    public final int getId() {
        return id;
    }

    public final String getNombre() {
        return nombre;
    }

    public final DepartamentoEntity getDepartamento() {
        return departamento;
    }

    private final void setId(final int id) {
        this.id = id;
    }

    private final void setNombre(final String nombre) {
        this.nombre = TextHelper.applyTrim(nombre);
    }

    private final DepartamentoEntity setDepartamento(final DepartamentoEntity departamento) {
        this.departamento = ObjectHelper.getObjectHelper().getDefault(departamento, DepartamentoEntity.build(NumericHelper.ZERO));
        return departamento;
    }
}
