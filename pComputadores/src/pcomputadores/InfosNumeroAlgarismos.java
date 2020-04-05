package pcomputadores;

import java.util.*;

public class InfosNumeroAlgarismos {
    
    // metodo para somar algarismos
    public static int somaAlgarismos(int soma_formal, int num){
        do{
            soma_formal += (num % 10);
            num /= 10;
        }while(num != 0);
        return soma_formal;
    }
    
    // metodo para contar o numero de algarismos
    public static int contaNumeros(int num_formal){
        int cont = 0;
        while(num_formal > 0){
            num_formal /= 10;
            cont += 1;
        }
        return cont;
    }
    
    // metodo para calcular a media dos algarismos
    public static int calculaMEdia(int cont_formal, int soma_formal){
        int media = soma_formal / cont_formal;
        return media;
    }
    
    // metodo para inverter o número
    public static int inverteNumero(int num_formal){
        int invertido = 0;
        while(num_formal > 0){
            invertido *= 10;
            invertido += (num_formal % 10);
            num_formal /= 10;
        }
        return invertido;
    }
    
    // metodo para verificar se é número capicua
    public static int verificaCapicua(int num_formal, int num_invertido){
        if(num_formal == num_invertido){
            System.out.println("É número capicua.");
        }else{
            System.out.println("Não é número capicua.");
        }
        return verificaCapicua(num_formal, num_invertido);
    }
    
    // metodo para verificar se é número perfeito
    public static int numeroPerfeito(int num_formal){
        int cont = 0;
//        if(num_formal % 2 == 0){
//            cont += 1;
//            System.out.println("É número perfeito.");
//        }else{
//            System.out.println("Não é número perfeito.");
//        }
        for (int j = 1; j < num_formal; j++) {

            	if (num_formal % j == 0) 
                	cont += j;
            	
        	}
        	if (cont == num_formal) 
            		System.out.println("Numero perfeito");
        	 else 
            		System.out.println("Não é numero perfeito");
                return numeroPerfeito(num_formal);
    
    }

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        System.out.println("Insira um número inteiro: ");
        int x = leia.nextInt();
        int soma = 0;
        
        // printa número de algarismos
        System.out.println("O número de algarismo é: " + contaNumeros(x));
        // printa soma
        System.out.println("A soma dos algarismos é: " + somaAlgarismos(soma, x));
        // printa a media dos algarismos
        System.out.println("A media dos algarismos é: " + calculaMEdia(contaNumeros(x), somaAlgarismos(soma, x)));
        // printa número invertido
        System.out.println("O número invertido é: " + inverteNumero(x));
        // printa se é ou não número capicua
        //System.out.println(verificaCapicua(x, inverteNumero(x)));
        // printa se o número é perfeito
        //System.out.println(numeroPerfeito(x));
    }
}
