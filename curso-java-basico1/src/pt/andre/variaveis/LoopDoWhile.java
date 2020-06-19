package pt.andre.variaveis;

import java.util.Scanner;

public class LoopDoWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean notaValor = false;
		
		do {
			System.out.print("Digite um valor entre 1 e 10: ");		
			double valor = scan.nextDouble();
			
			if (valor >= 0 && valor <= 10) {
				notaValor = true;
				System.out.print("A nota é: " + valor);
			}else {				
				System.out.println("Nota inválida");
			}
		}while (!notaValor);
		}
	}
