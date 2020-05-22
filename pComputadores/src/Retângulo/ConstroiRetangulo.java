package Retangulo;

//@utor: RASO_2019100463 //Eng_Informática
//Data: 18/05/2020

public class Retangulos {

    public static void main(String[] args) {

        Retangulo rec1 = new Retangulo(2.0, 1.0, 4.0, 5.0);

        System.out.println("A Base do rectângulo é: " + rec1.calcBase() );
        System.out.println("A Altura do rectângulo é: " + rec1.calcAltura());
        System.out.println("O Perímetro rectângulo é: " + rec1.calcPerimetro() );
        System.out.println("A Área do rectângulo é: " + rec1.calcArea());

    }
}
