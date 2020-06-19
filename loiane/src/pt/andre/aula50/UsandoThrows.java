package pt.andre.aula50;

import java.util.Scanner;

public class UsandoThrows {
    
    public static void main(String[] args) {
        
        System.out.println("Digite um numero decimal");
        try {
            double num = lerNumero();
            System.out.println("Digitou " + num);
        }
        catch(Exception e){
            System.out.println("Entrada inválida");
            e.printStackTrace();
        }
    }
        public static double lerNumero() throws Exception {            
            Scanner scan = new Scanner(System.in);
            double num = scan.nextDouble();
            return num;
        }
    }