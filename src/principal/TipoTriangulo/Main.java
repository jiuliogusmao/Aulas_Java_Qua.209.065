package principal.TipoTriangulo;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do primeiro lado: ");
        double lado1 = sc.nextDouble();

        System.out.print("Digite o valor do segundo lado: ");
        double lado2 = sc.nextDouble();

        System.out.print("Digite o valor do terceiro lado: ");
        double lado3 = sc.nextDouble();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        String tipoTriangulo = triangulo.calcularTipoTriangulo();

        System.out.println("O triângulo é do tipo: " + tipoTriangulo);

        sc.close();
     }
}
