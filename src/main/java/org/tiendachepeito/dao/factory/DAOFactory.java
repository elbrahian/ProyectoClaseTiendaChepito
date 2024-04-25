package org.tiendachepeito.dao.factory;

import org.tiendachepeito.dao.CiudadDAO;
import org.tiendachepeito.dao.DepartamentoDAO;
import org.tiendachepeito.dao.PaisDAO;

public abstract class DAOFactory {
    protected abstract void obtenerConexion();
    public abstract void iniciarTransaccion();
    public abstract void confirmarTransaccion();
    public abstract void cancelarTransaccion();
    public abstract void cerrarConexion();
    public abstract PaisDAO getPaisDAO();
    public abstract DepartamentoDAO getDepartamentoDAO();
    public abstract CiudadDAO getCiudadDAO();
}
