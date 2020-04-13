package ficha.exer15;

import java.util.*;

public class MatrizTransposta {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        
        int [][]matriz =  {{5, -2, 7},{4, -9, 2}, {-3, -1, 4}};
        
        //matriz original
        System.out.println("Matriz originial");
        for(int i=0; i<matriz.length; i++){
            System.out.println();
            for(int j=0; j<matriz.length; j++){
                System.out.print(matriz[i][j] + " ");
            }
        }
        //matriz transposta
        System.out.println("\nMatriz transposta");
        for(int i=0; i<matriz.length; i++){
            System.out.println();
            for(int j=0; j<matriz.length; j++){
                System.out.print(matriz[j][i] + " ");
            }
        }
    }
}