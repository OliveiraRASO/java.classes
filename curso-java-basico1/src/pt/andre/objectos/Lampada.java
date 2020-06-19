package pt.andre.objectos;

public class Lampada {
	
	String casquilho;
	String cor;
	int lumens;
	String preco;
	String[] tipos;
	boolean tipoAbajur;
	
	boolean ligada;
	
	void ligar() {
		ligada = true;
	}
	
	void desligar() {
		ligada = false;
	}
	
	void mostrarEstado() {
		if (ligada) {
			System.out.println("L�mpada est� ligada.");
		} else {
			System.out.println("L�mpada est� desligada.");
		}
	}
	
	void mudarEstado() {
		if (ligada) {
			desligar();
		} else {
			ligar();
		}
	}

}
