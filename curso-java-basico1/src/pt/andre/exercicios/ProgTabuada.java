package pt.andre.exercicios;

import java.util.Scanner;

public class ProgTabuada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1 = 1;
		String resp = "";
		boolean valido = false;
		
		do {
			System.out.print("Qual a tabuada quer ver? ");
			int num = scan.nextInt();
		
		for (int i=1; i < 11; i++) {
			num1 = num*i;
			System.out.println(num+" x "+i+" = "+ num1);			
			
			}
			System.out.print("Quer continuar? [S/N]");
			resp = scan.next();
			
			if (resp.equalsIgnoreCase("n")){
				valido = true;
			}
			
		} while(!valido);
		System.out.print("FIM!!");
	}
}
