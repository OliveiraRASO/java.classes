package listaAuto;

import java.util.Scanner;

public class brakes {
    
    public static void travoes(){        
    	String brake_list[] = {"#1 - [Calços frente]", "#2 - [Calços trás]", "#3 - [Discos frente]", "#4 - [Discos trás]", 
    	                       "#5 - [Avisadores desgaste frente]", "#6 - [Avisadores desgaste trás]", "#7 - [Óleo de travões]",
        "#9 - [Voltar]"};
    
    	for(int i=0; i<brake_list.length; i ++){
            System.out.println(brake_list[i]);
    	}
    	
        System.out.println("");

        Scanner input = new Scanner(System.in);
        
        System.out.println("Escolha uma opção: ");
        int escolha = input.nextInt();

        if (escolha == 1){
            System.out.println(escolha);
        } else if (escolha == 2){
            System.out.println(escolha);
        }
      	}
  }