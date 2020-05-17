package aula24abril;

//Autor: @RASO
//Data: 24/04/2020

import java.util.*;

public class OcorrenciasAlfaString {
    
    public static boolean isNumeric(final String str) {

        //metodo verifica true/false
        if (str == null || str.length() == 0) {
            return false;
        }
        return str.chars().allMatch(Character::isDigit);
    }
    
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
            //printa se é true ou false
            System.out.println(isNumeric(opcao));
            
            //verifica qtd de ocorrencias
            
            
        }while(!opcao.equals("FIM"));
    }
}