package pt.andre.variaveis;

import java.util.Scanner;

public class ProgramaInteiros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um n�mero inteiro: ");
		int n1 = teclado.nextInt();
		
		System.out.print("Digite outro n�mero inteiro: ");
		int n2 = teclado.nextInt();
		
		System.out.print("Digite um n�mero real: ");
		double n3 = teclado.nextDouble();
		
		double produto = (n1*2) * (n2/2);
		double soma = (n1*3) + n3;
		double cubo = Math.pow(n3, 3);
		
		System.out.print("O produto do mdobro de "+n1+" com a metade de "+n2+" � " + produto);
		System.out.print("\nA soma do triplo de:"+n1+" com o n�mero:"+n3+" �:"+ soma);		
		System.out.print("\nO n�mero real elevado ao cubo �:"+cubo);
		
	}

}
