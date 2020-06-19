package pt.andre.variaveis;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = teclado.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		double nota2 = teclado.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		double nota3 = teclado.nextDouble();
		
		System.out.print("Digite a quarta nota: ");
		double nota4 = teclado.nextDouble();		
		double media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.print("A media das notas é: " + media);
	}

}
