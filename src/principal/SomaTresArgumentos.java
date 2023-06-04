package principal;

import java.util.Scanner;

public class SomaTresArgumentos {

    // Método estático que recebe três argumentos do tipo int e retorna a soma desses três argumentos
    public static int somar(int a, int b, int c) {
        return a + b + c;
    }
    
    // Método principal para testar o método de soma
    public static void main(String[] args) {
        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);
        
        // Pedir ao usuário que digite três números inteiros
        System.out.println("Digite o primeiro número inteiro:");
        int a = sc.nextInt();
        System.out.println("Digite o segundo número inteiro:");
        int b = sc.nextInt();
        System.out.println("Digite o terceiro número inteiro:");
        int c = sc.nextInt();
        
        // Somar os três números usando o método somar
        int resultado = somar(a, b, c);
        
        // Imprimir o resultado na tela
        System.out.printf("A soma de %d, %d e %d é %d\n", a, b, c, resultado);
        
        // Fechar o objeto Scanner
        sc.close();
    }
}
