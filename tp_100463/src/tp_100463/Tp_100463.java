//Trabalho prático 1º momento
//Curso: E. Informática // 1º ano
//Cadeira: Programação e Computadores
//Docente: Jorge Simões
//Aluno: Rúben Oliveira // @2019100463
//Data: 17/04/2020 - 2º semestre

package tp_100463;

import java.util.*;

public class Tp_100463 {

    public static int x = 0;
    
    //metodo insere rendimento
    public static void insere(){
            boolean flag = false;
            while(!flag){
                Scanner leia = new Scanner(System.in);
                System.out.println("Digite o valor do rendimento: ");
                x = leia.nextInt();
                if(x < 0){
                    System.out.println("Dados inválidos!");
                }else{
                    flag = true;
                }
            }
    }
    
    //metodo calcula taxa
    public static void calculaTaxa(int valor, double taxa){

        System.out.println("Para um rendimento de " + valor);
        System.out.println("O valor a pagar é: "+ (valor * (taxa/100)));
        System.out.println();

    }
    
    //metodo taxa 14.5% 
    public static void taxa14(){
        double taxa = 14.5;
        if(x == 0){
            System.out.println("Não existe valor de rendimento inserido!");
            System.out.println("----------------------------");
        }else if(x >= 0 && x <= 7091){
            System.out.println("Escalão correcto.");
            calculaTaxa(x, taxa);
            }else{
                System.out.println("Escalão incorrecto.");
        }
    }
    
    //metodo taxa 23%
    public static void taxa23(){
        double taxa = 23;
        if(x == 0){
            System.out.println("Não existe valor de rendimento inserido!");
            System.out.println("----------------------------");
        }else if(x > 7091 && x <= 10700){
            System.out.println("Escalão correcto..");
            calculaTaxa(x, taxa);
            }else{
                System.out.println("Escalão incorrecto.");
        }
    }
    
    //metodo taxa 28,5%%
    public static void taxa28(){
        double taxa = 28.5;
        if(x == 0){
            System.out.println("Não existe valor de rendimento inserido!");
            System.out.println("----------------------------");
        }else if(x > 10700 && x <= 20261){
            System.out.println("Escalão correcto.");
            calculaTaxa(x, taxa);
        }else{
            System.out.println("Escalão incorrecto.");
        }
    }
    
    //metodo taxa 35%
    public static void taxa35(){
        double taxa = 35;
        if(x == 0){
            System.out.println("Não existe valor de rendimento inserido!");
            System.out.println("----------------------------");
        }else if(x > 20261 && x <= 25000){
            System.out.println("Escalão correcto.");
            calculaTaxa(x, taxa);
            }else{
                System.out.println("Escalão incorrecto.");
        }
    }
    
    //metodo taxa 37%
    public static void taxa37(){
        double taxa = 37;
        if(x == 0){
            System.out.println("Não existe valor de rendimento inserido!");
            System.out.println("----------------------------");
        }else if(x > 25000 && x <= 36856){
            System.out.println("Escalão correcto.");
            calculaTaxa(x, taxa);
            }else{
                System.out.println("Escalão incorrecto.");
        }
    }
    
    //metodo taxa 45%
    public static void taxa45(){
        double taxa = 45;
        if(x == 0){
            System.out.println("Não existe valor de rendimento inserido!");
            System.out.println("----------------------------");
        }else if(x > 36856 && x <= 80640){
            System.out.println("Escalão correcto.");
            calculaTaxa(x, taxa);
            }else{
                System.out.println("Escalão incorrecto.");
        }
    }
    
    //metodo taxa 48%
    public static void taxa48(){
        double taxa = 48;
        if(x == 0){
            System.out.println("Não existe valor de rendimento inserido!");
            System.out.println("----------------------------");
        }else if(x > 80640){
            System.out.println("Escalão correcto.");
            calculaTaxa(x, taxa);
            }else{
                System.out.println("Escalão incorrecto.");
        }
    }
    
    //metodo principal
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        int opcao;
        do{
            System.out.println("=== Escalões de IRS ===");
            System.out.println();
            System.out.println("(1) Inserir o valor do rendimento\n"
                    + "(2) Taxa de 14,5%\n"
                    + "(3) Taxa de 23%\n"
                    + "(4) Taxa de 28,5%\n"
                    + "(5) Taxa de 35%\n"
                    + "(6) Taxa de 37%\n"
                    + "(7) Taxa de 45%\n"
                    + "(8) Taxa de 48%");
            System.out.println("============================");
            
            System.out.println("Escolha uma opcção: ");
            opcao = leia.nextInt();
            
            //switch case
            switch(opcao){
                case 1:
                    insere();
                    System.out.println("----------------------------");
                    break;
                case 2:
                    taxa14();
                    System.out.println("----------------------------");
                    break;
                case 3:
                    taxa23();
                    System.out.println("----------------------------");
                    break;
                case 4:
                    taxa28();
                    System.out.println("----------------------------");
                    break;
                case 5:
                    taxa35();
                    System.out.println("----------------------------");
                    break;
                case 6:
                    taxa37();
                    System.out.println("----------------------------");
                    break;
                case 7:
                    taxa45();
                    System.out.println("----------------------------");
                    break;
                case 8:
                    taxa48();
                    System.out.println("----------------------------");
                    break;
            }
        }while(opcao !=9);
    }
}