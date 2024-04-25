package org.tiendachepeito.dao;

import org.tiendachepeito.data.dao.general.ActualizarDAO;
import org.tiendachepeito.data.dao.general.ConsutarDAO;
import org.tiendachepeito.data.dao.general.CrearDAO;
import org.tiendachepeito.data.dao.general.EliminarDAO;
import org.tiendachepeito.entity.CiudadEntity;

public interface CiudadDAO extends CrearDAO<CiudadEntity>, ActualizarDAO<CiudadEntity>, EliminarDAO, ConsutarDAO<CiudadEntity> {



}
