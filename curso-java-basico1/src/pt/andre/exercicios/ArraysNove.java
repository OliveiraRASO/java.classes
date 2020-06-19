package pt.andre.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ArraysNove {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int [] vetorA = new int[5];
		int [] vetorB = new int[vetorA.length];
		double [] vetorC = new double[vetorA.length];
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.print("Digite o "+i+"º número para vetor A: ");
			vetorA[i] = scan.nextInt();
		}
		System.out.println();
		
		for (int i=0; i<vetorB.length; i++) {
			System.out.print("Digite o "+i+"º número para vetor B: ");
			vetorB[i] = scan.nextInt();
			vetorC[i] = vetorA[i] / vetorB[i];
		}
		System.out.println();
		
		System.out.print("Vetor A = ");
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.print("Vetor B = ");
		for (int i=0; i<vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
		
		DecimalFormat df = new DecimalFormat("###,###.##");
		
		System.out.print("Vetor C =");
		for (int i=0; i<vetorC.length; i++) {
			System.out.print(df.format(vetorC[i] + " "));
		}

	}

}
