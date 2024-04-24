package org.tiendachepeito.data.dao.general;

import java.util.List;

public interface ConsutarDAO<E> {
    List<E> consultar(E entidad);
}
