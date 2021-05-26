package com.alura.logica.java;

/* Aula 5º: Java JRE e JDK
 * 
 * Primeiros passos no Eclipse - Primeiros conceitos no JAVA.
 * Anotações no fim da página. 
*/

public class TestaCaracteres {

	// VAR do char: Aceita somente uma unica letra. Usa aspas simples '
	// VAR do tipo String: Achei palavras ou frases. Usa aspas duplas "

	public static void main(String[] args) {

		char letra = 'a';
		char letra2 = 'b';

		// Essa VAR também asseita o código da letra ex:
		char codigo = 65;
		char codigo2 = 66;

		System.out.println("Vamos ver como ele sera imprimido na tela:");
		System.out.println("letra = a: " + letra);
		System.out.println("letra = b: " + letra2);
		System.out.println("letra = a: " + codigo);
		System.out.println("letra = b: " + codigo2);

		String palavra = "Bom dia.";
		String frase = "Estamos quase no fim deste curso, continue assim.";
		System.out.println(palavra);
		System.out.println(frase);

		// podemos concatenar uma string a um int ou double.
		int numeroQualquer = 500;
		String viajem = "Minha viajem custou: ";
		System.out.println(viajem + numeroQualquer);
	}
}
