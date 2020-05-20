package raso.pt.pcomputadores;

import java.util.*;

public class Calculadora2 {
    
    // metodo para calcula a soma
            public static void calculaSoma(double a, double b){
                double soma = a + b;
                System.out.println("A soma é: " + soma);
            }
            
            // metodo para calcula a subtração
            public static void calculaSubtracao(double a, double b){
                double subtracao = a - b;
                System.out.println("A subtração é: " + subtracao);
            }
            
            // metodo para calcula a multiplicação
            public static void calculaMultiplicacao(double a, double b){
                double multi = a * b;
                System.out.println("A multiplicação é: " + multi);
            }
            
            // metodo para calcular a divisão
            public static void calculaDivisao(double a, double b){
                double divisao = a / b;
                double resto = a % b;
                //double quociente = a / b;
                System.out.println("A divisão é: " + divisao);
                //System.out.println("O seu quociente é: " + quociente);
                System.out.println("O resto da divisão é: " + resto);
            }
            
            // metodo para introduzir numeros
            public static void operandos(){
                Scanner leia = new Scanner(System.in);
        
                System.out.println("Insira um valor para 'a': ");
                double a = leia.nextDouble();

                System.out.println("Insira um valor para 'b': ");
                double b = leia.nextDouble();
            }

    public static void main(String[] args) {
        
        int escolha;
        do {
        System.out.println("(1) Operandos\n"
                + "(2) Soma\n"
                + "(3) Subtração\n"
                + "(4) Multiplicação\n"
                + "(5) Divisão\n"
                + "(6) Sair");
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Escolha um opção: ");
        escolha = leia.nextInt();
        
        switch(escolha){
            case 1:
                operandos();
            case 2:
                calculaSoma(escolha, escolha);
                break;
            case 3:
                calculaSubtracao(escolha, escolha);
                break;
            case 4:
                calculaMultiplicacao(escolha, escolha);
                break;
            case 5:
                calculaDivisao(escolha, escolha);
                break;
        }
        }while(escolha !=6);
    }

}
