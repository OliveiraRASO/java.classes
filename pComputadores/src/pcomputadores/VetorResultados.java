package pcomputadores;

import java.util.*;

public class VetorResultados {

    public static void main(String[] args) {
        
        int [] numeros = new int [11];
        Scanner leia = new Scanner(System.in);
        
        for(int i=1; i<numeros.length; i++){
            System.out.println("Insira o " + i + "º número: ");
            int num = leia.nextInt();
            numeros[i] = num;
        }
        
        int ocorrencias_num = 0;
        int cont_ocorrencias = 0;
        int maior = 0;
        int media = 0;
        int soma = 0;
        int cont = 0;
        for(int j=1; j<numeros.length; j++){
            soma += numeros[j];
            cont += 1;
            media = (soma / cont);
            
            if(numeros[j] > maior){
                maior = numeros[j];
            }
            
            if(numeros[j] == numeros[j]){
                cont_ocorrencias += 1;
                ocorrencias_num = numeros[j];
            }
        }
        
        System.out.println("A soma dos números digitados é: " + soma);
        System.out.println("A média dos números digitados é: " + media);
        System.out.println("O maior dos números digitados é: " + maior);
        System.out.println("O número: " + ocorrencias_num + " foi digitado " + cont_ocorrencias + " vezes.");

    }
}