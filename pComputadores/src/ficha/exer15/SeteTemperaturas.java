package ficha.exer15;

import java.util.*;

public class SeteTemperaturas {
    
    //metodo para calcular media
    public static int calculaMedia(int soma_formal, int cont_formal){
        int media = (soma_formal / cont_formal);
        return media;
    }

    public static void main(String[] args) {
        
        int []temperaturas = new int[4];
        int x = 0;
        int soma = 0;
        int cont = 0;
        
        Scanner leia = new Scanner(System.in);
        for(int i=1; i<temperaturas.length; i++){
            System.out.printf("Insira a %s ", i + " temperatura.");
            x = leia.nextInt();
            temperaturas[i] = x;
            cont += 1;
            soma += x;
        }
        //calcula media
        int media2 = calculaMedia(soma, cont);
        System.out.printf("A média é: %d \n", media2);
        
        // valores acima da média
        int [] numeros = new int[4];
        for(int h=0; h<numeros.length; h++){
            for(int v : temperaturas){
                if(v > media2){
                    numeros[h] = v;
                }
            }
        }
        for(int a : numeros){
            System.out.println(a);
        }
    }
}