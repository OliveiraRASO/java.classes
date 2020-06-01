package projecto6Continuacao;

//@utor: RASO_@2019100463 //Eng_Informática
//Data: 29/05/2020

import java.util.*;

public class FazCalculos {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Cientifica calc = new Cientifica();
        
        //
        //printa calculos
        System.out.println("!Faz cálculos!");
        System.out.println("===================");
        System.out.printf("A soma é: %.2f\n", calc.soma(10.5, 17.1));
        System.out.println("A potência é: " + calc.potencia(3, 2));
        System.out.println("A raíz é: " + calc.raiz(25));
    }
}