package pcomputadores;

import java.util.*;

public class MatrizExerc3 {
    
    // método para somar as colunas de uma matriz
    // guardando o somatório num vetor
    public static void somaDasColunas( int []v, int [][]m ){
        if( v.length == m[0].length ){
            for( int i=0; i<m[0].length; i++ ){
                v[i] = 0;
                for( int j=0; j<m.length; j++ )
                    v[i] += m[j][i]; 
            }
        }
    }
    
    // programa principal
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        int m; //número linhas
        int n; //número colunas
        
        System.out.println("Digite o número de linhas da matriz: ");
        m = leia.nextInt();
        System.out.println("Digite o número de colunas da matriz: ");
        n = leia.nextInt();
        
        int [][] matriz = new int[m][n];
        
        // insere dados na matriz
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.println("Digite valores para a matriz: " + i + j);
                matriz[i][j] = leia.nextInt();
            }
        }
        System.out.println();
        
        // printa matriz
        System.out.println("Escreve matriz.");
        for (int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        
        // procura maior e menor valor
        int maior = matriz[0][0];
        int menor = matriz[0][0];
        for( int i=0; i<m; i++ ){
            for( int j=0; j<n; j++ ){
                if( matriz[i][j] > maior )
                    maior = matriz[i][j];
                if( matriz[i][j] < menor )
                    menor = matriz[i][j];
            }
        }
        System.out.println("O maior é: " + maior + " e o menor é: " + menor);
        
        // soma colunas
        int []soma = new int[n];
        somaDasColunas(soma, matriz);
        
        for(int i=0; i<soma.length; i++){
            System.out.println("A soma das colunas é: " + soma[i]);
        }
    }
}