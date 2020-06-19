package pt.andre.exercicios;

import java.util.Scanner;

public class LoopDois {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean infosValidas = false;
		String nome;
		int idade;
		
		do {
			
			System.out.print("Digite o nome: ");
			nome = scan.next();
			
			if (nome.length() >= 3) {
				infosValidas = true;
			} else {
				System.out.println("Dados inválidos! 3 ou mais caracteres!");
			}
			
		} while(!infosValidas);
		
		infosValidas = false;
		
		do {
			
			System.out.print("Digite a idade: ");
			idade = scan.nextInt();
			
			if (idade >= 0 && idade < 150) {
				infosValidas = true;
			} else {
				System.out.println("Dados inválidos! Digite 0 a 150.");
			}
			
		} while(!infosValidas);
		System.out.print("Dados: " + nome+
				"\nIdade: " + idade);

	}

}
