package ficha.exer15;

import java.util.*;

public class MatrizContaIguais {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        
        int [][]matriz =  {{5, -2, 7},{4, -9, 2}, {4, -1, 40}};
        int cont = 0;
        int x;
        
        System.out.println("Digite um número inteiro: ");
        x = leia.nextInt();
        
        //conta ocorrências
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                if(x == matriz[i][j]){
                    cont += 1;
                }
            }
        }
        System.out.printf("\nO número digitado existe %d vezes na matriz.", cont);
    }
}