package com.alura.logica.java;

/* Aula 14�: Java JRE e JDK
 * 
 * Primeiros passos no Eclipse - Primeiros conceitos no JAVA.
 * Anota��es no fim da p�gina. 
 * RESPOSTA DO PROFESSOR
*/

public class AtividadeFatoriais {

	public static void main(String[] args) {
		int fatorial = 1;

		for (int contador = 1; contador < 11; contador++) {

			fatorial = fatorial * contador;
			System.out.println("Fatorial de " + contador + " = " + fatorial);
		}
	}
}