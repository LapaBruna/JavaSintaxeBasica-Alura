package com.alura.logica.java;

/* Aula 8º : Java JRE e JDK
 * 
 * Primeiros passos no Eclipse - Primeiros conceitos no JAVA.
 * Anotações no fim da página. 
*/

public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");

		int idade = 66;
		boolean idoso = idade >= 65; // só aceita true ou false. Pode ser declarado dessa forma também.
		int quantidadeIdoso = 25;

		if ((idoso) && (quantidadeIdoso >= 25)) {
			System.out.println("Tem passeio de barco hoje.");

		} else {
			System.out.println("Não teremos passeio no barco");
		}

		if ((idade >= 65) || (idoso)) { // e: && - ou: ||
			System.out.println("Você viveu muito anos, parabéns.");
		}
	}
}