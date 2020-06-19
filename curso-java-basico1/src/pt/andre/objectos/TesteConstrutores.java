package pt.andre.objectos;

public class TesteConstrutores {

	public static void main(String[] args) {
		
		Construtores van = new Construtores();		
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		{
			
		}
		System.out.println(van.numPassageiros);
		
		Construtores van2 = new Construtores("Fiat", "ducato");
		
		System.out.println(van2.marca);
		System.out.println(van2.modelo);

	}

}
