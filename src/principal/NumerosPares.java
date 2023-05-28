package principal;

import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[50];

        System.out.println("Digite os 50 números:");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Números pares e suas posições:");

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println("Número par: " + numeros[i] + ", Posição: " + i);
            }
        }

        scanner.close();

	}

}
