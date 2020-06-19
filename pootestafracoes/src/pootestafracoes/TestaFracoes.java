package pootestafracoes;

public class TestaFracoes {

    public static void main(String[] args) {
        
        // criacao de objectos usando os construtores com e sem parametros
        Fracao f1 = new Fracao();
        Fracao f2 = new Fracao( 3, 2 );
        
        System.out.println( "Fracções:");
        f1.mostraFracao();   // escreve 0/1
        f2.mostraFracao();   // escreve 3/2
        System.out.println();
         
        // altera para visualizacaoo em formato de numero racional
        // coloca variavel de classe em false
        Fracao.resetFormatoFraccao();
        
        System.out.println( "Números racionais:");
        f1.mostraFracao();   // escreve 0.0
        f2.mostraFracao();   // escreve 1.5
        System.out.println();
        
        // altera para visualizacaoo em formato de fracao
        // coloca variavel de classe em true
        Fracao.setFormatoFraccao();
        
        // utilização dos metodos de acesso
        f1.setNumerador(5);    // altera o numerador para 5
        
        f1.setDenominador(0);  // escreve "valor invalido para o denominador"
        
        f1.setDenominador(4);  // altera o denominador para 4
        
        System.out.print( "Fracção     = "); f1.mostraFracao();       // escreve 5/4
        System.out.println( "numerador   = " + f1.getNumerador() );   // escreve 5
        System.out.println( "denominador = " + f1.getDenominador() ); // escreve 4
        System.out.println();
        
        // operações com fracções
        Fracao f3 = new Fracao( 1, 4 );
        Fracao f4 = new Fracao( 3, 4 );
        Fracao f5;
        
        f5 = f3.soma(f4);       // f5 fica com a soma de 1/4 + 3/4
        System.out.print( "soma    = " ); 
        f5.mostraFracao();         // escreve 4/4
        
        f5 = f2.soma(f4);       // escreve Os denominadores são diferentes!
    }
}
