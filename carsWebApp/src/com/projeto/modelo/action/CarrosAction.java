/**
 * 
 */
package com.projeto.modelo.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.projeto.modelo.Carros;
import com.projeto.modelo.dao.DAOException;
import com.projeto.modelo.hibernate.dao.CarrosHibernateDAO;

/**
 * @author Guilherme
 *
 */
public class CarrosAction extends ActionSupport {
	
	private Carros carros;
	private CarrosHibernateDAO carrosDAO = new CarrosHibernateDAO();
	private List<Carros> listaCarros = new ArrayList<Carros>();
	
	
	/**
	 * @return the carros
	 */
	public Carros getCarros() {
		return carros;
	}
	/**
	 * @param carros the carros to set
	 */
	public void setCarros(Carros carros) {
		this.carros = carros;
	}
	/**
	 * @return the carrosDAO
	 */
	public CarrosHibernateDAO getCarrosDAO() {
		return carrosDAO;
	}
	/**
	 * @param carrosDAO the carrosDAO to set
	 */
	public void setCarrosDAO(CarrosHibernateDAO carrosDAO) {
		this.carrosDAO = carrosDAO;
	}
	
	public String save() throws DAOException {
		if (getCarros() != null) {
			carrosDAO.create(carros);
			return "SUCCESS";
		}
		return "FAIL";
	}

	
	public List<Carros> getListaCarros() {
		return listaCarros;
	}
	public void setListaCarros(List<Carros> listaCarros) {
		this.listaCarros = listaCarros;
	}
	public String pesqCarrosDesconto() throws DAOException {		
		listaCarros = carrosDAO.findByCarros();		
		return "SUCCESS";		
	}

}
