package principal;

import java.util.Scanner;

public class ConversorDeMoedas {

    // Atributo estático e final para armazenar o câmbio atual do dólar em relação ao real
    public static final double CAMBIO = 4.96;
    
    // Método estático que recebe um valor em real e retorna o valor em dólares
    public static double realParaDolar(double real) {
        return real / CAMBIO;
    }
    
    // Método estático que recebe um valor em dólares e retorna o valor em reais
    public static double dolarParaReal(double dolar) {
        return dolar * CAMBIO;
    }
    
    // Método principal para testar os métodos de conversão
    public static void main(String[] args) {
        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);
        
        // Pedir ao usuário que digite um valor em real
        System.out.println("Digite um valor em real:");
        double real = sc.nextDouble();
        
        // Converter o valor em dólares usando o método realParaDolar
        double dolar = realParaDolar(real);
        
        // Imprimir o resultado na tela
        System.out.printf("%.2f reais equivalem a %.2f dólares\n", real, dolar);
        
        // Pedir ao usuário que digite um valor em dólares
        System.out.println("Digite um valor em dólares:");
        dolar = sc.nextDouble();
        
        // Converter o valor em reais usando o método dolarParaReal
        real = dolarParaReal(dolar);
        
        // Imprimir o resultado na tela
        System.out.printf("%.2f dólares equivalem a %.2f reais\n", dolar, real);
        
        // Fechar o objeto Scanner
        sc.close();
    }
}
