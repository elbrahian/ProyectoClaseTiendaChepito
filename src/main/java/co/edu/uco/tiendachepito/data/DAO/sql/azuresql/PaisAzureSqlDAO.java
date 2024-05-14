package co.edu.uco.tiendachepito.data.DAO.sql.azuresql;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import co.edu.uco.tiendachepito.crosscutting.exceptions.custom.DataTiendaChepitoException;
import co.edu.uco.tiendachepito.crosscutting.exceptions.messagecatalog.MessageCatalogStrategy;
import co.edu.uco.tiendachepito.crosscutting.exceptions.messagecatalog.data.CodigoMensaje;
import co.edu.uco.tiendachepito.data.dao.PaisDAO;
import co.edu.uco.tiendachepito.data.dao.sql.SqlConnection;
import co.edu.uco.tiendachepito.entity.PaisEntity;


public final class PaisAzureSqlDAO extends SqlConnection implements PaisDAO {

	public PaisAzureSqlDAO(final Connection connection) {
		super(connection);
	}

	@Override
	public final void crear(final PaisEntity entidad) {
		final var sentenciaSql = new StringBuilder();

		sentenciaSql.append("INSERT INTO Pais(Nombre) ");
		sentenciaSql.append("VALUES(?)");

		try(final PreparedStatement sentenciaPreparada = getConnection().prepareStatement(sentenciaSql.toString())){
			sentenciaPreparada.setString(1, entidad.getNombre());

			sentenciaPreparada.executeUpdate();
		} catch (final SQLException exception){
			var mensajeUsuario = "No ha sido posible el registro de la informacion del nuevo pais. Por favor intente de nuevo y en caso de persistir el problema comuniquese con el administrador de la aplicacion Tienda Chepito";
			var mensajeTecnico = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00023);

			throw new DataTiendaChepitoException(mensajeTecnico, mensajeUsuario, exception);
		} catch (final Exception exception){
			var mensajeUsuario = "No ha sido posible el registro de la informacion del nuevo pais. Por favor intente de nuevo y en caso de persistir el problema comuniquese con el administrador de la aplicacion Tienda Chepito";
			var mensajeTecnico = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00023);

			throw new DataTiendaChepitoException(mensajeTecnico, mensajeUsuario, exception);

		}
    }

	@Override
	public final void actualizar(final PaisEntity entidad) {
		final var sentenciaSql = new StringBuilder();
		
		sentenciaSql.append("UPDATE Pais");
		sentenciaSql.append("SET Nombre = 'Venezuela'");
		sentenciaSql.append("WHERE id = 1");
		try(final PreparedStatement sentenciaPreparada = getConnection().prepareStatement(sentenciaSql.toString())){
			sentenciaPreparada.setString(1, entidad.getNombre());
			sentenciaPreparada.setInt(2, entidad.getId());

			sentenciaPreparada.executeUpdate();
		} catch (final SQLException exception){
			var mensajeUsuario = "No ha sido posible la edicion del pais. Por favor intente de nuevo y en caso de persistir el problema comuniquese con el administrador de la aplicacion Tienda Chepito";
			var mensajeTecnico = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00023);

			throw new DataTiendaChepitoException(mensajeTecnico, mensajeUsuario, exception);
		} catch (final Exception exception){
			var mensajeUsuario = "No ha sido posible la edicion del pais. Por favor intente de nuevo y en caso de persistir el problema comuniquese con el administrador de la aplicacion Tienda Chepito";
			var mensajeTecnico = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00023);

			throw new DataTiendaChepitoException(mensajeTecnico, mensajeUsuario, exception);
		}

	}

	@Override
	public final void eliminar(final int id) {
		final var sentenciaSql = new StringBuilder();
		
		sentenciaSql.append("DELETE FROM Pais");
		sentenciaSql.append("WHERE id = ?");
		try(final PreparedStatement sentenciaPreparada = getConnection().prepareStatement(sentenciaSql.toString())){
			sentenciaPreparada.setInt(1, id);

			sentenciaPreparada.executeUpdate();
		} catch (final SQLException exception){
			var mensajeUsuario = "No ha sido posible llevar a cabo la eliminacion del pais. Por favor intente de nuevo y en caso de persistir el problema comuniquese con el administrador de la aplicacion Tienda Chepito";
			var mensajeTecnico = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00023);

			throw new DataTiendaChepitoException(mensajeTecnico, mensajeUsuario, exception);
		} catch (final Exception exception){
			var mensajeUsuario = "No ha sido posible llevar a cabo la eliminacion del pais. Por favor intente de nuevo y en caso de persistir el problema comuniquese con el administrador de la aplicacion Tienda Chepito";
			var mensajeTecnico = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00023);

			throw new DataTiendaChepitoException(mensajeTecnico, mensajeUsuario, exception);
		}
	}

	@Override
	public final List<PaisEntity> consultar(PaisEntity entidad) {
		final var listaPaises = new ArrayList<PaisEntity>();
		final var sentenciaSql = new StringBuilder();
		
		sentenciaSql.append("SELECT id, nombre");
		sentenciaSql.append("FROM Pais");
		sentenciaSql.append("ORDER BY nombre ASC");

		try(final PreparedStatement sentenciaPreparada = getConnection().prepareStatement(sentenciaSql.toString())){

			try(final ResultSet resultados = sentenciaPreparada.executeQuery()) {
				while(resultados.next()){
					PaisEntity paisTmp = PaisEntity.build(resultados.getInt("id"), resultados.getString("nombre"));
							listaPaises.add(paisTmp);
				}
			}catch (final SQLException exception){
				var mensajeUsuario = "No a sido posible la consulta de la infromacion de los apuses. Por favor intente de mievo y en caso de persistir comuniquese con el administrador";
				var mensajeTecnico = "Se ha presentado un problema tratando de realizar un insert de la informacion del pais \"${1}\" en la tabla pais de la tabla azureSql..";

				throw new DataTiendaChepitoException(mensajeTecnico, mensajeUsuario, exception);
			}

			sentenciaPreparada.executeUpdate();
		} catch (final SQLException exception){
			var mensajeUsuario = "No ha sido posible llevar a cabo la eliminacion del pais. Por favor intente de nuevo y en caso de persistir el problema comuniquese con el administrador de la aplicacion Tienda Chepito";
			var mensajeTecnico = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00023);

			throw new DataTiendaChepitoException(mensajeTecnico, mensajeUsuario, exception);
		} catch (final Exception exception){
			var mensajeUsuario = "No ha sido posible llevar a cabo la eliminacion del pais. Por favor intente de nuevo y en caso de persistir el problema comuniquese con el administrador de la aplicacion Tienda Chepito";
			var mensajeTecnico = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00023);

			throw new DataTiendaChepitoException(mensajeTecnico, mensajeUsuario, exception);
		}

		
		return null;
	}

}
