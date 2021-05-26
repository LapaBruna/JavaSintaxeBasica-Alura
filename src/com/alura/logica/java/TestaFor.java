package com.alura.logica.java;

/* Aula 12�: Java JRE e JDK
 * 
 * Primeiros passos no Eclipse - Primeiros conceitos no JAVA.
 * Anota��es no fim da p�gina. 
*/

public class TestaFor {

	public static void main(String[] args) {
		int idade = 31;
		int ano = 2020;

		for (int contador = 0; contador <= 10; contador++) { 
			// int cont: esta declarando no corpo do FOR e morre no FOR
			
			System.out.println("Contador: " + contador);

		}

		for (int contador = 0; contador <= 3; contador++) { 
			// Usando dois FOR com a mesma VAR pois ela morre nolooping.
			
			idade++;
			ano++;
			System.out.println("A idade �: " + idade + ". O ano �: " + ano);
		}
	}
}
