package org.tiendachepeito.dao;

import org.tiendachepeito.data.dao.general.ActualizarDAO;
import org.tiendachepeito.data.dao.general.ConsutarDAO;
import org.tiendachepeito.data.dao.general.CrearDAO;
import org.tiendachepeito.data.dao.general.EliminarDAO;
import org.tiendachepeito.entity.PaisEntity;

public interface PaisDAO extends CrearDAO<PaisEntity>, ActualizarDAO<PaisEntity>, EliminarDAO,ConsutarDAO<PaisEntity> {

    

}
