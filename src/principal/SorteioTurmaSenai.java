package principal;

import java.util.Random;
import java.util.Scanner;

public class SorteioTurmaSenai {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] pessoas = new String[10];

        System.out.println("Cadastro de participantes:");

        for (int i = 0; i < pessoas.length; i++) {
            System.out.print("Digite o nome do participante " + (i + 1) + ": ");
            pessoas[i] = scanner.nextLine();
        }

        int indiceGanhador = random.nextInt(pessoas.length);
        String ganhador = pessoas[indiceGanhador];

        System.out.println("O ganhador para a próxima turma de Java do SENAI é: " + ganhador);

        scanner.close();

	}

}
