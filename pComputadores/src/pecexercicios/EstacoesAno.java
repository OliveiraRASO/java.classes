package pecexercicios;

import java.util.*;

public class EstacoesAno {

    public static void main(String[] args) {
        
        int escolha;
        do{
            
        // menu de opções
        System.out.println("(1) Inserir o mês\n"
                + "(2) Primavera\n"
                + "(3) Verão\n"
                + "(4) Outono\n"
                + "(5) Inverno\n"
                + "(6) Sair");
        Scanner leia = new Scanner(System.in);    
        
        System.out.println("Escolha uma opção: ");
        escolha = leia.nextInt();
        
        if(escolha == 1){
        // condição de escolha
            switch(escolha){
                case 1:
                    System.out.println("Insira um mês: ");
                    int mes = leia.nextInt();
                    // escolha de dia
                    if(mes == 1 | mes == 2){
                        System.out.println("Inverno");
                    }else if(mes == 12 | mes == 3){
                        System.out.println("Insira um dia: ");
                        int dia = leia.nextInt();
                        if(dia <= 21){
                            System.out.println("Inverno");
                        }else{
                            System.out.println("Primavera");
                        }
                    }
            }
        }
        }while(escolha != 6);
    }
}
