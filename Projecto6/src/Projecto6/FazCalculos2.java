package Projecto6;

//@utor: RASO_@2019100463 //Eng_Informática
//Data: 29/05/2020

import java.util.*;

public class FazCalculos2 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        
        System.out.println("!Faz cálculos 2!");
        System.out.println("========================");
        System.out.println("Digite um valor para 'A': ");
        double a = leia.nextDouble();
        System.out.println("Digite o valor para 'B': ");
        double b = leia.nextDouble();
        System.out.println("========================");
        System.out.println("========================");
        
        //
        //printa resultados das operações
        System.out.println("A soma: " + calc.soma(a, b));
        System.out.println("A subtração: " + calc.subtrai(a, b));
        System.out.printf("A multiplicação: %.2f\n", calc.multiplica(a, b));
        System.out.printf("A divisão: %.2f\n", calc.divisao(a, b));
    }
}