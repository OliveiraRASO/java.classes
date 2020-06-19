package pt.andre.variaveis;

import java.util.Scanner;

public class EquacaoSegundoGrau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o 'A': ");
		double a = scan.nextDouble();
		
		if (a == 0) {
			System.out.print("Equa��o n�o tem ra�zes reais!");
		}else {
		
			System.out.print("Digite o 'B': ");
			double b = scan.nextDouble();
			
			System.out.print("Digite o 'C': ");
			double c = scan.nextDouble();
			
			double delta = (Math.pow(b, 2) - 4 * a * c);
			
			if (delta < 0) {			
				System.out.println("Delta negativo, equa��o n�o possui ra�zes reais!");
			}else if (delta == 0) {
				System.out.println("Equa��o possui apenas uma ra�z real!");
			}else {
				System.out.println("Equa��o possui duas ra�zes reais!");
			}
			System.out.print("Delta =" + delta);
		}	

	}

}
