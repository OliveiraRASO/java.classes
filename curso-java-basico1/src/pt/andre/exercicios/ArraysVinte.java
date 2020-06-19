package pt.andre.exercicios;

import java.util.Scanner;

public class ArraysVinte {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int [] vetorA = new int [10];
				
		for (int i=0; i<vetorA.length; i++) {
			vetorA[i] = (int)Math.round(Math.random() * 50);
			System.out.print(vetorA[i] + " -> ");
		}
	}

}
