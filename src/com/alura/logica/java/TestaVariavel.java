package com.alura.logica.java;

/* Aula 2º: Java JRE e JDK
 * 
 * Primeiros passos no Eclipse - Primeiros conceitos no JAVA.
 * Anotações no fim da página. 
*/

public class TestaVariavel {

	public static void main(String[] args) {
		System.out.println("Ok já imprimimos o famoso *Olá, mundo!*");
		System.out.println("Agora vamos ver as VAR no JAVA");

		// int para números inteiros e sem virgula Ex:
		int brunaIdade;
		brunaIdade = 31;

		// Usamos o sinal de + para soma e para concatenação.
		System.out.println("A idade da Bruna é " + brunaIdade);

		// Treinando a sintaxe e operadores MTM
		int orlandoIdade;
		orlandoIdade = 50;

		System.out.println("A idade do Orlando é " + orlandoIdade);

		int totalIdades;
		totalIdades = brunaIdade + orlandoIdade;

		System.out.println("A soma das nossas idades é " + totalIdades);

		int dobroIdades;
		dobroIdades = totalIdades * 2;

		System.out.println("O dobro das nossas idades é " + dobroIdades);

		int idadeMenosIdade;
		idadeMenosIdade = orlandoIdade - brunaIdade;

		System.out.println("Minha idade menos a idade de Orlando é " + idadeMenosIdade);
		System.out.println(
				"Ok, também podemos dividir ( / ) e multiplicar ( * ), mas agora vamos finalizar o programa. Parabéns ");
	}
}
