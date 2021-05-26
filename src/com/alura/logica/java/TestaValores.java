package com.alura.logica.java;

/* Aula 6�: Java JRE e JDK
 * 
 * Primeiros passos no Eclipse - Primeiros conceitos no JAVA.
 * Anota��es no fim da p�gina. 
*/

public class TestaValores {

	/*
	 * Tecla de atalho auto-complet, ao precioar ctrl + espa�o ele gera opi��es para
	 * completar automaticamente.
	 */

	public static void main(String[] args) {
		// Exemplifica��o da ordem das variaveis

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
