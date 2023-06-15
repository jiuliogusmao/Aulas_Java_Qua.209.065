package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		Pessoa pessoa;
		List<Pessoa> pessoas = new ArrayList<>();
		char opcao;
		do {
			//pessoa = new Pessoa();
			System.out.println("Cadastrar novo usu�rio");
			
			System.out.println("Digite seu nome: ");
			//pessoa.setNome(sc.nextLine());
			String nome = sc.nextLine();
			
			System.out.println("Digite sua idade: ");
			//pessoa.setIdade(sc.nextInt());
			int idade = sc.nextInt();
			
			sc.nextLine(); //Limpa o buffer do Scanner
			
			System.out.println("Digite seu telefone: ");
			//pessoa.setTelefone(sc.nextLine());
			String telefone = sc.nextLine();
			
			pessoa = new Pessoa(nome, idade, telefone);
			pessoas.add(pessoa);
			
			System.out.print("Deseja cadastar mais uma pessoa? ");
			System.out.println("s/n");
			opcao = sc.next().charAt(0); //Pega um caracter na posi��o zero
			sc.nextLine(); //Limpa o buffer do Scanner
		} while(Character.toLowerCase(opcao) == 's');
		
		System.out.println("Lista de usu�rios: ");
		for (Pessoa p : pessoas) {
			System.out.println(
					p + "\n");
		}
		
		sc.close();
	}

}
