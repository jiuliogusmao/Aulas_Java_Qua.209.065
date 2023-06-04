package principal.Funcionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o cargo do funcionário: ");
        String cargo = scanner.nextLine();

        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();

        scanner.close();

        Funcionario funcionario = new Funcionario(nome, cargo, salario);
        funcionario.verificarBonus();
        funcionario.mostrarDados();
    }   
}
