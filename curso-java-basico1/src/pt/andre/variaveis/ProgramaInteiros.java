package pt.andre.variaveis;

import java.util.Scanner;

public class ProgramaInteiros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int n1 = teclado.nextInt();
		
		System.out.print("Digite outro número inteiro: ");
		int n2 = teclado.nextInt();
		
		System.out.print("Digite um número real: ");
		double n3 = teclado.nextDouble();
		
		double produto = (n1*2) * (n2/2);
		double soma = (n1*3) + n3;
		double cubo = Math.pow(n3, 3);
		
		System.out.print("O produto do mdobro de "+n1+" com a metade de "+n2+" é " + produto);
		System.out.print("\nA soma do triplo de:"+n1+" com o número:"+n3+" é:"+ soma);		
		System.out.print("\nO número real elevado ao cubo é:"+cubo);
		
	}

}
