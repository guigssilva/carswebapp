/**
 * 
 */
package com.projeto.modelo.action;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.projeto.modelo.LotoFacil;
import com.projeto.modelo.Urna;

/**
 * @author Guilherme
 * 
 */
public class LotoFacilAction extends ActionSupport {

	private LotoFacil lotoFacil;
	private List<LotoFacil> listaLotoFacil = new ArrayList<LotoFacil>();
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
	 * @return the lotoFacil
	 */
	public LotoFacil getLotoFacil() {
		return lotoFacil;
	}

	/**
	 * @param lotoFacil
	 *            the lotoFacil to set
	 */
	public void setLotoFacil(LotoFacil lotoFacil) {
		this.lotoFacil = lotoFacil;
	}

	/**
	 * @return the listaLotoFacil
	 */
	public List<LotoFacil> getListaLotoFacil() {
		return listaLotoFacil;
	}

	/**
	 * @param listaLotoFacil
	 *            the listaLotoFacil to set
	 */
	public void setListaLotoFacil(List<LotoFacil> listaLotoFacil) {
		this.listaLotoFacil = listaLotoFacil;
	}

	public String gerarLotoFacil() {
		

		if (getQtdJogos() != null && getQtdJogos() > 0) {

			Long totalGerarJogos = getQtdJogos();
			for (int i = 0; i < totalGerarJogos; i++) {
				List<Integer> urna = Urna.createUrna(25);
				int[] resultados;

				// retirar 15 bolas e imprimir
				{
					System.out.print("Retira 15 bolas: | ");
					resultados = Urna.sorteiSemReposição(urna, 15);
					Arrays.sort(resultados);
					LotoFacil lotoFacilAux = new LotoFacil();
					for(int j = 0; j <= resultados.length ;j++){
						if(j == 0)
							lotoFacilAux.setNrResultado1(Long.valueOf(resultados[j]));
						if(j == 1)
							lotoFacilAux.setNrResultado2(Long.valueOf(resultados[j]));
						if(j == 2)
							lotoFacilAux.setNrResultado3(Long.valueOf(resultados[j]));
						if(j == 3)
							lotoFacilAux.setNrResultado4(Long.valueOf(resultados[j]));
						if(j == 4)
							lotoFacilAux.setNrResultado5(Long.valueOf(resultados[j]));
						if(j == 5)
							lotoFacilAux.setNrResultado6(Long.valueOf(resultados[j]));
						if(j == 6)
							lotoFacilAux.setNrResultado7(Long.valueOf(resultados[j]));
						if(j == 7)
							lotoFacilAux.setNrResultado8(Long.valueOf(resultados[j]));
						if(j == 8)
							lotoFacilAux.setNrResultado9(Long.valueOf(resultados[j]));
						if(j == 9)
							lotoFacilAux.setNrResultado10(Long.valueOf(resultados[j]));
						if(j == 10)
							lotoFacilAux.setNrResultado11(Long.valueOf(resultados[j]));
						if(j == 11)
							lotoFacilAux.setNrResultado12(Long.valueOf(resultados[j]));
						if(j == 12)
							lotoFacilAux.setNrResultado13(Long.valueOf(resultados[j]));
						if(j == 13)
							lotoFacilAux.setNrResultado14(Long.valueOf(resultados[j]));
						if(j == 14)
							lotoFacilAux.setNrResultado15(Long.valueOf(resultados[j]));
					}
					listaLotoFacil.add(lotoFacilAux);
					// imprimindo resultado
					for (int resultado : resultados)
						if (resultado < 10)
							System.out.print(" " + resultado + " | ");
						else
							System.out.print(resultado + " | ");
					System.out.println(); // apenas para dar um espaço
				}

				// retirar +5 bolas e imprimir
				{
					System.out.print("Retira +5 bolas: | ");
					resultados = Urna.sorteiSemReposição(urna, 5);
					// imprimindo resultado
					for (int resultado : resultados)
						if (resultado < 10)
							System.out.print(" " + resultado + " | ");
						else
							System.out.print(resultado + " | ");
					System.out.println(); // apenas para dar um espaço
				}

				// imprimir as bolas que sobraram
				{
					System.out.print("Bolas restantes: | ");
					for (int bolas : urna)
						if (bolas < 10)
							System.out.print(" " + bolas + " | ");
						else
							System.out.print(bolas + " | ");
				}
			}

			return "SUCCESS";
		} else
			return "FAIL";

	}
	
	public String gravarrLotoFacil() {
		return "SUCCESS";
	}
}
