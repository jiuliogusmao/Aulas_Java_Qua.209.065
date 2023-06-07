package entities;

public class Conta {
	
	private int numeroConta;
	private int agencia;
	private double saldo;
	private String titular;
	
	
	
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public void depositar(double valorDepositado) {
		saldo += valorDepositado;
	}
	public void sacar(double valorSacado) {
		saldo -= valorSacado;
	}
	@Override
	public String toString() {
		return "Conta [\nConta = " + numeroConta + ", \nAgencia = " + agencia + ", \nSaldo = " + saldo + ", \nTitular = "
				+ titular + "]";
	}
	
	
}
