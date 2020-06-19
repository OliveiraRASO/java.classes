/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.andre.aula35;

/**
 *
 * @author Olive
 */
public class Teste2Calculadora {
    
    public static void main(String[] args) {
        
    int fatorialNR = Calculadora2.fatorialNaoRecursivo(5);
    System.out.println(fatorialNR);
    
    int fatorialR = Calculadora2.fatorial(5);
    System.out.println(fatorialR);
    }
}