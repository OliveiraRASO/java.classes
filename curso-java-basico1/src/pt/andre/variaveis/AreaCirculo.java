package pt.andre.variaveis;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o raio: ");
		double raio = scan.nextDouble();
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("===========================");
		System.out.printf("A área calculada é: %.2f", + area);

	}

}
