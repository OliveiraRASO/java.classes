package pt.andre.exercicios;

import java.util.Scanner;

public class LoopCinco {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*int n1, n2, n3, n4, n5;
		
		System.out.print("Digite um n�mero: ");
		n1 = scan.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		n2 = scan.nextInt();
		
		System.out.print("Digite o terceiro n�mero: ");
		n3 = scan.nextInt();
		
		System.out.print("Digite o quarto n�mero: ");
		n4 = scan.nextInt();
		
		System.out.print("Digite o quinto n�mero: ");
		n5 = scan.nextInt();
		
		int media = (n1 + n2 + n3 + n4 + n5) / 5;
		int soma = n1 + n2 + n3 + n4 + n5;
		
		if (n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5) {		
			System.out.println("O primeiro valor � mais alto: " + n1);
		} else if (n2 > n1 && n2 > n3 && n2 > n4 && n2 > n5) {
			System.out.println("O segundo valor � mais alto: " + n2);
		} else if (n3 > n1 && n3 > n2 && n3 > n4 && n3 > n5) {
			System.out.println("O terceiro valor � mais alto: " + n3);
		} else if (n4 > n1 && n4 > n2 && n4 > n3 && n4 > n5) {
			System.out.println("O quarto valor � mais alto: " + n4);			
		} else {
			System.out.println("O quinto valor � mais alto: " + n5);			
		}System.out.println("A m�dia dos valores �: " + media);
		System.out.print("A soma dos valores �: " + soma);*/
		
		int num;
		int maior = Integer.MIN_VALUE;
		int soma = 0;
		double media = 0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("Digite um n�mero: ");
			num = scan.nextInt();
			
			if (num > maior) {
				maior = num;
				soma += num;
				media = soma / 5;
				//System.out.println("O maior mudou: " + maior);
				
			}
			
		}
		System.out.print("\n");
		//System.out.println("O maior valor �: " + maior);
		System.out.println("A soma vale: " + soma);
		System.out.print("A media �: " + media);
	}	

}
