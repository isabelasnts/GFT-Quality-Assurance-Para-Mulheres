/*
Desafio
Um número feliz é um número definido pelo seguinte processo:

• Começando com qualquer número inteiro positivo, substitua o número pela soma dos quadrados de seus dígitos.
• Repita o processo até que o número seja igual a 1 (onde ficará), ou faça um loop infinito em um ciclo que não inclua 1.
• Aqueles números para os quais esse processo termina em 1 são felizes.
• Retorna true se n for um número feliz e false se não for.

Escreva um algoritmo para determinar se o número n é feliz.

Entrada
A entrada será feita por um número inteiro, correspondente ao valor de entrada para verificar se  o número é feliz ou não.

Saída
Retorne true, caso o número seja feliz, e retorne false, caso o número não seja feliz.
 */

import java.util.Scanner;

public class NumeroFeliz {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        while (true) {
            int soma = 0;
            String number = String.valueOf(n);
            char[] num = number.toCharArray();

            for (int i = 0; i < num.length; i++) {
                int digito = Integer.parseInt(String.valueOf(num[i]));
                soma += (digito * digito);
            }

            n = soma;

            if (soma != 1 && num.length == 1){
                System.out.println("false");
                break;
                //System.out.println(soma);
            }else if (soma == 1) {
                System.out.println("true");
                //System.out.println(soma);
                break;
            }
        }
    }
}

