package principal;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Produto produto = new Produto();


		 System.out.println("O deseja fazer? 1 - cadastrar produto | 2 - vender produto | 3 - sair");
		 int opcao = sc.nextInt();
		 sc.nextLine();

		while (opcao != 3) {

			switch (opcao) {
			case 1:
				System.out.print("Descrição do produto: ");
				produto.setDescricao(sc.nextLine());
				
				System.out.print("Adicionar produto: ");
				produto.adicionarProduto(sc.nextInt());
				
				System.out.print("Preço: ");
				produto.setPreco(sc.nextDouble());
				System.out.println("Quantidade em estoque: " + produto.getQuantidade());
				
				System.out.print("Valor total em estoque: " + produto.calcularValorTotalEstoque());
				System.out.println();
				
				System.out.println("O deseja fazer? 1 - cadastrar produto | 2 - vender produto | 3 - sair");
				 opcao = sc.nextInt();
				 sc.nextLine();
				break;
			case 2:
				System.out.print("Produto: " + produto.getDescricao());
				System.out.println();
				
				System.out.println("Quantidade: ");
				System.out.println();
				produto.setQuantidade(sc.nextInt());

				System.out.print("Preço: ");
				produto.setPreco(sc.nextDouble());
				
				System.out.println("Total da venda: " + produto.venderProduto());
				
				System.out.println("O deseja fazer? 1 - cadastrar produto | 2 - vender produto | 3 - sair");
				 opcao = sc.nextInt();
				 sc.nextLine();
				break;
			case 3:
				System.out.println("Encerrando o programa!");
				break;
			default:
				System.out.println("Opção inválida!");
			}
		}

		sc.close();

	}

}
