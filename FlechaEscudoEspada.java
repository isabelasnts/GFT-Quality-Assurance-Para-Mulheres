/*Desafio
Você e seus amigos estão em uma aula de criação de jogos. Para inspirar os alunos e treinar,
o professor pediu para que vocês fizessem um jogo que já existe com alguma modificação.
A escolha de vocês foi "Pedra, Papel e Tesoura" e a modificação
foi mudar Pedra para Flecha, Papel para Escudo e Tesoura para Espada.
Então, vocês escolheram um número para representar cada um dos parâmetros. Sendo:
1 - Flecha
2 - Escudo
3 - Espada

Entrada
A entrada vão ser dois números representando cada um dos parâmetros.
Sendo a primeira entrada o jogador e a segunda o inimigo.

Saída
A saída deve ser se o jogador ganhou, empatou ou perdeu após a análise das duas entradas.
A saída deve ser sem as aspas.*/

import java.util.Scanner;

public class FlechaEscudoEspada {

    public static void main(String[] args) {
        System.out.println("Digite:\n"+"1 para Flecha\n" + "2 para Escudo\n" + "3 para Espada ");
        Scanner leitor = new Scanner(System.in);
        int jogadaJogador = leitor.nextInt();
        System.out.println("Digite:\n"+"1 para Flecha\n" + "2 para Escudo\n" + "3 para Espada ");
        int jogadaInimigo = leitor.nextInt();

        if (jogadaJogador == jogadaInimigo){
            System.out.println("Empatou");
        } else if ((jogadaJogador == 1 && jogadaInimigo == 3)|| (jogadaJogador>jogadaInimigo)){
            System.out.println("Ganhou");
        } else {
            System.out.println("Perdeu");
        }
    }
}

