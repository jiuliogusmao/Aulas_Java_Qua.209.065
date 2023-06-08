package principal;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Produto produto = new Produto();
		
		System.out.println("O deseja fazer? 1 - cadastrar produto | 2 - vender produto");
		int opcao = sc.nextInt();
		switch(opcao) {
		case 1:
			System.out.println("Descrição do produto: ");
			produto.setDescricao(sc.nextLine());
			System.out.print("Quantidade: ");
			produto.setQuantidade(sc.nextInt());
			System.out.print("Preço: ");
			produto.setPreco(sc.nextDouble());
			System.out.print("Valor total em estoque: " + produto.getValorTotalEstoque());
			break;
		case 2:
			System.out.println("Produto: " + produto.getDescricao());
			System.out.println("Digite a quantidade e o preço do produto: ");
			produto.venderProduto(sc.nextInt(), sc.nextDouble());
			break;
		}
		
		sc.close();

	}

}
