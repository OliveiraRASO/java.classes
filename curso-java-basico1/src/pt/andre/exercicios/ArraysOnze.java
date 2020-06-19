package pt.andre.exercicios;

import java.util.Scanner;

public class ArraysOnze {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int [] vetorA = new int[10];
		int par = 0;
		int impar = 0;
		
		for (int i=0; i < vetorA.length; i++) {
			System.out.print("Digite o "+i+"º número para vetor A: ");
			vetorA[i] = scan.nextInt();
			
			if (vetorA[i] % 2 == 0) {
				par ++;
			} else {
				impar ++;				
			}
		}System.out.println("Os valores pares são: " + par);
		System.out.print("Os valores impares são: " + impar);

	}

}
