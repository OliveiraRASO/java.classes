package pt.andre.exercicios;

import java.util.Scanner;

public class IntervaloNumeros {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int soma = 0;
		
		System.out.print("Digite o primeiro número: ");
		int n1 = scan.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int n2 = scan.nextInt();
		
		for (int i=n1;i <= n2;i++) {
			System.out.print(i+" ");
			soma += i;
			
		}System.out.print("\nA soma vale: " + soma);

	}

}
