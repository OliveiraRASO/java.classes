package pt.andre.variaveis;

import java.util.Scanner;

public class EquacaoSegundoGrau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o 'A': ");
		double a = scan.nextDouble();
		
		if (a == 0) {
			System.out.print("Equação não tem raízes reais!");
		}else {
		
			System.out.print("Digite o 'B': ");
			double b = scan.nextDouble();
			
			System.out.print("Digite o 'C': ");
			double c = scan.nextDouble();
			
			double delta = (Math.pow(b, 2) - 4 * a * c);
			
			if (delta < 0) {			
				System.out.println("Delta negativo, equação não possui raízes reais!");
			}else if (delta == 0) {
				System.out.println("Equação possui apenas uma raíz real!");
			}else {
				System.out.println("Equação possui duas raízes reais!");
			}
			System.out.print("Delta =" + delta);
		}	

	}

}
