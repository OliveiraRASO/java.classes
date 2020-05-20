package listaAuto;

import java.util.Scanner;

public class listaAuto { 

    public static void main(String[] args) {
    
    System.out.println("	** Registo de Manutenção AUTO **");
    System.out.println("");
    menu.menuPrincipal();
    
    System.out.println("");
    System.out.println("#9 - [Saída]");
    
    Scanner input = new Scanner(System.in);
    System.out.println("Escolha uma opção: ");
    int opcao = input.nextInt();
    
    if (opcao == 0){
        menu.menuPrincipal();
    } else if(opcao == 1){
        engine.motor();
    } else if(opcao == 2){
        brakes.travoes();
    } else if(opcao == 3){
        carrocaria.body();
    } else if(opcao == 9){
        System.out.println("Saída!");
    }
  }
}