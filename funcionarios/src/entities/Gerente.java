package entities;

public class Gerente extends Funcionario{
	
	public Gerente () {}

	public Gerente(String nome, int idade, String genero, String departamento, double salario) {
		super(nome, idade, genero, departamento, salario);
		// TODO Auto-generated constructor stub
	}
	
	@Override
public double bonificacao(double salario) {
	 return salario += 500;
	}
}
