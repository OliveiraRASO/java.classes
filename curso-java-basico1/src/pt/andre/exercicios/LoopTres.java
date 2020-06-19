package pt.andre.exercicios;

import java.util.Scanner;

public class LoopTres {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int popA = 80000;
		int popB = 200000;
		int cont = 0;
		
		while(popA <= popB) {
			
			popA += (popA/100) * 3;
			popB += (popB/100) * 1.5;
			cont ++;
		}
		
			System.out.println(popA + "\n" + popB);
			System.out.println("Anos: " + cont);

	}

}
