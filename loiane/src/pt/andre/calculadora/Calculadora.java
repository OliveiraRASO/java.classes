package pt.andre.calculadora;

public class Calculadora {

    public int soma(int num1, int num2) {
		return num1 + num2;
	}

    public static double soma1(double num1, double num2) {
            return num1 + num2;
    }

    public static int soma2(int num1, int num2, int num3) {
            return num1 + num2 + num3;
    }

    public static int soma(int [] vetorInteiros) {
            int total = 0;

            for (int i=0; i<vetorInteiros.length; i++) {
                    total += vetorInteiros[i];
            }

            return total;
    }
}
