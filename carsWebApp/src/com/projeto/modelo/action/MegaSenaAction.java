/**
 * 
 */
package com.projeto.modelo.action;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.projeto.modelo.LotoFacil;
import com.projeto.modelo.MegaSena;
import com.projeto.modelo.Urna;

/**
 * @author Guilherme
 * 
 */
public class MegaSenaAction extends ActionSupport {

	private MegaSena megaSena;
	private List<MegaSena> listaMegaSena = new ArrayList<MegaSena>();
	private Long qtdJogos;

	/**
	 * @return the qtdJogos
	 */
	public Long getQtdJogos() {
		return qtdJogos;
	}

	/**
	 * @param qtdJogos
	 *            the qtdJogos to set
	 */
	public void setQtdJogos(Long qtdJogos) {
		this.qtdJogos = qtdJogos;
	}
	
	
	
	/**
	 * @return the megaSena
	 */
	public MegaSena getMegaSena() {
		return megaSena;
	}

	/**
	 * @param megaSena the megaSena to set
	 */
	public void setMegaSena(MegaSena megaSena) {
		this.megaSena = megaSena;
	}

	/**
	 * @return the listaMegaSena
	 */
	public List<MegaSena> getListaMegaSena() {
		return listaMegaSena;
	}

	/**
	 * @param listaMegaSena the listaMegaSena to set
	 */
	public void setListaMegaSena(List<MegaSena> listaMegaSena) {
		this.listaMegaSena = listaMegaSena;
	}

	public String gerarNumerosMegaSena() {
		

		if (getQtdJogos() != null && getQtdJogos() > 0) {

			Long totalGerarJogos = getQtdJogos();
			for (int i = 0; i < totalGerarJogos; i++) {
				List<Integer> urna = Urna.createUrna(60);
				int[] resultados;

				// retirar 15 bolas e imprimir
				{
					System.out.print("Retira 6 bolas: | ");
					resultados = Urna.sorteiSemReposição(urna, 6);
					Arrays.sort(resultados);
					MegaSena megaSenaAux = new MegaSena();
					for(int j = 0; j <= resultados.length ;j++){
						if(j == 0)
							megaSenaAux.setNrResultado1(Long.valueOf(resultados[j]));
						if(j == 1)
							megaSenaAux.setNrResultado2(Long.valueOf(resultados[j]));
						if(j == 2)
							megaSenaAux.setNrResultado3(Long.valueOf(resultados[j]));
						if(j == 3)
							megaSenaAux.setNrResultado4(Long.valueOf(resultados[j]));
						if(j == 4)
							megaSenaAux.setNrResultado5(Long.valueOf(resultados[j]));
						if(j == 5)
							megaSenaAux.setNrResultado6(Long.valueOf(resultados[j]));
						}
					listaMegaSena.add(megaSenaAux);
				}

			}
			return "SUCCESS";
		} else
			return "FAIL";

	}
	
	public String gravarMegaSena() {
		return "SUCCESS";
	}
}
