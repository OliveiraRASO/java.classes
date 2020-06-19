package pt.andre.aula33.labs;

public class ContaCorrente {

	private String numero;
	private String agencia;
	private boolean especial;
	private double valorEspecialUsado;
	private double limiteEspecial;
	private double saldo;

	public ContaCorrente() {
		// TODO Auto-generated constructor stub
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	public double getValorEspecialUsado() {
		return valorEspecialUsado;
	}

	public void setValorEspecialUsado(double valorEspecialUsado) {
		this.valorEspecialUsado = valorEspecialUsado;
	}

	public double getLimiteEspecial() {
		return limiteEspecial;
	}

	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

	public boolean realizarSaque(double quantiaASacar) {

		if (saldo >= quantiaASacar) {
			saldo -= quantiaASacar;
			return true;
		} else {// n tem saldo
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

	public void depositar(double valorDepositado) {
		saldo += valorDepositado;

	}

	public void consultarSaldo() {
		System.out.println("O saldo é: " + saldo);
	}

	public boolean verificarChequeEspecial() {
		return saldo < 0;
	}

}
