package entities;

public class Livro {
	
	/*
	 * Ordem sugerida a seguir na classe:
	 * 1� atributos da classe
	 * 2� construtores
	 * 3� m�todos getters e setters
	 * 4� demais m�todos
	 */
	
	private String nome;
	private String edicao;
	private double valor;
	
	public Livro() {}
	public Livro(String nome, String edicao, double valor) {
		super();
		this.nome = nome;
		this.edicao = edicao;
		this.valor = valor;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		if (valor > 100) {
			this.valor += (valor * 0.30);
		} else {
			this.valor = valor;			
		}
	}
	@Override
	public String toString() {
		return "Livro [\nNome = " + nome + ", \nEdicao = " + edicao + ", \nValor = " + valor + "]";
	}
	
	
	
	
}
