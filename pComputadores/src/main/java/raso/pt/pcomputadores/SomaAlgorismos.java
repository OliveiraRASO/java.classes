package raso.pt.pcomputadores;

import java.util.Scanner;

public class SomaAlgorismos {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        int cont = 0;
        int soma = 0;
        int n = 0;
        
//        while (true) {
//            System.out.println("Insira um número inteiro: ");
//            int num = leia.nextInt();
//            
//            cont += 1;
//            soma += num;
//            
//            System.out.println("A soma dos algarismos é: " + soma);
//            
//        }

        for (int i=0; i<2; i++){
            System.out.println("Insira um número inteiro: ");
            int num = leia.nextInt();
            n = num;
            
            soma += num%10;
            n /= 10;
            
            System.out.println("A soma dos algarismos é: " + n);
        }
    }

}
