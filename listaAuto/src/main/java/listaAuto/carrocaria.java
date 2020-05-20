package listaAuto;

import java.util.Scanner;

public class carrocaria{
    public static void body(){
        
        String body_list[] = {"#1 - [Amortecedores frente]", "#2 - [Amortecedores tras]", "#3 - [Panela escape]", "#4 - [Escovas limpa-vidros]",
        "#5 - [Rolamento roda frente]", "#6 - [Rolamento roda tras]", "#9 - [Voltar]"};
            
            for(int i=0; i<body_list.length; i++){
                System.out.println(body_list[i]);
            }
            
            Scanner input = new Scanner(System.in);
            
            System.out.println("");
            System.out.println("Escolha uma opcao: ");
            int opcao = input.nextInt();
            
            int n = 1;
            
            while (n > 0){
                if(opcao == 0 || opcao > body_list.length){
                    System.out.println("Opcao invalida.");
                } else if(opcao == 1){
                    System.out.println("Opcao escolhida: " + body_list[0]);
                    break;
                } else if(opcao == 2){
                    System.out.println("Opcao escolhida: " + body_list[1]);
                    break;
                } else if(opcao == 3){
                    System.out.println("opcao escolhida: " + body_list[2]);
                } else if(opcao == 4){
                    System.out.println("Opcao escolhida: " + body_list[3]);
                } else if(opcao == 5){
                    System.out.println("Opcao escolhida: " + body_list[4]);
                } else if(opcao == 6){
                    System.out.println("Opcao escolhida: " + body_list[5]);
                }
            }
    }
}