package Projecto6;

//@utor: RASO_@2019100463 //Eng_Informática
//Data: 29/05/2020

import java.util.*;

public class FazCalculos1 {

    public static void main(String[] args) {

        //Scanner leia = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        
        //
        //printa resultados das operações
        System.out.println("!Faz cálculos 1!");
        System.out.println("==================");
        System.out.println("A soma: " + calc.soma(2.7, 5.2));
        System.out.println("A subtração: " + calc.subtrai(2.7, 5.2));
        System.out.printf("A multiplicação: %.2f\n", calc.multiplica(2.7, 5.2));
        System.out.printf("A divisão: %.2f\n", calc.divisao(2.7, 5.2));
        
        
    }
}