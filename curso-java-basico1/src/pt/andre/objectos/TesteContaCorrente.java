package pt.andre.objectos;

public class TesteContaCorrente {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		conta.numero = "123456";
		conta.agencia = "1234";
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.saldo = -10;
		conta.valorEspecialUsado = 0;
		
		System.out.println("Saldo da conta "+ conta.numero + " = " + conta.saldo);

		boolean saqueEfetuado = conta.realizarSaque(10);
		
		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso.");
			System.out.println("Saldo atual da conta: " + conta.saldo);
		} else {
			System.out.println("saldo insuficiente!");
		}
		
		saqueEfetuado = conta.realizarSaque(500 );
		
		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso.");
			System.out.println("Saldo atual da conta: " + conta.saldo);
		} else {
			System.out.println("saldo insuficiente!");
		}
		
		System.out.println("Deposito de 50€");
		conta.depositar(500);
		System.out.println(conta.saldo);
		
		conta.consultarSaldo();
		
		if (conta.verificarChequeEspecial()) {
			System.out.println("Esta a usar cheque especial.");
		} else {
			System.out.println("Não esta a usar cheque especial.");
		}
	}

}
