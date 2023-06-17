package principal;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.Gerente;
import entities.Secretaria;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		sc.useLocale(Locale.ENGLISH);
		
		System.out.println("Para qual categoria de funcionario deseja cadastrar: 1 - Gerente | 2 - Secretaria | Sair");
		int opcao = sc.nextInt();
		
		sc.nextLine();
		
		while(opcao != 3) {
			
			switch(opcao){
			case 1:
				Funcionario gerente = new Gerente();
				System.out.println("Digite o nome: ");
				gerente.setNome(sc.nextLine());
				
				System.out.println("Digite a idade: ");
				gerente.setIdade(sc.nextInt());
				sc.nextLine();
				
				System.out.println("Digite o gênero: ");
				gerente.setGenero(sc.nextLine());
				
				System.out.println("Digite o departamento: ");
				gerente.setDepartamento(sc.nextLine());
				
				System.out.println("Digite o salario: ");
				gerente.setSalario(sc.nextDouble());
				
				gerente.bonificacao(gerente.getSalario());
				
				System.out.println("Dados do funcionario: ");
				System.out.println(gerente);
				
				System.out.println("Para qual categoria de funcionario deseja cadastrar: 1 - Gerente | 2 - Secretaria | Sair");
				opcao = sc.nextInt();
				sc.nextLine();
				break;
			case 2:
				Secretaria secretaria = new Secretaria();
				System.out.println("Digite o nome: ");
				secretaria.setNome(sc.nextLine());
				
				System.out.println("Digite a idade: ");
				secretaria.setIdade(sc.nextInt());
				sc.nextLine();
				
				System.out.println("Digite o gênero: ");
				secretaria.setGenero(sc.nextLine());
				
				System.out.println("Digite o departamento: ");
				secretaria.setDepartamento(sc.nextLine());
				
				System.out.println("Digite o salario: ");
				secretaria.setSalario(sc.nextDouble());
				
				secretaria.bonificacao(secretaria.getSalario());
				
				System.out.println("Dados do funcionario: ");
				System.out.println(secretaria);
				
				System.out.println("Para qual categoria de funcionario deseja cadastrar: 1 - Gerente | 2 - Secretaria | Sair");
				opcao = sc.nextInt();
				sc.nextLine();
				break;
			case 3:
				break;
			default:
				System.out.println("Opção inválida.");
			}
		}
		System.out.println("encerrando o programa!");
		
		sc.close();
	}
}
