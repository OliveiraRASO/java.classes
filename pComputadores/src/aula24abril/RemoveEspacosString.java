package aula24abril;

//Autor: @RASO
//Data: 24/04/2020

import java.util.*;

public class RemoveEspacosString {
    
    //metodo para remover espaços no inicio e fim de uma string
    public static String TrimAll(String opcao_formal){
	String string = opcao_formal.trim();
	while (string.contains("  ")) {
		string = string.replaceAll(" + ", "+");
	}
	return string;
}
    
    //metodo principal
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        String opcao;
        int cont = 0;
        int len;
        
        //ciclo do while
        do{
            System.out.println("Digite algo: ");
            opcao = leia.nextLine().toUpperCase();
            len = opcao.length();
            char[] tempCharArray = new char[len];
            char[] charArray = new char[len];
            
            //coloca string original num arrays de caracteres
            for (int i = 0; i < len; i++) {
              tempCharArray[i] = opcao.charAt(i);
            }

            //string invertida
            for (int j = 0; j < len; j++) {
              charArray[j] = tempCharArray[len - 1 - j];
            }
            
            //printa string invertida
            String stringInvertido = new String(charArray);
            System.out.println(stringInvertido);
            
            //remove espaços no inicio fim da string
            TrimAll(opcao);
            System.out.println(opcao.replaceAll(" ", ""));
            
        }while(!opcao.equals("FIM"));
    }
}