package principal;

import java.util.Random;

public class JogoDados {

	public static void main(String[] args) {
		// Gerar números aleatórios para os dados
		Random random = new Random();
		int dado1 = random.nextInt(6) + 1; // Números entre 1 e 6
		int dado2 = random.nextInt(6) + 1;
		int dado3 = random.nextInt(6) + 1;

		// Calcular a soma dos números
		int soma = dado1 + dado2 + dado3;

		// Mostrar os números dos dados e a soma
		System.out.println("Dado 1: " + dado1);
		System.out.println("Dado 2: " + dado2);
		System.out.println("Dado 3: " + dado3);
		System.out.println("Soma: " + soma);

		// Verificar as condições de bônus e vitória/derrota
		int bonus = 0;
		if (dado1 == dado2 && dado1 == dado3) {
			bonus = 6;
			System.out.println("Você é muito sortudo!");
		} else if (dado1 == dado2 || dado1 == dado3 || dado2 == dado3) {
			bonus = 2;
		}
		int total = soma + bonus;
		System.out.println("Bônus: " + bonus);
		System.out.println("Total: " + total);

		if (total >= 15) {
			System.out.println("Parabéns, você ganhou!");
		} else {
			System.out.println("Lamento, mas você perdeu.");
		}

	}

}
