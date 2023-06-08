package entities;

public class Produto {

	private String descricao;
	private int quantidade;
	private double preco;
	private double valorTotalEstoque;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getValorTotalEstoque() {
		valorTotalEstoque = quantidade * preco;
		return valorTotalEstoque;
	}

	public void setValorTotalEstoque(int quantidade, double preco) {
		this.valorTotalEstoque = quantidade * preco;
	}

	public void adicionarProduto(int quantidade, double preco) {
		valorTotalEstoque = valorTotalEstoque + (quantidade * preco);
	}

	public void venderProduto(int quantidade, double preco) {
		valorTotalEstoque = valorTotalEstoque - (quantidade * preco);
	}

	@Override
	public String toString() {
		return "Produto [descricao = " + descricao + ", quantidade = " + quantidade + ", preco = " + preco
				+ ", totalEstoque = " + valorTotalEstoque + "]";

	}

}
