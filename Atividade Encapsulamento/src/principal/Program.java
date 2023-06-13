package principal;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		String descricao = "";
		int quantidade = 0;
		double preco = 0;
		Produto produto = new Produto(descricao, quantidade, preco);
		

		 System.out.println("O deseja fazer? 1 - cadastrar produto | 2 - vender produto | 3 - sair");
		 int opcao = sc.nextInt();
		 sc.nextLine();

		while (opcao != 3) {

			switch (opcao) {
			case 1:
				System.out.println("Descrição do produto: ");
				produto.setDescricao(sc.nextLine());
								
				System.out.print("Quantidade: ");
				produto.setQuantidade(sc.nextInt());
				produto.adicionarProduto(quantidade);
				
				System.out.print("Preço: ");
				produto.setPreco(sc.nextDouble());
				
				System.out.println("Novo produto cadastrado com sucesso! ");
				System.out.println("Quantidade em estoque: " + Produto.getQuantidade());
				
				System.out.println();
				
				System.out.println("O deseja fazer? 1 - cadastrar produto | 2 - vender produto | 3 - sair");
				 opcao = sc.nextInt();
				 sc.nextLine();
				break;
			case 2:
				System.out.println("Produto: " + Produto.getDescricao());
				System.out.println();
				
				System.out.println("Quantidade: ");
				produto.setQuantidade(sc.nextInt());

				System.out.print("Preço: ");
				produto.setPreco(sc.nextDouble());
				
				System.out.println("Total da venda: " + produto.venderProduto());
				System.out.println("Quantidade atual em estoque: " + Produto.removerProduto());
				
				System.out.println("O deseja fazer? 1 - cadastrar produto | 2 - vender produto | 3 - sair");
				 opcao = sc.nextInt();
				 sc.nextLine();
				break;
			case 3:
				break;
			default:
				System.out.println("Opção inválida!");
			}
			System.out.println("Encerrando o programa!");
		}

		sc.close();

	}

}
