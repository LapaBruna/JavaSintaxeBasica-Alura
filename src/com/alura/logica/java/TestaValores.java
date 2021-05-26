package com.alura.logica.java;

/* Aula 6º: Java JRE e JDK
 * 
 * Primeiros passos no Eclipse - Primeiros conceitos no JAVA.
 * Anotações no fim da página. 
*/

public class TestaValores {

	/*
	 * Tecla de atalho auto-complet, ao precioar ctrl + espaço ele gera opições para
	 * completar automaticamente.
	 */

	public static void main(String[] args) {
		// Exemplificação da ordem das variaveis

		int primeiro = 5;
		int segundo = 7;

		System.out.println(segundo);

		primeiro = 5;
		segundo = 7;
		segundo = primeiro;

		System.out.println(segundo);

		primeiro = 5;
		segundo = 7;
		segundo = primeiro;
		primeiro = 10;

		System.out.println(segundo);
	}
}
