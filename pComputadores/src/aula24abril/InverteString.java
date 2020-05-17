package aula24abril;

//Autor: @RASO
//Data: 24/04/2020

import java.util.*;

public class InverteString {
    
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        String opcao;
        int cont = 0;
        int len;
        
        do{
            System.out.println("Digite algo: ");
            opcao = leia.nextLine().toUpperCase();
            len = opcao.length();
            char[] tempCharArray = new char[len];
            char[] charArray = new char[len];
            // coloca string original num arrays de caracteres
            for (int i = 0; i < len; i++) {
              tempCharArray[i] = opcao.charAt(i);
            }

            //string invertida
            for (int j = 0; j < len; j++) {
              charArray[j] = tempCharArray[len - 1 - j];
            }

            String palindromoInvertido = new String(charArray);
            System.out.println(palindromoInvertido);
        }while(!opcao.equals("FIM"));
    }
}