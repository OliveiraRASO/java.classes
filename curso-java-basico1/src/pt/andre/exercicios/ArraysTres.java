package pt.andre.exercicios;

import java.util.Random;
import java.util.Scanner;

public class ArraysTres {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int [] vetorA = new int [15];
		int [] vetorB = new int [vetorA.length];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.print("Digite o "+i+"º número: ");
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i] * vetorA[i];
		}
		System.out.print("vetor A = ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.print("Vetor B = ");
		for(int i=0; i<vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		
		
		/*Random rand = new Random();

		// Obtain a number between [0 - 49].
		int n = rand.nextInt(15);

		// Add 1 to the result to get a number from the required range
		// (i.e., [1 - 50]).
		n += 1;
		
		System.out.print(n);*/
		
	}

}
