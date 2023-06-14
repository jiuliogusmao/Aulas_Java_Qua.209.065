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
			pessoa = new Pessoa();
			System.out.println("Cadastrar novo usuário");
			System.out.println("Digite seu nome: ");
			pessoa.setNome(sc.nextLine());
			System.out.println("Digite sua idade: ");
			pessoa.setIdade(sc.nextInt());
			System.out.println("Digite seu telefone: ");
			pessoa.setTelefone(sc.nextLine());
			
			pessoas.add(pessoa);
			
			System.out.print("Deseja cadastar mais uma pessoa?");
			System.out.println("s/n");
			opcao = sc.next().charAt(0); //Pega um caracter na posição zero
			sc.nextLine(); //Limpa o buffer do Scanner
		} while(Character.toLowerCase(opcao) == 's');
		
		for (Pessoa p : pessoas) {
			System.out.println("Lista de usuários: " + p);
		}
		
		sc.close();
	}

}
