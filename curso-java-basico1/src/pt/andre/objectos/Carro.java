package pt.andre.objectos;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		System.out.println("Autonomia = " + capCombustivel * consumoCombustivel);
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
