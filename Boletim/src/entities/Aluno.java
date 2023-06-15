package entities;

import java.util.Arrays;

public class Aluno {
	
	private String nome;
	private int serie;
	private double[] notas = new double[4];
	
	public Aluno(String nome, int serie, double[] notas) {
		super();
		this.nome = nome;
		this.serie = serie;
		this.notas = notas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	@Override
	public String toString() {
		return "Aluno [nome = " + nome + ", serie = " + serie + ", notas = " + Arrays.toString(notas) + "]";
	}
	
	
	
	
}
