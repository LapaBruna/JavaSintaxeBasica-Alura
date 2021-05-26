package com.alura.logica.java;

/* Aula 7º: Java JRE e JDK
 * 
 * Primeiros passos no Eclipse - Primeiros conceitos no JAVA.
 * Anotações no fim da página. 
*/

public class TestaCondicional {

	public static void main(String[] args) {
		int suaIdade = 16;
		int acompanhanteMaior = 1;
		int idadeAcompanhanteMaior = 40;

		// sysout + ctrl + espaço para auto completar o codigo.
		System.out.println("Você tem " + suaIdade);

		// atalho de identação ctrl + shift +f ou source -> format
		if (suaIdade >= 18) {
			System.out.println("Você pode entrar por que é maior de idade.");
			System.out.println("Parabéns.");

		} else if ((acompanhanteMaior >= 1) && (idadeAcompanhanteMaior >= 18)) {
			System.out.println("Você esta acompanhado de alguém maior de idade, você pode entrar.");
			System.out.println("Parabéns.");

		} else {
			System.out.println("Você não pode entrar, desculpa.");
			
		}

		System.out.println("Exemplificação de frase longa e identação recomendada pelo eclipse, esta frase tem "
				+ "que passar a tela de trabalho para funcionar. Passou? OLha a magica. ");
		// Ao dar enter o proprio eclipse concatena essa STRING.
	}
}
