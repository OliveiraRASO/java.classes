package ficha.exer15;

import java.util.*;

public class MatrizSomaLinPar {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Random random = new Random();
        
        int [][]matriz =  new int [15][15];
        int soma_linha = 0;
        
        //leitura valores p/ matriz aleatória
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.printf("Números para matriz [%d%d]\n", i, j);
                matriz[i][j] = random.nextInt(10);
            }
        }
        
        //soma linhas matriz
        for(int i=0; i<matriz.length; i=i+2){
            for(int j=0; j<matriz.length; j++){
                soma_linha += matriz[i][j];
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
        System.out.println("\nSoma de linhas pares é: " + soma_linha);
    }
}