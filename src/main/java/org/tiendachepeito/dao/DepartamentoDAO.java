package org.tiendachepeito.dao;


import org.tiendachepeito.data.dao.general.ActualizarDAO;
import org.tiendachepeito.data.dao.general.ConsutarDAO;
import org.tiendachepeito.data.dao.general.CrearDAO;
import org.tiendachepeito.data.dao.general.EliminarDAO;
import org.tiendachepeito.entity.DepartamentoEntity;

public interface DepartamentoDAO extends CrearDAO<DepartamentoEntity>, ActualizarDAO<DepartamentoEntity>, EliminarDAO, ConsutarDAO<DepartamentoEntity> {
}
