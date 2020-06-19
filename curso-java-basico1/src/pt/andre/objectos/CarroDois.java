package pt.andre.objectos;

public class CarroDois {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	public CarroDois(String marca, String modelo, int numPassageiros, double capCombustivel,
			double consumoCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	public CarroDois() {
		
	}

	public CarroDois(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando com 3 parametros");
	}

	public CarroDois(String marca, String modelo) {
		this(marca, modelo, 10);
		System.out.println("Chamando com 2 parametros");		
	}

	void exibirAutonomia() {
		System.out.println("Autonomia = " + this.capCombustivel * this.consumoCombustivel);
	}
	 
	double obterAutonomia() {
		System.out.println("Metodo obterAutonomia foi chamado.");
		
		return capCombustivel * consumoCombustivel;
		
		}
	
	double calculoCombustivel(double km) {
		double qtdCombustivel = km/consumoCombustivel;
		
		return qtdCombustivel;
	}

}
