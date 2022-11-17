/*Desafio
Elabore um programa que simule uma fila de atendimento bancário. O programa deve ler o nome de 3 pessoas (clientes do banco), armazenando-os em uma fila.

Entrada
A entrada será o nome de três pessoas (clientes do banco).

Saída
O programa deve imprimir como saída na tela o nome da pessoa e sua posição na fila.*/

import java.util.Scanner; 
 
public class Main { 
 
    public static void main(String[] args) { 
	Scanner nome = new Scanner(System.in);
    	String[] nomesFila = new String[3]; 
    	int next = 0;
    
    	for(int i = 0; i < 3; i++) {
    		String N = nome.next();
    		nomesFila[next] = N;
    		next++;
   	}
    
    	for(int i = 0; i < 3; i++) {
    		System.out.println (nomesFila[i] + " - esta na posicao: " + (i+1));
   	}
    } 
}
