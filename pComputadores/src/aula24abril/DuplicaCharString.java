package aula24abril;

//Autor: @RASO
//Data: 24/04/2020

import java.util.*;

public class DuplicaCharString {
    
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        
        String opcao;
        int cont = 0;
        int len;
        do{
            System.out.println("\nDigite algo: ");
            opcao = leia.nextLine().toUpperCase();
            
            len = opcao.length();
            char[] tempCharArray = new char[len];
            
            //coloca string original num arrays de caracteres
            for (int i = 0; i < len; i++) {
              tempCharArray[i] = opcao.charAt(i);
            }
            
            //duplica caracteres
            for (int i = 0; i < opcao.length(); i++) {
		char a = opcao.charAt(i);
                System.out.print(" "+ a + a);
            }
        }while(!opcao.equals("FIM"));
    }
}