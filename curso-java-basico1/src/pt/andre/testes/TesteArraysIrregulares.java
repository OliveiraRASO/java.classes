package pt.andre.testes;

import java.util.Scanner;

public class TesteArraysIrregulares {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o nº de pessoas entrevistadas: ");
		int numEntrevistados = scan.nextInt();
		
		String[][] nomesFilhos = new String[numEntrevistados][];
		
		for (int i=0; i<nomesFilhos.length; i++) {
			
			System.out.print("Digite a qtd de filhos: ");
			int qtdFilhos = scan.nextInt();
			
			nomesFilhos[i] = new String [qtdFilhos];
			
			for (int j=0; j<nomesFilhos[i].length; j++) {
				System.out.print("Digite o nome do filho "+j+": ");
				nomesFilhos[i][j] = scan.next();
				
			}
			
		}
		
		for (int i=0; i<nomesFilhos.length; i++) {
			System.out.println("Pessoa "+i+" tem "+nomesFilhos[i].length+" filhos");
			for (int j=0; j<nomesFilhos[i].length; j++) {
				System.out.println(nomesFilhos[i][j]);
			}
		}
	}			

}
