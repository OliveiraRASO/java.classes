package pt.andre.variaveis;

import java.util.Scanner;

public class ExSwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double n1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota do aluno: ");
		double n2 = scan.nextDouble();
		
		double media = (n1 + n2) / 2;
		//System.out.println("A sua média é de : " + media+" valores.");
		
		if (media >= 9 && media <= 10) {
			System.out.println("O aluno tirou nota 'A'!Teve media de: " + media);
		} else if (media >= 7.5 && media < 9) {
			System.out.println("O aluno tirou nota 'B'!Teve media de: " + media);
		} else if (media >= 6 && media < 7.5) {
			System.out.println("O aluno tirou nota 'C'!Teve média de: " + media);
		} else if (media >= 4 || media < 6) {
			System.out.println("O aluno tirou nota 'D'!Teve média de: " + media);
		} else if (media >= 0 || media < 4) {
			System.out.println("O aluno tirou nota 'E'!Teve média de: " + media);
		}

	}

}
