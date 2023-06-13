package entities;

public class Produto {

	private static String descricao;
	private static int quantidade;
	private static double preco;
	
	public Produto () {
		
	}
	public Produto(String descricao, int quantidade, double preco) {
		super();
		Produto.descricao = descricao;
		Produto.quantidade = quantidade;
		Produto.preco = preco;
	}

	public static String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		Produto.descricao = descricao;
	}

	public static int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		Produto.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		Produto.preco = preco;
	}
	
	public void adicionarProduto(int quantidade) {
		Produto.quantidade += quantidade;
	}
	
	public static int removerProduto() {
		return quantidade -= quantidade;
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
