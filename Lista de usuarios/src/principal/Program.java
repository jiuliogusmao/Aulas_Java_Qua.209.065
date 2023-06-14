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
		
		System.out.println("Cadastrar novo usuário");
		Pessoa pessoa1 = new Pessoa("Zezinho", 20, 99999999);
		Pessoa pessoa2 = new Pessoa("Luizinho", 20, 88888888);
		Pessoa pessoa3 = new Pessoa("Uguinho", 20, 7777777);
		
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		System.out.println("Lista de usuários: " + pessoas);
		sc.close();
	}

}
