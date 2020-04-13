package pecexercicios;

import java.util.*;

public class PrintaRetangulo {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Insira um valor para a comprimento do retangulo: ");
        double comprimento = leia.nextDouble();
        
        System.out.println("Insira um valor para a altura do retangulo: ");
        double altura = leia.nextDouble();
        
        // cabeçalho retangulo
        for(int i=0; i<=comprimento; i++){
            System.out.print(" ");
        }
        for(double j=comprimento; j>0; j--){
                System.out.print("X");
            }
        System.out.println();
        
        // meio do retangulo
        for(double z=0; z<comprimento; z++){
            System.out.println(" ");
        
            for(double k=0; k<=altura; k++){
            System.out.print(" ");
            }
        
            for(double l=altura; l>0; l--){
            System.out.print("X");
            for(double x=l; x<=comprimento; x++){
                System.out.print(" ");
            }
            }
        }
        
        // rodapé retangulo
        System.out.println();
        for(int m=0; m<=comprimento; m++){
            System.out.print(" ");
        }
        for(double n=comprimento; n>0; n--){
                System.out.print("X");
            }
    }

}
