package principal.CalculaTerreno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a largura do terreno em metros: ");
        double largura = sc.nextDouble();

        System.out.print("Digite o comprimento do terreno em metros: ");
        double comprimento = sc.nextDouble();

        AreaTerreno terreno = new AreaTerreno(largura, comprimento);
        double area = terreno.retornaArea();

        System.out.println("A área do terreno é: " + area + " metros quadrados.");

        sc.close();
    }
}
