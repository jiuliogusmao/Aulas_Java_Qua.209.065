package principal;

import java.util.Locale;
import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.ENGLISH);

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        double[] notas = new double[4];
        double somaNotas = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do " + (i + 1) + "º bimestre: ");
            notas[i] = scanner.nextDouble();
            somaNotas += notas[i];
        }

        double media = somaNotas / notas.length;
        System.out.println("Média do aluno " + nomeAluno + ": " + media);

        scanner.close();

	}

}
