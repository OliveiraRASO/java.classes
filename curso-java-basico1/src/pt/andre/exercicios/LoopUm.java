package pt.andre.exercicios;

import java.util.Scanner;

public class LoopUm {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean igual = false;
		
		String nome;
		String senha;
		
		do {
			System.out.print("Digite o nome do utilizador: ");
			nome = scan.nextLine();
			
			System.out.print("Digite a sua senha: ");
			senha = scan.nextLine();
			
			if (nome.equalsIgnoreCase(senha)) {
				System.out.println("Dados inválidos!");
			}
			
		}
		while (!igual);
	}

}
