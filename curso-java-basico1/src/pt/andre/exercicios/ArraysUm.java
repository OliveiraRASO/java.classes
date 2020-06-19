package pt.andre.exercicios;

import java.util.Scanner;

public class ArraysUm {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[5];
		
		for ( int i=0; i<vetorA.length;i++) {
			System.out.print("Digite o "+i+"º número: ");
			vetorA[i] = scan.nextInt();			
			vetorB[i] = vetorA[i];
		}
		System.out.print("Vetor A = ");
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.print("Vetor B = ");
		for (int i=0; i<vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
	}

}
