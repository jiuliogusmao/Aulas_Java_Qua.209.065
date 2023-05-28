package principal;

import java.util.Locale;
import java.util.Scanner;

public class MediaAlturaComWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.ENGLISH);
        double somaAlturas = 0;
        int contador = 0;

        System.out.println("Digite a altura de 5 pessoas:");

        while (contador < 5) {
            System.out.print("Altura da pessoa " + (contador + 1) + ": ");
            double altura = scanner.nextDouble();
            somaAlturas += altura;
            contador++;
        }

        double mediaAltura = somaAlturas / 5;
        System.out.println("A média das alturas é: " + mediaAltura);

        scanner.close();

	}

}
