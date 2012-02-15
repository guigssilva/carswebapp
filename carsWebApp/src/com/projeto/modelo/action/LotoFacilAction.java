/**
 * 
 */
package com.projeto.modelo.action;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.opensymphony.xwork2.ActionSupport;
import com.projeto.modelo.Carros;
import com.projeto.modelo.Urna;
import com.projeto.modelo.dao.DAOException;
import com.projeto.modelo.hibernate.dao.CarrosHibernateDAO;

/**
 * @author Guilherme
 *
 */
public class LotoFacilAction extends ActionSupport {
	
	
	
	public String gerarLotoFacil(){
		 List<Integer> urna = Urna.createUrna(25);  
	      
		    int[] resultados;  
		      
		    //retirar 15 bolas e imprimir  
		    {  
		        System.out.print("Retira 15 bolas: | ");  
		        resultados = Urna.sorteiSemReposição(urna,15);  
		        //imprimindo resultado  
		        for (int resultado : resultados)  
		            if (resultado < 10)  
		                System.out.print(" "+ resultado + " | ");  
		            else  
		                System.out.print(resultado + " | ");  
		        System.out.println(); //apenas para dar um espaço  
		    }  
		      
		    //retirar +5 bolas e imprimir  
		    {  
		        System.out.print("Retira +5 bolas: | ");  
		        resultados = Urna.sorteiSemReposição(urna,5);  
		        //imprimindo resultado  
		        for (int resultado : resultados)  
		            if (resultado < 10)  
		                System.out.print(" "+ resultado + " | ");  
		            else  
		                System.out.print(resultado + " | ");  
		        System.out.println(); //apenas para dar um espaço  
		    }  
		      
		    //imprimir as bolas que sobraram  
		    {  
		        System.out.print("Bolas restantes: | ");  
		        for (int bolas : urna)  
		            if (bolas < 10)  
		                System.out.print(" "+ bolas + " | ");  
		            else  
		                System.out.print(bolas + " | ");  
		    }  
		
		
		return null;
		
	}
}
