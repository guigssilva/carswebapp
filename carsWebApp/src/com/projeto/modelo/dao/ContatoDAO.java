package com.projeto.modelo.dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.projeto.modelo.Contato;

public class ContatoDAO implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final String SQL_INSERT_CONTATO =
		"INSERT INTO CONTATO (NOME,TELEFONE)" +
		" VALUES(?,?)";

	private static final String SQL_UPDATE_CONTATO =
		"UPDATE CONTATO SET NOME = (?), TELEFONE = (?)" +
		" WHERE ID = (?)";
	
	private static final String SQL_DELETE_CONTATO =
		"DELETE FROM CONTATO WHERE ID = (?)";

	private static final String SQL_ALL_CONTATO =
		"SELECT ID,NOME,TELEFONE FROM CONTATO";
	
	private static final String SQL_CONTATO_BY_ID =
		"SELECT ID,NOME,TELEFONE FROM CONTATO WHERE ID = (?)";


	private DBPool dbPool;


	public ContatoDAO(DBPool db){
		setDbPool(db);		
	}

	public void create(Contato contato) throws DAOException {
		Connection c = null;
		PreparedStatement ps = null;
		
		boolean transactionState = false;
		try {
			c = dbPool.getConnection();			
			transactionState = c.getAutoCommit();
			c.setAutoCommit(false);

			ps = c.prepareStatement(SQL_INSERT_CONTATO);
			ps.setString(1, contato.getNome());
			ps.setString(2, contato.getTelefone());
			int result = ps.executeUpdate();
			if (result != 1) {
				throw new DAOException("ContatoDAO: insert failed");
			}
			c.commit();			 
		}
		catch (SQLException sqlx) {
			try {
				c.rollback();
			} catch (SQLException e) {
				throw new DAOException(e.getMessage());
			}			
			throw new DAOException(sqlx.getMessage());
		} 
		finally {
			try {
				c.setAutoCommit(transactionState);
				dbPool.release(c);
				if (ps != null)
					ps.close();
			} catch (SQLException e) {
				throw new DAOException(e.getMessage());
			}
		}
	}

	public List findAll() throws DAOException {

		List contatos = null;
		if (dbPool == null) {
			throw new DAOException("ContatoDAO: Pool Not Found");
		}        
		Connection c = null;
		Statement s = null;
		ResultSet resultSet = null;
		try {
			c = dbPool.getConnection();
			s = c.createStatement();
			resultSet = s.executeQuery(SQL_ALL_CONTATO);
			contatos = new ArrayList();
			while (resultSet.next()) {
				Contato contato = new Contato();
				contato.setId(resultSet.getLong("ID"));
				contato.setNome(resultSet.getString("NOME"));
				contato.setTelefone(resultSet.getString("TELEFONE"));                    
				contatos.add(contato);
			}
		} catch (SQLException sqlx) {
			throw new DAOException(sqlx.getMessage());
		} finally {
			try {
				dbPool.release(c);
				resultSet.close();
				s.close();
			} catch (SQLException ignored) {
				throw new DAOException(ignored.getMessage());
			}                
		}
		return contatos;
	}

	public void deleteContato(Contato contato) throws DAOException {
		Connection c = null;
		PreparedStatement ps = null;

		boolean transactionState = false;
		try {
			c = dbPool.getConnection();			
			transactionState = c.getAutoCommit();
			c.setAutoCommit(false);

			ps = c.prepareStatement(SQL_DELETE_CONTATO);
			ps.setLong(1, contato.getId());			
			int result = ps.executeUpdate();
			if (result != 1) {
				throw new DAOException("ContatoDAO: delete failed");
			}
			c.commit();			 
		}
		catch (SQLException sqlx) {
			try {
				c.rollback();
			} catch (SQLException e) {
				// TODO Auto-generated catch block				
				throw new DAOException(e.getMessage());
			}			
			throw new DAOException(sqlx.getMessage());
		} 
		finally {
			try {
				c.setAutoCommit(transactionState);
				dbPool.release(c);
				if (ps != null)
					ps.close();
			} catch (SQLException e) {
				throw new DAOException(e.getMessage());
			}
		}
		
	}

	public void updateContato(Contato contato) throws DAOException {
		Connection c = null;
		PreparedStatement ps = null;
		Statement s = null;

		boolean transactionState = false;
		try {
			c = dbPool.getConnection();			
			transactionState = c.getAutoCommit();
			c.setAutoCommit(false);

			ps = c.prepareStatement(SQL_UPDATE_CONTATO);
			ps.setString(1, contato.getNome());
			ps.setString(2, contato.getTelefone());
			ps.setLong(3, contato.getId());			
			int result = ps.executeUpdate();
			if (result != 1) {
				throw new DAOException("ContatoDAO: update failed");
			}
			c.commit();			 
		}
		catch (SQLException sqlx) {
			try {
				s = c.createStatement();
				c.rollback();
			} catch (SQLException e) {
				// TODO Auto-generated catch block				
				throw new DAOException(e.getMessage());
			}			
			throw new DAOException(sqlx.getMessage());
		} 
		finally {
			try {
				c.setAutoCommit(transactionState);
				dbPool.release(c);
				if (s != null)
					s.close();
				if (ps != null)
					ps.close();
			} catch (SQLException e) {
				throw new DAOException(e.getMessage());
			}
		}
		
	}

	public Contato findById(Contato contato) throws DAOException {

		Contato contact = null;		
		if (dbPool == null) {
			throw new DAOException("ContatoDAO: Pool Not Found");
		} 
		Connection c = null;
		//Statement s = null;
		PreparedStatement ps = null;
		ResultSet resultSet = null;
		try {
			c = dbPool.getConnection();			
			ps = c.prepareStatement(SQL_CONTATO_BY_ID);
			ps.setLong(1, contato.getId());
			resultSet = ps.executeQuery();			
			while (resultSet.next()) {
				contact = new Contato();				
				contact.setId(resultSet.getLong("ID"));
				contact.setNome(resultSet.getString("NOME"));
				contact.setTelefone(resultSet.getString("TELEFONE"));
			}
		} catch (SQLException sqlx) {
			throw new DAOException(sqlx.getMessage());
		} finally {
			try {
				dbPool.release(c);
				resultSet.close();
				ps.close();
			} catch (SQLException ignored) {
				throw new DAOException(ignored.getMessage());
			}                
		}
		return contact;
	}

	public void setDbPool(DBPool dbPool) {
		this.dbPool = dbPool;
	}
}
