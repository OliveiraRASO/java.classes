package Projeto5;

//@utor: RASO_@2019100463 //Eng_Informática
//Data: 29/05/2020

import java.util.*;

public class TestaFalar1 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Aluno a = new Aluno();
        Professor p = new Professor();
        
        //
        //separador de linhas
        char s = '=';
        char[] separador = new char[35];
        Arrays.fill(separador, s);
        
        //
        //printa metodo primeira instancia
        System.out.println("Primeira instancia: ");
        a.falar();
        System.out.println(separador);
        //
        //printa metodo primeira instancia
        System.out.println("Segunda instancia: ");
        p.falar();
        
        System.out.println(separador);
        System.out.println(separador);
        
    }
}