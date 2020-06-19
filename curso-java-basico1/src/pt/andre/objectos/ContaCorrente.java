package pt.andre.objectos;

public class ContaCorrente {
	
	String numero;
	String agencia;
	boolean especial;
	double valorEspecialUsado;
	double limiteEspecial;
	double saldo;
	
	boolean realizarSaque(double quantiaASacar) {
		
		if (saldo >= quantiaASacar) {
			saldo -= quantiaASacar;
			return true;
		} else {//n tem saldo
			if (especial) {	
				// verificar se o limite especial tem saldo
				double limite = limiteEspecial + saldo;
				if (limite >= quantiaASacar) {
					saldo -= quantiaASacar;
					return true;
				} else {
					return false;
				}				
			} else {
				return false;
			}
		}
	}
	
	void depositar(double valorDepositado) {
		saldo += valorDepositado;
		
	}
	
	void consultarSaldo() {
		System.out.println("O saldo é: " + saldo);
	}
	
	boolean verificarChequeEspecial() {
		return saldo < 0;
	}
		
}
