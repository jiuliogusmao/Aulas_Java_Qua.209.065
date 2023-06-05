package principal.Funcionario;

class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void verificarBonus() {
        if (cargo.equalsIgnoreCase("gerente") && salario < 5000) {
            double bonus = salario * 0.015;
            salario += bonus;
        } else if (cargo.equalsIgnoreCase("vendedor") && salario < 1500) {
            double bonus = salario * 0.02;
            salario += bonus;
        }
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário Bruto: R$" + salario);
    }
}


