package com.alura.logica.java;

/* Aula 2�: Java JRE e JDK
 * 
 * Primeiros passos no Eclipse - Primeiros conceitos no JAVA.
 * Anota��es no fim da p�gina. 
*/

public class TestaVariavel {

	public static void main(String[] args) {
		System.out.println("Ok j� imprimimos o famoso *Ol�, mundo!*");
		System.out.println("Agora vamos ver as VAR no JAVA");

		// int para n�meros inteiros e sem virgula Ex:
		int brunaIdade;
		brunaIdade = 31;

		// Usamos o sinal de + para soma e para concatena��o.
		System.out.println("A idade da Bruna � " + brunaIdade);

		// Treinando a sintaxe e operadores MTM
		int orlandoIdade;
		orlandoIdade = 50;

		System.out.println("A idade do Orlando � " + orlandoIdade);

		int totalIdades;
		totalIdades = brunaIdade + orlandoIdade;

		System.out.println("A soma das nossas idades � " + totalIdades);

		int dobroIdades;
		dobroIdades = totalIdades * 2;

		System.out.println("O dobro das nossas idades � " + dobroIdades);

		int idadeMenosIdade;
		idadeMenosIdade = orlandoIdade - brunaIdade;

		System.out.println("Minha idade menos a idade de Orlando � " + idadeMenosIdade);
		System.out.println(
				"Ok, tamb�m podemos dividir ( / ) e multiplicar ( * ), mas agora vamos finalizar o programa. Parab�ns ");
	}
}
