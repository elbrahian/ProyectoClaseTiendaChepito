package org.tiendachepeito.data.dao.sql.AzureSql;

import org.tiendachepeito.dao.PaisDAO;
import org.tiendachepeito.data.dao.sql.SqlConnection;
import org.tiendachepeito.entity.PaisEntity;

import java.sql.Connection;
import java.util.List;

public class PaisAzureSqlDAO extends SqlConnection implements PaisDAO {

    public PaisAzureSqlDAO(final Connection connection){
        super(connection);
    }

    @Override
    public final void crear(final PaisEntity entidad) {
         final var sentenciaSql = new StringBuilder();

         sentenciaSql.append("INSERT INTO Pais(Nombre)");
         sentenciaSql.append("VALUES('Colombia')");
    }

    @Override
    public final void actualizar(final PaisEntity entidad) {
        final var sentenciaSql = new StringBuilder();

        sentenciaSql.append("UPDATE Pais");
        sentenciaSql.append("SET Nombre = 'Venezuela'");
        sentenciaSql.append("WHERE id = 4");
    }

    @Override
    public final List<PaisEntity> consultar(final PaisEntity entidad) {
        final var sentenciaSql = new StringBuilder();

        sentenciaSql.append("SELECT id, nombre");
        sentenciaSql.append("FROM Pais");
        sentenciaSql.append("ORDER BY  nombre ASC");
        return null;
    }

    @Override
    public final void eliminar(final int id) {
        final var sentenciaSql = new StringBuilder();

        sentenciaSql.append("DELETE FROM Pais");
        sentenciaSql.append("WHERE id = 1");
    }
}
