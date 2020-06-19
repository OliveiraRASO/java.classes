package pt.andre.aula43.labs;

public class Teste {

    public static void main(String[] args) {
        
        System.out.println("*** Teste Conta Bancária ***");
        
        ContaBancaria contaSimples = new ContaBancaria();        
        contaSimples.setNomeCliente("André");
        contaSimples.setNumConta("12345");
        
        contaSimples.depositar(100);
        
        realizarSaque(contaSimples, 50);
        
        realizarSaque(contaSimples, 70);
        
        System.out.println(contaSimples);
        
        
        System.out.println("*** Teste Conta Poupança ***");
        
        ContaPoupanca contaPoupanca = new ContaPoupanca();        
        contaPoupanca.setNomeCliente("Aninha");
        contaPoupanca.setNumConta("67890");
        contaPoupanca.setDiaRendimento(2);
        
        contaPoupanca.depositar(100);
        
        realizarSaque(contaPoupanca, 50);
        
        realizarSaque(contaPoupanca, 70);
        
        if (contaPoupanca.calcularNovoSaldo(0.5)){
            System.out.println("Novo rendimento aplicado, novo saldo: " + contaPoupanca.getSaldo());
        } else {
            System.out.println("Hoje não é dia de rendimento.");
        }
        
        System.out.println(contaPoupanca);
        
        
        System.out.println("*** Teste Conta Especial ***");
        
        ContaEspecial contaEspecial = new ContaEspecial();        
        contaEspecial.setNomeCliente("Oliveira");
        contaEspecial.setNumConta("55555");
        
        contaEspecial.depositar(100);
        
        realizarSaque(contaEspecial, 50);
        
        realizarSaque(contaEspecial, 70);
        
        System.out.println(contaEspecial);
    }    
    private static void realizarSaque(ContaBancaria conta, double valor){
        if (conta.sacar(valor)){
            System.out.println("Saque efetuado com sucesso. Saldo atual: " + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente. Saldo atual: " + conta.getSaldo());
        }
    }

}