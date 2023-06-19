package entities;

public class Funcionario {
	private String nome;
	private int idade;
	private String genero;
	private String departamento;
	protected double salario;

	public Funcionario() {
	}

	public Funcionario(String nome, int idade, String genero, String departamento, double salario) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
		this.departamento = departamento;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double bonificacao(double salario) {
		return salario += 150;
	}

	@Override
	public String toString() {
		return "Funcionario [\nNome = " + nome + ", \nIdade=" + idade + ", \nGenero = " + genero + ", \nDepartamento = "
				+ departamento + ", \nsalario = " + salario + "\nSalario + bonificacao = " + bonificacao(salario)+ "]";
	}

}
