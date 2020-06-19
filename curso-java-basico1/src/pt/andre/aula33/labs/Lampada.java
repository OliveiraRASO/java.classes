package pt.andre.aula33.labs;

public class Lampada {
	
	private String casquilho;
	private String cor;
	private int lumens;
	private String preco;
	private String[] tipos;
	private boolean tipoAbajur;
	private boolean ligada;
	
	public Lampada() {
		// TODO Auto-generated constructor stub
	}
	
	public Lampada(String casquilho, String cor, int lumens, String preco, String [] tipos, 
			boolean tipoAbajur, boolean ligada) {
		this.casquilho = casquilho;
		this.cor = cor;
		this.lumens = lumens;
		this.preco = preco;
		this.tipos = tipos;
		this.tipoAbajur = tipoAbajur;
		this.ligada = ligada;		
	}	
	
	public String getCasquilho() {
		return casquilho;
	}
	public void setCasquilho(String casquilho) {
		this.casquilho = casquilho;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public int getLumens() {
		return lumens;
	}
	public void setLumens(int lumens) {
		this.lumens = lumens;
	}
	
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}
	
	public String[] getTipos() {
		return tipos;
	}
	public void setTipos(String[] tipos) {
		this.tipos = tipos;
	}
	
	public boolean isTipoAbajur() {
		return tipoAbajur;
	}
	public void setTipoAbajur(boolean tipoAbajur) {
		this.tipoAbajur = tipoAbajur;
	}
	
	public boolean isLigada() {
		return ligada;
	}
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}	
	
	public void ligar() {
		setLigada(true); 
	}
	
	void desligar() {
		setLigada(false);
	}
	
	public void mostrarEstado() {
		if (isLigada()) {
			System.out.println("Lâmpada está ligada.");
		} else {
			System.out.println("Lâmpada está desligada.");
		}
	}
	
	public void mudarEstado() {
		if (isLigada() ) {
			desligar();
		} else {
			ligar();
		}
	}

}
