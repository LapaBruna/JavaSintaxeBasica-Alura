package com.alura.logica.java;

/* Aula 7�: Java JRE e JDK
 * 
 * Primeiros passos no Eclipse - Primeiros conceitos no JAVA.
 * Anota��es no fim da p�gina. 
*/

public class TestaCondicional {

	public static void main(String[] args) {
		int suaIdade = 16;
		int acompanhanteMaior = 1;
		int idadeAcompanhanteMaior = 40;

		// sysout + ctrl + espa�o para auto completar o codigo.
		System.out.println("Voc� tem " + suaIdade);

		// atalho de identa��o ctrl + shift +f ou source -> format
		if (suaIdade >= 18) {
			System.out.println("Voc� pode entrar por que � maior de idade.");
			System.out.println("Parab�ns.");

		} else if ((acompanhanteMaior >= 1) && (idadeAcompanhanteMaior >= 18)) {
			System.out.println("Voc� esta acompanhado de algu�m maior de idade, voc� pode entrar.");
			System.out.println("Parab�ns.");

		} else {
			System.out.println("Voc� n�o pode entrar, desculpa.");
			
		}

		System.out.println("Exemplifica��o de frase longa e identa��o recomendada pelo eclipse, esta frase tem "
				+ "que passar a tela de trabalho para funcionar. Passou? OLha a magica. ");
		// Ao dar enter o proprio eclipse concatena essa STRING.
	}
}
