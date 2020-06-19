package pt.andre.matrizes;

import java.util.Scanner;

public class MatrizQuatro {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String compromissos[][] = new String [31][24];
		
		boolean sair = false;
		byte opcao;
		while(!sair) {
			
			System.out.println("Digite 1 para adicionar compromisso.");
			System.out.println("Digite 2 para verificar compromisso.");
			System.out.println("Digite 0 para sair.");
			
			opcao = scan.nextByte();
			
			if (opcao == 1) {//adicionar compromisso
				
				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println("Digite o dia do mês: ");
					dia = scan.nextInt();
					
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inválido!Digite novamente.");
					}
				}			
							
				boolean horaValida = false;
				int hora = 0;				
				while (!horaValida) {
					System.out.println("Digite a hora do compromisso quer verificar?");
					hora = scan.nextInt();					
					if (hora >= 0 && hora <= 24) {
						horaValida = true;
					} else {
						System.out.println("Hora inválida.Digite novamente.");
					}
				}
				
				System.out.println("O compromisso agendado é:");
				System.out.println(compromissos[--dia][hora] = scan.next());
				
			} else if (opcao == 2) {//verificar compromisso	
				
				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println("Digite o dia do mês: ");
					dia = scan.nextInt();
					
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inválido!Digite novamente.");
					}
				}			
							
				boolean horaValida = false;
				int hora = 0;				
				while (!horaValida) {
					System.out.println("Digite a hora do compromisso quer verificar?");
					hora = scan.nextInt();					
					if (hora >= 0 && hora <= 24) {
						horaValida = true;
					} else {
						System.out.println("Hora inválida.Digite novamente.");
					}
					dia--;
					System.out.println("O compromisso agendado é: ");
					System.out.println(compromissos[dia][hora]);
				}
				
			} else if (opcao == 0) {//sair
				sair = true;
				System.out.println("FIM!");
			} else {
				System.out.println("Opcção inválida.");
				System.out.println("====================");
			}
			
		}

	}

}
