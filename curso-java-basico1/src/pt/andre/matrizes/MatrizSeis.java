package pt.andre.matrizes;

import java.util.Scanner;

public class MatrizSeis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		char jogoVelha[][] = new char [3][3];
		
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");
		
		boolean ganhou = false;
		int jogada = 1;
		char sinal = 0;
		int linha = 0; int coluna = 0;
		
		while (!ganhou) {
		
		if (jogada % 2 == 1) {// jogador 1			
			System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3).");
			sinal = 'X';
		} else {			
			System.out.println("Vez do jogador 2. Escolha linha e coluna(1-3).");
			sinal = 'O';
		}
		boolean linhaValida = false;
		while (!linhaValida){
			System.out.println("Entre com a linha (1 - 2 - 3).");
			linha = scan.nextInt();
			if ( linha >= 1 && linha <= 3) {
				linhaValida = true;
			} else {
				System.out.println("Dados inválidos. Digite novamente.");
			}
			
		}
		
		boolean colunaValida = false;
		while(!colunaValida) {
			System.out.println("Entre com a coluna (1 - 2 - 3).");
			coluna = scan.nextInt();
			if (coluna >=1 && coluna <= 3) {
				colunaValida = true;
			} else {
				System.out.println("Dados inválidos! Digite novamente.");
			}
		}
			
		linha--;
		coluna--;
		if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
			System.out.println("posição usada, tente novamente.");
		} else {//jogada válida
			jogoVelha[linha][coluna] = sinal;
			jogada++;
		}
		
		// imprimir o tabuleiro
		
		for (int i=0; i<jogoVelha.length; i++) {
			for (int j=0; j< jogoVelha[i].length; j++) {
				System.out.println(jogoVelha[i][j] + " | ");
			}
			System.out.println();
		}
		// verificar se tem vencedor
		if ((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X') || //linha 1
				(jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X') || // linha 2
				(jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X') || // linha 3
				(jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X') || // coluna1
				(jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X') || //coluna 2
				(jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X') || // coluna 3
				(jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X')){		// diagonal
			ganhou = true;
			System.out.println("Jogador 1 ganhou!");
			
		} else if ((jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O') || //linha 1
				(jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O') || // linha 2
				(jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O') || // linha 3
				(jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O') || // coluna1
				(jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O') || //coluna 2
				(jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'O' && jogoVelha[2][2] == 'O') || // coluna 3
				(jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O')){
			ganhou = true;
			System.out.println("Jogador 2 ganhou.");
		} else if (jogada > 9) {
			ganhou = true;
			System.out.println("Ninguém ganhou!!");
			}
		}
	}
}
