package pt.andre.matrizes;

import java.util.Random;

import java.util.Scanner;

public class Matrizz {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int matriz[][] = new int[4][4];
		
		Random numerosRandom = new Random();
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = numerosRandom.nextInt(100);
			}
		}
		
		int maior = 0;
		int linha = 0;
		int coluna = 0;
		
		for (int i=0; i <matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				if (matriz[i][j] > maior) {
					maior = matriz[i][j];
					linha = i;
					coluna = j;
				}
			}
		}
		for (int i=0; i <matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}System.out.println();
		}		
		System.out.println("O maior é: " + maior);
		System.out.println("Na linha: " + linha);
		System.out.println("Coluna: " + coluna);
	}

}
