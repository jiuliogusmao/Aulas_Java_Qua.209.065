package principal;

public class NumerosImpares {

	public static void main(String[] args) {
		  int soma = 0;

	        System.out.println("Números ímpares abaixo:");
	        for (int i = 1; i <= 25; i += 2) {
	            System.out.println(i);
	            soma += i;
	        }

	        System.out.println("Soma dos números ímpares: " + soma);

	        System.out.println("\nNúmeros ímpares ao lado:");
	        for (int i = 1; i <= 25; i += 2) {
	            System.out.print(i + " ");
	            soma += i;
	        }

	}

}
