package principal;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		
		int opcao = random.nextInt(7) + 1;
		
		switch (opcao) {
		case 1:
			System.out.println("Domingo.");
			break;
		case 2:
			System.out.println("Segunda.");
			break;
		case 3:
			System.out.println("Terça.");
			break;
		case 4:
			System.out.println("Quarta.");
			break;
		case 5:
			System.out.println("Quinta.");
			break;
		case 6:
			System.out.println("Sexta.");
			break;
		case 7:
			System.out.println("sábado.");
			break;

		default:
			System.out.println("Não corresponde à um dia da semana.");
			break;
		}

	}

}
