package com.alura.logica.java;

/* Aula 8� : Java JRE e JDK
 * 
 * Primeiros passos no Eclipse - Primeiros conceitos no JAVA.
 * Anota��es no fim da p�gina. 
*/

public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");

		int idade = 66;
		boolean idoso = idade >= 65; // s� aceita true ou false. Pode ser declarado dessa forma tamb�m.
		int quantidadeIdoso = 25;

		if ((idoso) && (quantidadeIdoso >= 25)) {
			System.out.println("Tem passeio de barco hoje.");

		} else {
			System.out.println("N�o teremos passeio no barco");
		}

		if ((idade >= 65) || (idoso)) { // e: && - ou: ||
			System.out.println("Voc� viveu muito anos, parab�ns.");
		}
	}
}