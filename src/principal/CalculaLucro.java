package principal;

import java.util.Locale;
import java.util.Scanner;

public class CalculaLucro {
    //Método que recebe dois parâmetros do tipo int e retorna o valor da vendo do produto
    // com a porcentagem de venda aplicada

    public static double calcularPrecoVenda(double valorDoProduto, double lucroProduto) {
        double lucro = valorDoProduto * (lucroProduto/100);
        double precoVenda = valorDoProduto + lucro;
        return precoVenda;
    }
    public static void main(String[] args) {
        // Cria um objeto Scanner para receber a entrada do usuário
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        
        //Pedir ao usuário para inserir o valor do produto e a porcentagem de lucro
        System.out.println("Digite o valor do produto: ");
        double valorDoProduto = sc.nextDouble();
        
        System.out.println("Digite a porcentagem de lucro: ");
        double lucroProduto =sc.nextDouble();
        
        //Imprimir o resultado na tela
        double precoVenda = calcularPrecoVenda(valorDoProduto, lucroProduto);
        System.out.println("Preço de venda: R$" + precoVenda);

        //Fecha o Scanner
        sc.close();
    }
    
}
