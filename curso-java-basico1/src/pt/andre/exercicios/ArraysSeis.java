package pt.andre.exercicios;

import java.util.Scanner;

public class ArraysSeis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int [] vetorA = new int[10];
		int [] vetorB = new int[10];
		int [] vetorC = new int[10];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.print("Digite o "+i+"º número: ");
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA.length;
			vetorC[i] = vetorA[i] + vetorB[i];
		}
		
		System.out.print("Vetor A = ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}		
		System.out.println();
		
		System.out.print("Vetor B = ");
		for(int i=0; i<vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
		
		System.out.print("Vetor C = ");
		for(int i=0; i<vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}

	}

}
