package raso.pt.pcomputadores;

import java.util.Scanner;

public class CalcularArea {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Insira um número: ");
        double raio = leia.nextInt();
        
        // calculo volume esfera
        double volume = (4.0/3.0 * 3.14159 * (raio*raio*raio));
        
        // calculo area e perimetro circulo
        double perímetro = 2*3.14159 * raio;
        double area = 3.14159 * (raio*raio);
        
        System.out.println("O volume da esfera é: " + volume);
        System.out.println("O perímetro do círculo é: " + perímetro);
        System.out.println("E a sua área é: " + area);
    }

}
