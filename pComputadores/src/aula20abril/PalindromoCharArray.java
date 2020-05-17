package aula20abril;

//Autor: @RASO
//Data: 

import java.util.*;

public class PalindromoCharArray {

    public static void main(String[] args) {
    
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite algo p/ comparar: ");
        
        String palindromo = leia.nextLine();
        int len = palindromo.length();
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];

        // coloca string original num arrays de caracteres
        for (int i = 0; i < len; i++) {
          tempCharArray[i] = palindromo.charAt(i);
        }

        //string invertida
        for (int j = 0; j < len; j++) {
          charArray[j] = tempCharArray[len - 1 - j];
        }
        String palindromoInvertido = new String(charArray);
        System.out.println(palindromoInvertido);
        
        //compara strings
        if(palindromo.equals(palindromoInvertido)){
            System.out.println("É palíndromo.");
        }else{
            System.out.println("Não é palíndromo.");
        }
    }
}