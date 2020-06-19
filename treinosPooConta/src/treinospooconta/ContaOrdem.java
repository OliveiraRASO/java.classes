package treinospooconta;

//@utor: RASO_@2019100463 //Eng_Informática
//Data: 

public class ContaOrdem extends ContaBancaria{
    
    //
    //variavel de classe
    private int limiteCredito = -100;

    //
    //construtor s/ parametros
    public ContaOrdem() {
    }

    //
    //construtor c/ parametros
    public ContaOrdem(String nomeTitular, double saldoConta, int limiteCredito) {
        super(nomeTitular, saldoConta);
        this.limiteCredito = limiteCredito;
    }

    //
    //get-sets
    public int getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(int limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
    
    //
    //metodo compara creditos
    public void comparaCreditos(ContaOrdem conta){
        if(this.limiteCredito > conta.limiteCredito){
            System.out.println("CONTA 1 tem maior credito --> " + getLimiteCredito()+ "€");
            System.out.println("CONTA 2 --> " + conta.getLimiteCredito()+ "€");
        }else{
            System.out.println("CONTA 2 tem maior credito --> " + conta.getLimiteCredito()+ "€");
            System.out.println("CONTA 1 --> " + getLimiteCredito()+ "€");
        }
    }
    
    //
    //metodo toString

    @Override
    public String toString() {
        return super.toString() + "Limite de crédito: " + limiteCredito + "€";
    }
}