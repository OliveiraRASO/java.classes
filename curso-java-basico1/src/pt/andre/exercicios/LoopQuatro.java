package pt.andre.exercicios;

import java.util.Scanner;

public class LoopQuatro {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
					
		double popA ;
		double popB ;
		double taxaA;
		double taxaB;
		double cont = 0;
		
		boolean valido = false;		
		do {
			
			System.out.print("Digite a pop. 'A': ");
			popA = scan.nextDouble();
			
			if (popA > 0) {
				valido = true;
			} else {
				System.out.print("Dados inválidos!");
			}
		} while (!valido);
		
		valido = false;			
		do {
			
			System.out.print("Taxa de crescimento pop. 'A': ");
			taxaA = scan.nextDouble();
			
			if (taxaA > 0) {
				valido = true;
			} else {
				System.out.print("Dados inválidos");
			}
		} while(!valido);
		
		valido = false;			
		do {
			
			System.out.print("Digite a pop. 'B': ");
			popB = scan.nextDouble();
			
			if (popB > 0) {
				valido = true;
			} else {
				System.out.print("Dados inválidos.");
			}
			
		} while(!valido);
		
		valido = false;		
		do {
			
			System.out.print("Taxa de crescimento pop. 'B':");
			taxaB = scan.nextDouble();
			
			if (taxaB > 0) {
				valido = true;
			} else {
				System.out.print("Dados inválidos.");
			}
			
		} while(!valido);		
		while(popA <= popB) {
			
			popA += (popA/100) * 3;
			popB += (popB/100) * 1.5;
			cont ++;
		}
		
			System.out.println(popA + "\n" + popB);
			System.out.println("Anos: " + cont);

	}

}
