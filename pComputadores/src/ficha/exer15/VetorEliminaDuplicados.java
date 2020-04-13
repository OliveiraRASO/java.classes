package ficha.exer15;

import java.util.*;

public class VetorEliminaDuplicados {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        
        int x = 0;
        int []v = new int[5];
        int []v2 = new int[v.length];
        
        //lê numeros vetor
        for(int i=0; i<v.length; i++){
            System.out.println("Digite números: ");
            x = leia.nextInt();
            v[i] = x;
            
            for(int j=i-1; j>0; j--){
                if(v[i] != v[j]){
                v2[i] = v[i];
                }
            }
        }
        
        //printa vetor
        System.out.println();
        for(int val : v2){
            System.out.println(val);
        }
    }
}