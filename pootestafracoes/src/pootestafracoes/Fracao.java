package pootestafracoes;

//@utor: RASO_@2019100463 //Eng_Informática
//Data: 

public class Fracao {

    private int numerador;
    private int denominador = 1;
    private static boolean formatoFraccao = true;
    
    //
    //construtor s/ parametros
    public Fracao() {
        numerador = 0;
        denominador = 1;
    }

    //
    //construtor c/ parametros
    public Fracao(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    //
    //get-sets
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int d) {
        if(d != 0)
            denominador = d;
        else
            System.out.println("valor invalido para o denominador");
        
    }

    public static void setFormatoFraccao() {
        formatoFraccao = true;
    }
    
    public static void resetFormatoFraccao() {
        formatoFraccao = false;
    }
    
    //
    //metodo mostra fracao
    public void mostraFracao(){
        if( formatoFraccao == true )
            System.out.println(numerador + "/" + denominador);
        else
            System.out.println((double)numerador/denominador);
    }
    
    //
    //metodo soma
    public Fracao soma(Fracao fracao){   
        Fracao frac = new Fracao();
        if(denominador == fracao.denominador){
            frac.denominador = denominador;
            frac.numerador = (numerador + fracao.numerador);
            return frac;
        }
        else{
            System.out.println("Os denominadores são diferentes");
            return null;
        } 
    }
    
    //
    //metodo sobre escrito
    @Override
    public String toString() {
        return super.toString() + numerador / denominador;
    }
}