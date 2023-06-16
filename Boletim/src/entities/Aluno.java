package entities;

import java.util.ArrayList;

public class Aluno {

	private String nome;
	private int serie;
	private ArrayList<Double> notas;

	public Aluno(String nome, int serie, ArrayList<Double> notas) {
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

	public ArrayList<Double> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Double> notas) {
		this.notas = notas;
	}

	public Double calcularMedia() {
		double soma = 0;
		for (double nota : notas) {
			soma += nota;
		}
		return soma / notas.size();
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", serie=" + serie + ", notas=" + notas + "]";
	}

}
