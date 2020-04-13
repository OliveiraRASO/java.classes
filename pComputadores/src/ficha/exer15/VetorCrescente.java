package ficha.exer15;

import java.util.*;

public class VetorCrescente {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int []v = new int[10];
        
        for(int i=0; i<v.length; i++){
            System.out.println("Digite números para vetor: ");
            v[i] = leia.nextInt();
        }
        Arrays.sort(v);
        for(int j : v){
            System.out.println(j);
        }
    }
}