package raso.pt.pcomputadores;

import java.util.Scanner;

public class MaiorDeTres {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira um número: ");
        int x = input.nextInt();
        
        System.out.println("Insira outro número: ");
        int y = input.nextInt();
        
        System.out.println("Insira o terceiro número: ");
        int z = input.nextInt();
        
//        if (x == y || x == z || y == z){
//            System.out.println("Os números são iguis.");
//        } else if (x > y || x > z){
//            System.out.println("O maior é " + x);
//        }else if(y > x || y > z){
//            System.out.println("O maior é " + y);
//        }else{
//            System.out.println("O maior é " + z);
//        }
        
        if(x > y){
            if(x > z){
            System.out.println("O maior é " + x);
            }
        }
        if(y > x){
            if(y > z){
                System.out.println("O maior é " + y);
            }
        }
        if(z > x){
            if(z > y){
                System.out.println("O maior é " + z);
            }
        }
        if (x == y){
            if(y == z){
                System.out.println("Os múmeros são iguais.");
            }
        }
        
//        if (x > y){
//            if (x > z){
//                System.out.println("Dois números são iguais e um é diferente.");
//            }
//        }
    }
}
    
