package entities;

public class Produto {

	private String descricao;
	private int quantidade;
	private double preco;

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
	
	public void adicionarProduto(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removerProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public double calcularValorTotalEstoque() {
		return quantidade * preco;
	}
	
	public double venderProduto() {
		double Venda = quantidade * preco;
		return Venda;
	}

	@Override
	public String toString() {
		return "Produto [\nDescricao=" + descricao + ", \nQuantidade=" + quantidade + ", \nPreco=" + preco
				+ ", \nValor total em estoque=" + String.format("%.2f", calcularValorTotalEstoque()) + "]";
	}

	

}
