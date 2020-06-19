package treinospooconta;

//@utor: RASO_@2019100463 //Eng_Informática
//Data: 

public class ContaPrazo extends ContaBancaria{
    
    //
    //variaveis de classe
    private double taxaJuro = 0.1;
    private int prazoConta = 365;

    //
    //construtor s/ parametros
    public ContaPrazo() {
    }

    //
    //construtor c/ parametros
    public ContaPrazo(String nomeTitular, double saldoConta, int prazoConta) {
        super(nomeTitular, saldoConta);
        this.prazoConta = prazoConta;
    }

    //
    //get-sets
    public double getTaxaJuro() {
        return taxaJuro;
    }

    public void setTaxaJuro(double taxaJuro) {
        this.taxaJuro = taxaJuro;
    }

    public int getPrazoConta() {
        return prazoConta;
    }

    public void setPrazoConta(int prazoConta) {
        this.prazoConta = prazoConta;
    }
    
    //
    //metodo saldo final
    public double saldoFinal(){
        return (super.getSaldoConta() + this.getSaldoConta()) * taxaJuro;
    }

    //
    //metodo toString
    @Override
    public String toString() {
        return super.toString() + "Taxa de juro: " + taxaJuro + "%" + "\nPrazo de conta: " + prazoConta + "dias";
    }

}