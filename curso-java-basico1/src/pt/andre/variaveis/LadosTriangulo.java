package pt.andre.variaveis;

import java.util.Scanner;

public class LadosTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o comprimento do Lado 'A' do tri�ngulo: ");
		double ladoA = scan.nextDouble();
		
		System.out.print("Digite o comprimento do Lado 'B' do tri�ngulo: ");
		double ladoB = scan.nextDouble();
		
		System.out.print("Digite o comprimento do Lado 'C' do tri�ngulo: ");
		double ladoC = scan.nextDouble();
		
		if (ladoA > ladoB + ladoC) {
			System.out.print("N�o forma um tri�ngulo! ");
		}else if (ladoB > ladoA + ladoC) {
			System.out.print("N�o forma um tri�ngulo! ");
		}else if (ladoC > ladoA + ladoC) {
			System.out.print("N�o forma um tri�ngulo! ");
		}else {
			System.out.print("Forma tri�ngulo! ");
		}
		
		}

	}
