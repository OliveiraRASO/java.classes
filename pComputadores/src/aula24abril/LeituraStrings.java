package aula24abril;

//Autor: @RASO
//Data: 24/04/2020

import java.util.*;

public class LeituraStrings {
    
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        
        String opcao;
        int cont = 0;
        do{
            System.out.println("Digite algo: ");
            opcao = leia.nextLine().toUpperCase();
            //conta prefixos
            if(opcao.charAt(0) == 'A' || opcao.charAt(0) == 'B' || opcao.charAt(0) == 'C'){
                cont += 1;
            }
        }while(!opcao.equals("FIM"));
        System.out.println(cont);
    }
}