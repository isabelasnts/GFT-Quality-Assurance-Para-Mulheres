/*Desafio
O gerente de uma loja resolveu aplicar descontos em todos os seus produtos! A tarefa é calcular a Porcentagem de Desconto aplicada a esses produtos. 

Entrada
A entrada deverá ser feita por dois valores M e D, onde a primeira linha deverá receber o valor marcado do produto, e na segunda linha o valor do produto 
com o desconto já aplicado.

Saída
A saída deverá retornar o percentual de desconto que foi aplicado no produto*/

import java.util.Scanner;
 
public class Main{

public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
		
    int M = input.nextInt();
    int S = input.nextInt();  
    int desconto = (S*100)/M;
    int descontoF = 100-desconto;
    System.out.println("O desconto foi de " + descontoF + "%");
  }
}
