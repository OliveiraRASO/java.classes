package pt.andre.variaveis;

import java.util.Scanner;

public class PrecoFrutas {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a qtd de Morangos Kg/s: ");
		double morangos = scan.nextDouble();
		
		System.out.print("Digite a qtd de Ma�as Kg/s: ");
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
		
		
		
		System.out.print("O pre�o dos Morangos �: " + precoTotalMorango+ " �"+
				"\nO pre�o das Ma�as �: " + precoTotalMacas+" �");
		System.out.print("O pre�o total a pagar �: " + precoTotal);
	}	
}