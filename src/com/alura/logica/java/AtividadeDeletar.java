package com.alura.logica.java;

/* Aula: Java JRE e JDK
 * 
 * Primeiros passos no Eclipse - Primeiros conceitos no JAVA.
 * Anotações no fim da página. 
 * 
 * Laço do tipo for para imprimir todos os múltiplos de 3, entre 1 e 100.
*/

public class AtividadeDeletar {

	public static void main(String[] args) {

		int soma3 = 3;
		int multiplicador = 0;

		for (int contador = 0; contador <= 100; contador++) {

			System.out.println("Multiplicado de 3: " + multiplicador);
			multiplicador = multiplicador + soma3;

			/*
			 * A abordagem que utiliza o resto da divisão é:
			 * 
			 * ~~ RESOLUÇÂO PROFESSOR class MultiplosDeTresAteCem { public static void main
			 * 
			 * (String[] args) {
			 * 
			 * for (int i = 1; i < 100; i++ ){
			 *
			 * if (i % 3 == 0) {
			 * 
			 * System.out.println(i); } } } }
			 */

			/*
			 * ou, entre outras tantas opções, a mais simples: class MultiplosDeTresAteCem {
			 * 
			 * public static void main (String[] args) {
			 * 
			 * for (int i = 3; i < 100; i += 3 ){
			 * 
			 * System.out.println(i); } } }
			 */
		}
	}
}