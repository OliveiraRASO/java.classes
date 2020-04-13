package ficha.exer15;

import java.util.*;

public class SomaVetores {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        
        int []v1 = new int[4];
        int []v2 = new int[4];
        
        //leitura 1º vetor
        for(int i=0; i<v1.length; i++){
            System.out.println("Digite o 1º' vetor: ");
            v1[i] = leia.nextInt();
        }
        
        //leitura 2º vetor
        for(int j=0; j<v2.length; j++){
            System.out.println("Digite o '2º' vetor: ");
            v2[j] = leia.nextInt();
        }
        
        //soma vetor
        int soma = 0;
        int []vs = new int[4];
        for(int k=0; k<v1.length; k++){
            soma += v1[k] + v2[k];
            vs[k] = soma;
        }
        
        //for each de vetor com a soma
        for(int v : vs){
            System.out.println("A soma é: " + v);
        }
    }
}