package principal;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tipo de operação (1: soma, 2: divisão, 3: multiplicação, 4: subtração): ");
        int tipoOperacao = scanner.nextInt();

        System.out.print("Digite o número para gerar a tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada do " + numero + ":");

        switch (tipoOperacao) {
            case 1:
                for (int i = 1; i <= 10; i++) {
                    int resultado = numero + i;
                    System.out.println(numero + " + " + i + " = " + resultado);
                }
                break;
            case 2:
                for (int i = 1; i <= 10; i++) {
                    int resultado = numero / i;
                    System.out.println(numero + " / " + i + " = " + resultado);
                }
                break;
            case 3:
                for (int i = 1; i <= 10; i++) {
                    int resultado = numero * i;
                    System.out.println(numero + " * " + i + " = " + resultado);
                }
                break;
            case 4:
                for (int i = 1; i <= 10; i++) {
                    int resultado = numero - i;
                    System.out.println(numero + " - " + i + " = " + resultado);
                }
                break;
            default:
                System.out.println("Operação inválida!");
                break;
        }

        scanner.close();

	}

}
