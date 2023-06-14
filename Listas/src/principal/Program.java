package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> nomes = new ArrayList<>();
		
		//Adiciona dados na lista
		nomes.add("Pedrinho");
		nomes.add("Man�zinho");
		nomes.add("Jiulio");
		nomes.add("Jo�ozinho");
		
		//mostra os dados da lista
		for (String nome : nomes) {
			System.out.println("Nome: " + nome);
		}		
		System.out.println(nomes.get(3));
		
		//remove os dados da lista
		nomes.remove(2);
		for (String nome : nomes) {
			System.out.println("Nome: " + nome);
		}	
		
		//obtem os dados da lista por �ndice (posi��o na mem�ria)
		System.out.println(nomes.get(1));

		String dado = nomes.stream().filter(n -> n == "Jiulio").findFirst().orElse(null);
		System.out.println(dado);
		
		Collections.sort(nomes);
		System.out.println("Imprimindo em ordem alfab�tica.");
		for (String nome : nomes) { //para cada nome CONTIDO em nomes fa�a...
			System.out.println("nome: " + nome);
		}
	}
	

}
