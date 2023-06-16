package principal;

import java.util.Scanner;

import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		  ContaPoupanca contaPoupanca = new ContaPoupanca();
		  
		  System.out.print("Entre com o titular da conta: ");
		  contaPoupanca.setNomeTitular(sc.nextLine());
		  
		  System.out.print("Entre com o número da conta: ");
		  contaPoupanca.setNumeroConta(sc.nextInt());
		  
		  System.out.print("Entre com a agencia: "); contaPoupanca.setAgencia(sc.nextInt());
		  
		  System.out.print("Entre com o valor do depósito: ");
		  contaPoupanca.depositar(sc.nextDouble());
		  
		  System.out.println("Dados da conta: "); System.out.println(contaPoupanca);
		  
		  System.out.print("Entre com o valor do saque: ");
		  contaPoupanca.sacar(sc.nextDouble());
		  
		  System.out.println("Dados da conta: "); System.out.println(contaPoupanca);
		  
		  sc.close();
		 
	}

}
