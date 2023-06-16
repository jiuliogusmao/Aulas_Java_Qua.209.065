package entities;

public class Conta {
	private String nomeTitular;
	private int numeroConta;
	private int agencia;
	private double saldo;
	
	
	public Conta() {
		// TODO Auto-generated constructor stub
	}

	public Conta(String nomeTitular, int numeroConta, int agencia) {
		super();
		this.nomeTitular = nomeTitular;
		this.numeroConta = numeroConta;
		this.agencia = agencia;
	}


	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

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

	public void depositar(double deposito) {
		saldo += deposito;
	}
	public void sacar(double saque) {
		saldo -= saque;
	}
	
	@Override
	public String toString() {
		return "Conta [nomeTitular=" + nomeTitular + ", numeroConta=" + numeroConta + ", agencia=" + agencia
				+ ", saldo=" + saldo + "]";
	}
	
	
	
}