package pt.andre.objectos;

public class TesteObjectos {

	public static void main(String[] args) {
		
		Carro van = new Carro();		
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		//van.exibirAutonomia();
		
		/*System.out.println(van.marca);
		System.out.println(van.capCombustivel);
		
		Carro fusca = new Carro();
		fusca.marca = "VW";
		fusca.modelo = "Fusca";
		fusca.numPassageiros = 4;
		fusca.capCombustivel = 30;
		fusca.consumoCombustivel = 0.15;*/
		
		//System.out.println(fusca.marca);
		//System.out.println(fusca.capCombustivel);
		
		/*Lampada quarto = new Lampada();
		quarto.casquilho = "E21";
		quarto.cor = "Branca";
		quarto.lumens = 2000;
		quarto.preco = "Barato";
		quarto.tipoAbajur = true;
		
		quarto.tipos = new String[5];
		quarto.tipos[0] = "Abajur";
		quarto.tipos[1] = "Vermelho";
		
		System.out.println(quarto.casquilho);
		System.out.println(quarto.lumens);
		
		Livro livro = new Livro();
		livro.corLivro = "Preto";
		livro.idadeLivro = 150;
		livro.numPaginas = 500;
		
		livro.tipos = new String [5];
		livro.tipos[0] = "Acção";
		livro.tipos[1] = "Drama";
		livro.tipos[2] = "Comédia";
		
		System.out.println(livro.corLivro);
		System.out.println(livro.idadeLivro);
		System.out.print(livro.tipos[1]);*/
		
		double autonomia = van.obterAutonomia();
		System.out.println(autonomia);
		
		//também pode ser usado
		System.out.println(van.obterAutonomia()); 
		
		double qtdCombustivel10 = van.calculoCombustivel(10);
		double qtdCombustivel15 = van.calculoCombustivel(15);
		
		System.out.println("Qtd combustivel 10: "+ qtdCombustivel10);
		System.out.println("Qtd combustivel 15: "+ qtdCombustivel15);
		
	}

}
