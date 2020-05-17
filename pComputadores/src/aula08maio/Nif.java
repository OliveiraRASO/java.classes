package aula08maio;

//Autor: @RASO
//Data: 

import java.util.*;

public class Nif {

	public static boolean validaNif(String vatNumber) {
            final int max=9;
            //check if is numeric and has 9 numbers
            if (!vatNumber.matches("[0-9]+") || vatNumber.length()!=max) return false;
            int checkSum=0;
            //calculate checkSum
            for (int i=0; i<max-1; i++){
                    checkSum+=(vatNumber.charAt(i)-'0')*(max-i);
            }
            int checkDigit=11-(checkSum % 11);
            //if checkDigit is higher than TEN set it to zero
            if (checkDigit>=10) checkDigit=0;
            //compare checkDigit with the last number of NIF
            return checkDigit==vatNumber.charAt(max-1)-'0';
	}

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        String nif;
        System.out.println("Digite o número de identificação fiscal: ");
        nif = leia.nextLine();
        
        //validaNif(nif);
        boolean result = validaNif(nif);
        
        System.out.println("Nº identificação fiscal: "+ result);
    }
}