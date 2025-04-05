package listadois;

public class ContaBancaria {
	private String numeroConta;
	private double saldo;
	
	public ContaBancaria(String numeroConta, double saldo) {
		this.numeroConta = numeroConta;
		this.saldo = 0.0;
	}
	
	public void depositar(double valor) {
		if(valor > 0) {
			saldo += valor;
		}
	}
	
	public boolean sacar(double valor) {
		if(valor > 0 && valor <= saldo) {
			saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
