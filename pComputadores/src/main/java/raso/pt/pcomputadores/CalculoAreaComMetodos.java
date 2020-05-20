package raso.pt.pcomputadores;

import java.util.Scanner;

public class CalculoAreaComMetodos {
    
//    public static double areaCirculo(double raio){
//        return Math.PI * Math.pow(raio, 2.0);
//    }
//
//    public static double areaRetangulo(double altura, double largura){
//        return altura * largura;
//    }
//    
//    public static double areaTriangulo(double base, double altura){
//        return (base * altura) / 2;
//    }
    
    public static void areaCirculo(){
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Insira o raio do círculo: ");
        double r_circulo = leia.nextDouble();
        
        double a_circulo = 3.14 * (r_circulo*r_circulo);
        System.out.println("A área do círculo é: " + a_circulo);
    }
    
    public static void areaRetangulo(){
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Insira um valor para a base: ");
        double b_retangulo = leia.nextDouble();
        System.out.println("Insira um valor para a altura: ");
        double a_retangulo =leia.nextDouble();
        
        double area_retangulo = b_retangulo * a_retangulo;
        System.out.println("A área do retângulo é: " + area_retangulo);
    }
    
    public static void areaTriangulo(){
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Insira um valor para a base: ");
        double b_triangulo = leia.nextDouble();
        System.out.println("Insira um valor para a altura: ");
        double a_triangulo = leia.nextDouble();

        double area_triangulo = (b_triangulo * a_triangulo) / 2.0;
        System.out.println("A área do triângulo é: " + area_triangulo);
    }

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        int x = 0;
        // ciclo do while
        do {
            System.out.println("1 - Círculo\n"
                    + "2 - Retângulo\n"
                    + "3 - Triângulo\n"
                    + "4 - SAIR");
            System.out.println("Escolha qual área quer calcular: ");
             x = leia.nextInt();
            
            switch(x){
                case 1:
                    //área círculo
                    areaCirculo();
                    break;
                case 2:
                    // área retângulo
                    areaRetangulo();
                    break;
                case 3:
                    // área triângulo
                    areaTriangulo();
                    break;
            }
            }while (x != 4);
        }
}
