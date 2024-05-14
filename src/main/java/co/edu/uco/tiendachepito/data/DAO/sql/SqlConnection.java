package co.edu.uco.tiendachepito.data.dao.sql;

import co.edu.uco.tiendachepito.crosscutting.exceptions.custom.DataTiendaChepitoException;
import co.edu.uco.tiendachepito.crosscutting.helpers.SqlHelper;

import java.sql.Connection;

public class SqlConnection {

	private Connection connection;

	protected SqlConnection(final Connection connection) {
		this.connection = connection;
	}

	private final void setConnection(final Connection connection) {
		if (!SqlHelper.isOpen(connection)){
			var mensajeUsuario = "";
			var mensajeTecnico = "No es posible crear el DAO deseado, dado que la conecion SQL esta cerrada";

			throw new DataTiendaChepitoException(mensajeTecnico,mensajeUsuario);
		}
	}

	protected final Connection getConnection() {
		return connection;
	}
}
