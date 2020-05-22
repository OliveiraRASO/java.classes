package exercicio6;

//@utor: RASO_2019100463 //Eng_Informática
//Data: 22/05/2020

import java.util.*;

public class ConstroiCirculo {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Circulo circulo = new Circulo(1.0, 1.0, 5.0);
        Circulo circulo2 = new Circulo(5.0, 2.0, 3.0);
        
        //
        //printa resultados
        System.out.println("O Raio do círculo é: " + circulo.calculaPerimetro());
        System.out.println("A Área do rectângulo é: " + circulo.calculaArea());
        
        System.out.println("O Raio do círculo é: " + circulo2.calculaPerimetro());
        System.out.println("A Área do rectângulo é: " + circulo2.calculaArea());
        System.out.println("");
        
        circulo.aumentaRaio(2.0);
        circulo.diminuiRaio(1.5);
        
        //
        //printa resultado circulo um
        System.out.println("Primeiro circulo: " + circulo.getX() + ", " + circulo.getY());
        System.out.println("Raio: " + circulo.getRaio());
        System.out.println("Perimetro: " + circulo.calculaPerimetro() + ", Area: " + circulo.calculaArea());
        System.out.println("");
        
        //
        //printa resultado circulo dois
        System.out.println("Segundo circulo: " + circulo2.getX() + ", " + circulo.getY());
        System.out.println("Raio: " + circulo2.getRaio());
        System.out.println("Perimetro: " + circulo2.calculaPerimetro() + ", Area: " + circulo.calculaArea());
        
        if(circulo.raioMaior(circulo2) == true)
            System.out.println("O circulo 1 tem raio maior.");
        else
            System.out.println("O circulo 1 tem raio menor ou igual que circulo 2.");
        
        
        System.out.println("");
        circulo.escreveCirculo();
        circulo2.escreveCirculo();
    }
}