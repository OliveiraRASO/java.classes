package pcomputadores;

import java.util.*;

public class MetodoCalculoArea{
    
    // metodo para calcular area de fig. geométricas
    //passagem por valor
    public static double areaFiguras(double raio){
        double a = Math.PI * Math.pow(raio, 2.0);
        return a;
    }

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        double x;
        do{
        System.out.println("Insira um valor para o raio: ");
        x = leia.nextDouble();
        System.out.println("A área do círculo é: " + areaFiguras(x));
        }while(x>0);
                
    }

}
