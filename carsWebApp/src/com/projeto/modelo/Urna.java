/**
 * 
 */
package com.projeto.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Guilherme
 *
 */
public class Urna {
	
	 /** 
     * Sorteia aleatoriamente as bolas da urna sem reposi��o, sendo a lista urna, sera  
     * alterada e ao final da opera��o ficar� sem suas bolas. 
     * @param urna contem as bolas a serem sorteadas. 
     * @param numeroDeBolasASortear n�mero de bolas a sortear 
     * @return o resultado do sorteio. 
     * @throws IllegalArgumentException Quando algum argumento � Illegal, por exemplo 
     *          quando numeroDeBolasASortear � maior que a quantidade de bolas na urna, 
     *          ou quando numeroDeBolasASortear ou tamanho da urna � igual a zero. 
     */  
    public static int[] sorteiSemReposi��o(List<Integer> urna,  
            int numeroDeBolasASortear) throws IllegalArgumentException {  
          
        if (numeroDeBolasASortear > urna.size())   
            throw new IllegalArgumentException("Quantidade de bolas a sortear maior que o n�mero de bolas na urna");  
        if (numeroDeBolasASortear == 0)   
            throw new IllegalArgumentException("Quantidade de bolas a sortear n�o pode ser zero");  
        if (urna.size() == 0)  
            throw new IllegalArgumentException("A urna n�o pode estar vazia");  
          
        int[] resultados = new int[numeroDeBolasASortear];  
        Random roleta = new Random();  
        for (int i = 0; i < numeroDeBolasASortear; i++)  
            //pega uma bola aleatorea da urna (atraves da roleta), e a retirna  
            resultados[i] = urna.remove(roleta.nextInt(urna.size()));  
        return resultados;  
    }  
      
    /** 
     * Cria uma urna contendo o n�mero de bolas enviadas, que inicia do n�mero 1. 
     * @param numeroDeBolasNaUrna n�mero de bolas que a urna contem. 
     * @return a urna pronta. 
     */  
    public static List<Integer> createUrna(int numeroDeBolasNaUrna) {  
        return createUrna(numeroDeBolasNaUrna,1);  
    }  
      
    /** 
     * Cria uma urna contendo o n�mero de bolas enviadas, que inicia do n�mero numeroIncial. 
     * @param numeroDeBolasNaUrna n�mero de bolas que a urna contem.  
     * @param numeroIncial n�mero inicial da bola da urna. 
     * @return 
     */  
    public static List<Integer> createUrna(int numeroDeBolasNaUrna,int numeroIncial) {  
        List<Integer> urna = new ArrayList<Integer>(numeroDeBolasNaUrna);  
        for (int i = 0; i < numeroDeBolasNaUrna; i++)   
            urna.add(i+numeroIncial);  
        return urna;  
    }  

}
