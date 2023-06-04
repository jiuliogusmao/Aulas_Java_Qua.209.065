package principal;

import java.util.Locale;
import java.util.Scanner;

public class CalculaLucro {
    
    public static double calcularPrecoVenda(double valorDoProduto, double lucroProduto) {
        double lucro = valorDoProduto * (lucroProduto/100);
        double precoVenda = valorDoProduto + lucro;
        return precoVenda;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
         
        System.out.println("Digite o valor do produto: ");
        double valorDoProduto = sc.nextDouble();
        
        System.out.println("Digite a porcentagem de lucro: ");
        double lucroProduto =sc.nextDouble();
        
        double precoVenda = calcularPrecoVenda(valorDoProduto, lucroProduto);
        System.out.println("Preço de venda: R$" + precoVenda);
    }
    
}
