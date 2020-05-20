package listaAuto;

import java.util.Scanner;

public class engine {
    
    public static void motor(){
        
        String engine_list [] = {"#1 - [Óleo motor]", "#2 - [Filtro óleo]", "#3 - [Filtro de ar]", "#4 - [Filtro combustível]",
            "#5 - [Filtro habitáculo]", "9# - [Voltar]"};
        
        for(int i=0; i<engine_list.length; i++){
            System.out.println(engine_list[i]);
        }
        
        System.out.println("");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Escolha uma opção: ");
        int escolha = input.nextInt();
        
        String lista_pecas[] = new String;
        for(int i=0; i<lista_pecas.length; i++){
            
            while(true){
            
                if(escolha == 1){
                    lista_pecas[i] = engine_list[0];
                } else if(escolha == 2){
                    lista_pecas[i] = engine_list[1];
                } else if(escolha == 3){
                    lista_pecas[i] = engine_list[2];
                }
            }
        }
        System.out.println(lista_pecas);
        
    }

}