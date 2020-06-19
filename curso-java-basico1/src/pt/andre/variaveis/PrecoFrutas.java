package pt.andre.variaveis;

import java.util.Scanner;

public class PrecoFrutas {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a qtd de Morangos Kg/s: ");
		double morangos = scan.nextDouble();
		
		System.out.print("Digite a qtd de Maças Kg/s: ");
		double macas = scan.nextDouble();
		
		double precoMorangos = 0;
		double precoMacas = 0;
		double quilo = 1000;
		
		if (morangos <= 5) {
			precoMorangos = 2.50;
		}else {
			precoMorangos = 2.20;
		}
		
		if (macas <= 5) {
			precoMacas = 1.80;
		}else {
			precoMacas = 1.50;
		}
		
		double precoTotalMorango = morangos * precoMorangos;
		double precoTotalMacas = macas * precoMacas;
		
		double precoTotal = precoTotalMacas + precoTotalMorango;
		
		
		
		System.out.print("O preço dos Morangos é: " + precoTotalMorango+ " €"+
				"\nO preço das Maças é: " + precoTotalMacas+" €");
		System.out.print("O preço total a pagar é: " + precoTotal);
	}	
}