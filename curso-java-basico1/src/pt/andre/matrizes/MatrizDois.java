package pt.andre.matrizes;

import java.util.Random;

public class MatrizDois {

	public static void main(String[] args) {
		
		Random numeros = new Random();

		int matriz[][] = new int[10][10];		

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = numeros.nextInt(100);
			}
		}
		
		for (int i=0; i <matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		
		int maiorL5 = 0;
		int menorL5 = Integer.SIZE;		
		int linha5 = 5;		
		
		for (int i=0; i<matriz[linha5].length; i++) {
			if (matriz[linha5][i] > maiorL5) {
				maiorL5 = matriz[linha5][i];
			}
			if (matriz[linha5][i] < menorL5) {
				menorL5 = matriz[linha5][i];
			}
		}
		System.out.println("O maior L5 é: " + maiorL5);
		System.out.println("O menor L5 é: " + menorL5);
		System.out.print("");
		
		int coluna7 = 7;
		int maiorC7 = 0;
		int menorC7 = Integer.SIZE;;
		
		for (int i=0; i<matriz.length; i++) {
				if (matriz[i][coluna7] > maiorC7) {
					maiorC7 = matriz[i][coluna7];
				}
				if (matriz[i][coluna7] < menorC7){
					menorC7 = matriz[i][coluna7];
				}
			}
		System.out.println("O maior C7 é: " + maiorC7);
		System.out.println("O menor C7 é: " + menorC7);
		System.out.print("");
		}
	}