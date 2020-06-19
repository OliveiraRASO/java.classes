package treinospooconta;

//@utor: RASO_@2019100463 //Eng_Informática
//Data: 

public class ContaBancaria {
    
    //
    //variavel de instancia (contador)
    private static int geraNumero;
    
    //
    //variaveis de classe
    private int numeroConta;
    private String nomeTitular;
    private double saldoConta;

    //
    //construtor s/ parametros
    public ContaBancaria() {
    }

    //
    //construtor c/ parametros
    public ContaBancaria(String nomeTitular, double saldoConta) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldoConta = saldoConta;
        this.setNumeroConta(++geraNumero);
    }

    //
    //get-sets
    

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }
    
    
    //
    //metodo p/ depositar
    public void deposita(double deposita){
        saldoConta += deposita;
    }
    
    //
    //metodo p/ levantar
    public void levanta(double levanta){
        if(levanta > saldoConta){
            System.out.println("Não é possível efetuar levantamento.");
        }else{
            saldoConta -= levanta;
        }
    }
    
    //
    //metodo toString

    @Override
    public String toString() {
        return "Nome de titular: " + nomeTitular + "\nSaldo inicial: " + saldoConta + "€" +  "\nNúmero de conta: " + numeroConta + "\n";
    }
}