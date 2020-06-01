package projecto6Continuacao;

//@utor: RASO_@2019100463 //Eng_Informática
//Data: 29/05/2020

public class Cientifica extends Calculadora{

    //
    //construtor vazio
    public Cientifica() {
    }
    
    //
    //metodo potencia
    public double potencia(double a , double b){
        return Math.pow(a, b);
    }
    
    //
    //metodo calcula raiz
    public int raiz(int a){
        return (int) Math.sqrt(a);
    }
}