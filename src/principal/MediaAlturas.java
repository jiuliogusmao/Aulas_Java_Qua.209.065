package principal;

import java.util.Locale;
import java.util.Scanner;

public class MediaAlturas {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 scanner.useLocale(Locale.ENGLISH);
	        double somaAlturas = 0;

	        System.out.println("Digite a altura de 5 pessoas:");

	        for (int i = 1; i <= 5; i++) {
	            System.out.print("Altura da pessoa " + i + ": ");
	            double altura = scanner.nextDouble();
	            somaAlturas += altura;
	        }

	        double mediaAltura = somaAlturas / 5;
	        System.out.println("A média das alturas é: " + mediaAltura);

	        scanner.close();

	}

}
