package ficha.exer15;

import java.util.*;

public class MatrizSomaDiagonal {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        
        int [][]matriz =  {{5, -2, 7},{4, -9, 2}, {-3, -1, 40}};
        int soma = 0;
        
        //multiplicação de diagonal para matrizes quadradas
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                soma = (matriz[0][0] + matriz[1][1] + matriz[2][2]);
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
        System.out.printf("\nA multipicação da diagonal principal é: %d\n", soma);
    }
}