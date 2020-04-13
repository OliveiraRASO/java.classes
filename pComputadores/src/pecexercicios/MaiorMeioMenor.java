package pecexercicios;

import java.util.Scanner;
import java.util.Arrays;

public class MaiorMeioMenor {

    public static void main(String[] args) {
            
            float[] numeros = new float[4];
            
            for (int i=1; i<numeros.length; i++){
        
                Scanner leia = new Scanner(System.in);

                System.out.println("Insira o " + i + "º número");
                numeros[i] = leia.nextFloat();
            }
            
            // vetor ordenado
            Arrays.sort(numeros);
            System.out.printf("Números digitados em ordem crescente %s \n", Arrays.toString(numeros));
        }
    }