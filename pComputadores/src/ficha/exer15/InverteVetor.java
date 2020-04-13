package ficha.exer15;

import java.util.*;

public class InverteVetor {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int []v = new int [10];
        int []v2 = new int[v.length];
        
        for(int i=0; i<v.length; i++){
            System.out.println("Digite números para o vetor: ");
            v[i] = leia.nextInt();
            v2[i] = v[i];
        }
        
        //inverte vetor
        System.out.println("Vetor invertido é: ");
        for(int j=v2.length - 1; j>=0; j--){
            System.out.print(v2[j] + " ");
        }
    }
}