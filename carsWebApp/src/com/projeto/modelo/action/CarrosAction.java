/**
 * 
 */
package com.projeto.modelo.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
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
	private ArrayList<Carros> listaCarros;
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
	/**
	 * @return the listaCarros
	 */
	public ArrayList<Carros> getListaCarros() {
		return listaCarros;
	}
	/**
	 * @param listaCarros the listaCarros to set
	 */
	public void setListaCarros(ArrayList<Carros> listaCarros) {
		this.listaCarros = listaCarros;
	}
	
	public String pesqCarrosDesconto() throws DAOException {
		List<Carros> lisCarrosAux = new ArrayList();
		lisCarrosAux = carrosDAO.findByCarros();
		setListaCarros((ArrayList<Carros>) lisCarrosAux);
		
		return "success";		
	}
	

}
