package aula08maio;

//Autor: @RASO
//Data: 

import java.util.*;

public class cartaoc {

	// metodo verificação cc
	public static boolean valida(String numFormal) {

		int soma = 0;
		boolean secondNumber = false;

		// remove espaços
		String numSemEspacos = numFormal.replaceAll(" ", "");

		if (numSemEspacos.length() != 12) {
			System.out.println("Número inválido.");
		}

		// converte para char array
		char[] ch = numSemEspacos.toCharArray();

		for (int i = ch.length - 1; i >= 0; --i) {
			int valor = convertCharToNumer(ch[i]);

			if (secondNumber) {

				valor *= 2;

//				if (valor > 9) {
				if (valor >= 10) {
					valor -= 9;
				}

				soma += valor;

				// faz um toggle (se estiver a verdadeiro para a false e vice-versa)
				secondNumber = !secondNumber;
			}
		}
		return (soma % 10 == 0);

	}
        
        //metodo valida nif
	public static boolean validaNif(String numFormal) {

            // remove espaços
            String numSemEspacos = numFormal.replaceAll(" ", "");

            // converte para char array
            char[] ch = numSemEspacos.toCharArray();

            int counter = 9;
            int result = 0;
            int rest = 0;
            int lastDigit = 0;
            int checkDigit = 0;
            for (int i = 0; i < ch.length; i++) {

                int nifNum = convertCharToNumer(ch[i]);

                if (counter > 1) {
                        result += (counter * nifNum);
                }else {
                        lastDigit = nifNum;
                }
                counter--;
            }
            System.out.println("Result: " + result);

            rest = result % 11;		
            System.out.println("The Rest: " + rest);

            if (rest < 2) {	
                    checkDigit = rest;
            }else {
                    checkDigit = 11 - rest;
            }
            System.out.println("Check Digit: " + checkDigit);

            if (lastDigit == checkDigit) {
                    System.out.println("----> Cartao válido");
            }else {
                    System.err.println("Número cartao inválido.");
            }
            return false;
	}

	public static void main(String[] args) {

		// leitura dados
		Scanner leia = new Scanner(System.in);
		String num, nif;
		System.out.println("Digite o número de cidadão: ");
		num = leia.nextLine();
                
                System.out.println("Digite o nif: ");
		nif = leia.nextLine();
                
		// aplica metodo
		valida(num);
		boolean result = valida(num);
                
                validaNif(nif);

		System.out.println("O numero inserido é valido? " + result);
	}

	public static int convertCharToNumer(char character) {

		switch (character) {
		case '0':
			return 0;
		case '1':
			return 1;
		case '2':
			return 2;
		case '3':
			return 3;
		case '4':
			return 4;
		case '5':
			return 5;
		case '6':
			return 6;
		case '7':
			return 7;
		case '8':
			return 8;
		case '9':
			return 9;
		case 'A':
			return 10;
		case 'B':
			return 11;
		case 'C':
			return 12;
		case 'D':
			return 13;
		case 'E':
			return 14;
		case 'F':
			return 15;
		case 'G':
			return 16;
		case 'H':
			return 17;
		case 'I':
			return 18;
		case 'J':
			return 19;
		case 'K':
			return 20;
		case 'L':
			return 21;
		case 'M':
			return 22;
		case 'N':
			return 23;
		case 'O':
			return 24;
		case 'P':
			return 25;
		case 'Q':
			return 26;
		case 'R':
			return 27;
		case 'S':
			return 28;
		case 'T':
			return 29;
		case 'U':
			return 30;
		case 'V':
			return 31;
		case 'W':
			return 32;
		case 'X':
			return 33;
		case 'Y':
			return 34;
		case 'Z':
			return 35;

		}

		return -1;
	}

}