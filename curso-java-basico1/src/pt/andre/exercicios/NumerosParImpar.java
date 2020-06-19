package pt.andre.exercicios;

public class NumerosParImpar {

	public static void main(String[] args) {
		int cont = 0;

		for ( int i = 0; i <= 50; i++) {
			if (i % 2 != 0) {
				cont++;
				System.out.println("Os números ímpares são: " + i);				
			}
			
		}System.out.print("\n");
		System.out.print("O total de impares são: " + cont);
	}

}