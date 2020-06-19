package exercicio7;

//@utor: RASO_@2019100463 //Eng_Informática
//Data: 22/05/2020

public class CartaoCliente {
    
    private int numCartao;
    private String titular;
    private double numPontos;
    
    //
    //contrutor sem parametros
    public CartaoCliente() {
        numCartao = 0;
        titular = "";
        numPontos = 0.0;
    }
    
    //
    //construtor com parametros
    public CartaoCliente(int numCartao, String titular) {
        this.numCartao = numCartao;
        this.titular = titular;
    }
    
    //
    //GET - SETS
    public int getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(int numCartao) {
        this.numCartao = numCartao;
    }

    public String getNomeCartao() {
        return titular;
    }

    public void setNomeCartao(String nomeCartao) {
        this.titular = nomeCartao;
    }

    public double getNumPontos() {
        return numPontos;
    }

    public void setNumPontos(int numPontos) {
        this.numPontos = numPontos;
    }
    
    //
    //metodo p/ creditar pontos
    public void creditaPontos( double credita){
        numPontos += credita;
    }
    
    //
    //metodo p/ debitar pontos
    public void debitaPontos( double debita){
        numPontos -= debita;
    }
    
    //
    //metodo mostra pontos
    public double mostraPontos(){
        return numPontos;
    }
    
    //
    //metodo transfere pontos
    public void transferePontos( CartaoCliente cliente){
        numPontos = cliente.numPontos;
        cliente.numPontos = 0.0;
    }
    
    //
    //metodo toString
    @Override
    public String toString() {
        return "Núm.: " + numCartao + ", Titular" + titular + ", Pontos:" + numPontos;
    }
}