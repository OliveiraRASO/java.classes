package pt.andre.objectos;

public class Construtores {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	Construtores(){
		System.out.println("Classe 'construtores' foi instanciada");
	}
	
	Construtores(String marca_, String modelo_){
		marca = marca_;
		modelo = modelo_;
	}

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
