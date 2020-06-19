package pt.andre.variaveis;

import java.util.Scanner;

public class LadosTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o comprimento do Lado 'A' do triângulo: ");
		double ladoA = scan.nextDouble();
		
		System.out.print("Digite o comprimento do Lado 'B' do triângulo: ");
		double ladoB = scan.nextDouble();
		
		System.out.print("Digite o comprimento do Lado 'C' do triângulo: ");
		double ladoC = scan.nextDouble();
		
		if (ladoA > ladoB + ladoC) {
			System.out.print("Não forma um triângulo! ");
		}else if (ladoB > ladoA + ladoC) {
			System.out.print("Não forma um triângulo! ");
		}else if (ladoC > ladoA + ladoC) {
			System.out.print("Não forma um triângulo! ");
		}else {
			System.out.print("Forma triângulo! ");
		}
		
		}

	}
