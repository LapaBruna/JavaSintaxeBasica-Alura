package com.alura.logica.java;

/* Aula 9�: Java JRE e JDK
 * 
 * Primeiros passos no Eclipse - Primeiros conceitos no JAVA.
 * Anota��es no fim da p�gina. 
*/

public class TestaEscopo {

	public static void main(String[] args) {
		System.out.println("testando condicionais");

		/*
		 * ~~Forma incorreta.
		 * 
		 * int idade = 20; int quantidadePessoas = 3; //boolean acompanhado = true; <-
		 * n�o esta declarado
		 * 
		 * if (quantidadePessoas >= 2) { <- declara boolean acompanhado = true; <- fecha
		 * }else { <- declara boolean acompanhado = false;<- fecha }
		 * 
		 * if (idade >=18 || acompanhado){ <- n�o esta declarado
		 * 
		 * System.out.println("Seja bem vindo"); } else {
		 * System.out.println("infelizmente voce nao pode entrar"); }
		 * 
		 * Forma correta seria:
		 */

		System.out.println("testando condicionais");

		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado; // <----------Declarada

		if (quantidadePessoas >= 2) {
			acompanhado = true;

		} else {
			acompanhado = false;
		}

		if (idade >= 18 || acompanhado) { // <----------Compila
			System.out.println("Seja bem vindo");

		} else {
			System.out.println("infelizmente voce nao pode entrar");
		}
	}
}