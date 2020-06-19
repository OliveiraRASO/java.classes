package pt.andre.aula33.labs;

public class TesteContaCorrente {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		conta.setNumero("123456");
		conta.setAgencia("1234");
		conta.setEspecial(true);
		conta.setLimiteEspecial(500);
		conta.setSaldo(10);
		conta.setValorEspecialUsado(-10);
		
		System.out.println("Saldo da conta "+ conta.getNumero() + " = " + conta.getSaldo());

		boolean saqueEfetuado = conta.realizarSaque(10);
		
		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso.");
			System.out.println("Saldo atual da conta: " + conta.getSaldo());
		} else {
			System.out.println("saldo insuficiente!");
		}
		
		saqueEfetuado = conta.realizarSaque(500 );
		
		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso.");
			System.out.println("Saldo atual da conta: " + conta.getSaldo());
		} else {
			System.out.println("saldo insuficiente!");
		}
		
		System.out.println("Deposito de 50€");
		conta.depositar(500);
		System.out.println(conta.getSaldo());
		
		conta.consultarSaldo();
		
		if (conta.verificarChequeEspecial()) {
			System.out.println("Esta a usar cheque especial.");
		} else {
			System.out.println("Não esta a usar cheque especial.");
		}

	}

}
