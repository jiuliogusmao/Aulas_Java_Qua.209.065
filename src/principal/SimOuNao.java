package principal;

import java.util.Scanner;

public class SimOuNao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int contador = 0;

        System.out.println("Responda com 1 para sim e 0 para não.");

        while (true) {
            System.out.print("Você deseja entrar no bloco de código? ");
            int resposta = scanner.nextInt();

            if (resposta == 1) {
                contador++;
                System.out.println("Você entrou no bloco de código!");
            } else if (resposta == 0) {
                break;
            } else {
                System.out.println("Resposta inválida. Digite 1 para sim ou 0 para não.");
            }
        }

        System.out.println("O bloco de código foi executado " + contador + " vez(es).");

        scanner.close();

	}

}
