package pt.andre.aula32;

public class TesteCalculadora {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		calc.soma(1, 2);
		
		System.out.println(calc.soma(1, 2));
		System.out.println(calc.some(1.0, 2.0));

	}

}
