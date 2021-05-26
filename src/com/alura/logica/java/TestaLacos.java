package com.alura.logica.java;

/* Aula 13º: Java JRE e JDK
 * 
 * Primeiros passos no Eclipse - Primeiros conceitos no JAVA.
 * Anotações no fim da página. 
*/

public class TestaLacos {

	public static void main(String[] args) {

		for (int mutiplicador = 1; mutiplicador <= 10; mutiplicador++) {
			System.out.println("Taboada do " + mutiplicador);

			for (int contador = 0; contador <= 10; contador++) {
				System.out.print(mutiplicador * contador);
				System.out.print(" ");

			}
			System.out.println();
			System.out.println();
		}

		for (int linha = 1; linha <= 5; linha++) {
			for (int coluna = 1; coluna <= linha; coluna++) { // podemos colocar qualquer condição boolean
				System.out.print(" * ");

			}
			System.out.println();
			System.out.println();

		}

		for (int linha1 = 1; linha1 <= 5; linha1++) {
			for (int coluna1 = 1; coluna1 <= 5; coluna1++) { // podemos colocar qualquer condição boolean
				if (linha1 <= coluna1) {
					System.out.print(" * ");

				}
			}
			System.out.println();
		}
	}
}
