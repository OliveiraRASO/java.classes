package pt.andre.aula43.labs;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria{
    
    private int diaRendimento;

    public ContaPoupanca() {
    }

    public ContaPoupanca(int diaRendimento, String nomeCliente, String numConta, double saldo) {
        super(nomeCliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }
    
    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    @Override
    public String toString() {
        String s = "";
        s += "\nDia rendimento: " + diaRendimento + ".";
        s += super.toString();
        return s;
    }
    
    public boolean calcularNovoSaldo (double taxaRendimento){
        
        Calendar hoje = Calendar.getInstance();
        
        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){
             this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
             return true;
    }
    return false;
    }
}