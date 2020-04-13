package ficha.exer15;

import java.util.*;

public class VetorMenorValor {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        
        int []v = new int[4];
        int menor = 0;
        int maior = 0;
        
        for(int i=0; i<v.length; i++){
            System.out.println("Digite números para vetor: ");
            v[i] = leia.nextInt();
            
            if(i == 1){
                maior = v[i];
                menor = v[i];
            }else{
                if(v[i] < menor){
                    menor = v[i];
                }
                if(v[i] > maior){
                    maior = v[i];
                }
            }
        }
        System.out.printf("Maior é: %d\n", maior);
        System.out.printf("Menor é: %d\n", menor);
    }
}