package pt.andre.exercicios;

import java.util.Scanner;

public class PotenciaNumero {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a base de um número: ");
		int base = scan.nextInt();
		
		System.out.print("Digite o expoente de um número: ");
		int expoente = scan.nextInt();
		
		int resultado = base;

		for (int i=1; i < expoente; i++) {
			resultado *= base;
			
		}
		System.out.print("O número "+base+" elevado a " + expoente +" equivale a " + resultado);
		
		

	}

}
