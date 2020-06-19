package pt.andre.variaveis;

import java.util.Scanner;

public class AreaQuadrado {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o comprimento do lado do quadrado: ");
		double lado = scan.nextDouble();
		
		double area = Math.pow(lado, 2);
		double dobro = area * 2;
		
		System.out.printf("A área do quadrado é: %.2f", area);
		System.out.printf("\nO dobro da área do quadrado é: %.2f", dobro);
	}

}
