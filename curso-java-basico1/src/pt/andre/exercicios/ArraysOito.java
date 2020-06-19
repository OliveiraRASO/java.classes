package pt.andre.exercicios;

import java.util.Scanner;

public class ArraysOito {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.print("Digite o "+i+"º número VETOR A: ");
			vetorA[i] = scan.nextInt();
		}		
		System.out.println("================================");
		
		for(int i=0; i<vetorB.length; i++) {
			System.out.print("Digite o "+i+"º número VETOR B: ");
			vetorB[i] = scan.nextInt();
			vetorC[i] = vetorA[i] * vetorB[i];
		}
		System.out.println("================================");
		
		System.out.print("Vetor A = ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.print("Vetor B = ");
		for (int i=0; i<vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
		
		System.out.print("Vetor C = ");
		for (int i=0; i<vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
	}

}
