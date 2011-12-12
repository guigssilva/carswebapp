package com.projeto.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.projeto.modelo.Contato;
import com.projeto.modelo.User;

public class UserDAO {
	private static final String SQL_INSERT_USER =
		"INSERT INTO USERS (NAME, ADDRESS1, ADDRESS2, CITY, STATE, ZIP, PASSWORD, EMAIL)" +
		" VALUES(?,?,?,?,?,?,?,?)";	

	private static final String SQL_DELETE_USER =
		"DELETE FROM USERS WHERE ID = (?)";

	private static final String SQL_ALL_USERS =
		"SELECT ID, NAME, ADDRESS1, ADDRESS2, CITY, STATE, ZIP, PASSWORD, EMAIL FROM USERS";

	private static final String SQL_USER_BY_MAIL =
		"SELECT ID, NAME, ADDRESS1, ADDRESS2, CITY, STATE, ZIP, PASSWORD, EMAIL FROM USERS" +
		" WHERE EMAIL = ?";


	private DBPool dbPool;

	public void setDbPool(DBPool dbPool) {
		this.dbPool = dbPool;
	}
	public UserDAO(DBPool db){
		setDbPool(db);		
	}
	
	public void create(User user) throws DAOException {
		Connection c = null;
		PreparedStatement ps = null;

		boolean transactionState = false;
		try {
			c = dbPool.getConnection();			
			transactionState = c.getAutoCommit();
			c.setAutoCommit(false);
			
			ps = c.prepareStatement(SQL_INSERT_USER);
			ps.setString(1, user.getName());
			ps.setString(2, user.getAddress1());
			ps.setString(3, user.getAddress2());
			ps.setString(4, user.getCity());
			ps.setString(5, user.getState());
			ps.setString(6, user.getZip());
			ps.setString(7, user.getPassword());
			ps.setString(8, user.getEmail());
			int result = ps.executeUpdate();
			if (result != 1) {
				throw new DAOException("UserDAO: insert failed");
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
	
	public User findByEmail(User user) throws DAOException {

		User userRegistered = null;
		
		if (dbPool == null) {
			throw new DAOException("UserDAO: Pool Not Found");
		}        
		
		Connection c = null;
		PreparedStatement ps = null;
		ResultSet resultSet = null;
		try {
			c = dbPool.getConnection();			
			ps = c.prepareStatement(SQL_USER_BY_MAIL);
			ps.setString(1, user.getEmail());
			resultSet = ps.executeQuery();			
			while (resultSet.next()) {
				userRegistered = new User();
				
				userRegistered.setId(resultSet.getLong("ID"));
				userRegistered.setName(resultSet.getString("NAME"));
				userRegistered.setAddress1(resultSet.getString("ADDRESS1"));
				userRegistered.setAddress2(resultSet.getString("ADDRESS2"));
				userRegistered.setCity(resultSet.getString("CITY"));
				userRegistered.setState(resultSet.getString("STATE"));
				userRegistered.setZip(resultSet.getString("ZIP"));
				userRegistered.setPassword(resultSet.getString("PASSWORD"));				
				userRegistered.setEmail(resultSet.getString("EMAIL"));
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
		return userRegistered;
	}

}
