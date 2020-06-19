package pt.andre.variaveis;

import java.util.Scanner;

public class ConversorMedidas {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantos metros quer converter? ");
		double medida = scan.nextDouble();
		System.out.println("============================");
		
		System.out.println("Analisando dados... ");
		System.out.println("============================");
		double cent = medida * 100;
		
		System.out.println(+ medida+" metros, são "+cent+" centímetros");

	}

}
