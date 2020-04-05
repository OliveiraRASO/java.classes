package pcomputadores;

import java.util.Scanner;

public class Piramide {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        int nr_linhas;
        int[] aux = new int[1];
        
        System.out.println("Numero de linhas");
        nr_linhas = leia.nextInt();
        
        for(int i=1; i<=nr_linhas; i++){
        int[] vetor = new int[i];
        
        for(int j=nr_linhas; j>i; j--){
            System.out.print(" ");	
        }
        System.out.print(" ");
        for(int k = 0; k < i; k++){
            if(k == 0 || k == (i -1)){
                    vetor[k] = 1;
            }else{
                    vetor[k] = aux[k] + aux[k -1];
            }
            System.out.print( vetor[k] + " ");
        }
        System.out.print(" ");
        aux = vetor;
        System.out.println();
        }
    }
}
