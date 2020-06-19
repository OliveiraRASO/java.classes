package pt.andre.aula43.labs;

public class ContaBancaria {
    
    private String nomeCliente;
    private String numConta;
    private double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(String nomeCliente, String numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        String s = "";
        s += "Nome Cliente: " + nomeCliente + ".";
        s += "\nNumero Conta: " + numConta + ".";
        s += "\nSaldo: " + saldo + ".";
        return s;
    }
    
    public boolean sacar(double valor){
        if ((saldo - valor) >= 0 ){
            saldo -= valor;
            return true;
        }
        
        return false;
    }
    
    public void depositar(double valor){
        saldo += valor;
    }
}