package pt.andre.aula43.labs;

public class ContaEspecial extends ContaPoupanca{
    
    private double limite;

    public ContaEspecial() {
    }

    @Override
    public String toString() {
        String s = "";
        s += super.toString();
        s += "Nome Cliente: " + limite;
        return s;
    }
    
    public boolean sacar(double valor){
        double saldoComLimite = this.getSaldo() + limite;
        
        if (saldoComLimite - valor >= 0){
            this.setSaldo(this.getSaldo() - valor);
            return true;
        }
        return false;
    }

    public ContaEspecial(double limite, int diaRendimento, String nomeCliente, String numConta, double saldo) {
        super(diaRendimento, nomeCliente, numConta, saldo);
        this.limite = limite;
    }
    
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}