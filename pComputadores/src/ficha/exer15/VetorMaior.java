package ficha.exer15;

import java.util.*;

public class VetorMaior {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        
        int n = 3;
        int [] notas = new int[n];
        int maior = 0;
        int p = 3;
        int [] pares = new int [p];
        //ciclo percorre vetor
        for(int i=0; i<n; i++){
            System.out.println("Digite a " + i + "ª nota: ");
            notas[i] = leia.nextInt();
            
            //maior
            if(notas[i] > maior){
                maior = notas[i];
            }
            
            //par ou impar
            if(notas[i] % 2 == 0){
                pares[i] = notas[i];
            }
        }
        System.out.println("A maior nota é: " + maior);
        
        //printa pares
        for(int h : pares){
                System.out.printf("Os pares são: %d\n", h);
            }
    }
}