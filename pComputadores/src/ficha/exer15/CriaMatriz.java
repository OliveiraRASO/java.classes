package ficha.exer15;

import java.util.*;

public class CriaMatriz {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int m;
        int n;
        //dimensão da matriz1
        System.out.println("Quantas linhas para a matriz: ");
        m = leia.nextInt();
        System.out.println("Quantas colunas para a matriz: ");
        n = leia.nextInt();
        int [][]matriz = new int[m][n];
        
        //leitura valores p/ matriz
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.printf("Números para matriz [%d%d]\n", i, j);
                matriz[i][j] = leia.nextInt();
            }
        }
        
        //printa matriz
        for(int i=0; i<matriz.length; i++){
            System.out.println();
            for(int j=0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j]);
            }
        }
    }
}