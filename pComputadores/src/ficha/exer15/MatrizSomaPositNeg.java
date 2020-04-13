package ficha.exer15;

import java.util.*;

public class MatrizSomaPositNeg {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        
        int [][]matriz =  {{5, -2, 7},{4, -9, 2}, {-3, -1, 4}};
        int soma_pos = 0;
        int soma_neg = 0;
        
        //soma postivos e negativos
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                if(matriz[i][j] > 0){
                    soma_pos += matriz[i][j];
                }else{
                    soma_neg += matriz[i][j];
                }
            }
        }
        
        //matriz original
        System.out.println("Matriz originial");
        for(int i=0; i<matriz.length; i++){
            System.out.println();
            for(int j=0; j<matriz.length; j++){
                System.out.print(matriz[i][j] + " ");
            }
        }
        
        System.out.printf("\nSoma positivos: %d\n", soma_pos);
        System.out.printf("Soma negativos: %d\n", soma_neg);
    }
}