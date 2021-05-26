package com.alura.logica.java;

/* Aula 9º: Java JRE e JDK
 * 
 * Primeiros passos no Eclipse - Primeiros conceitos no JAVA.
 * Anotações no fim da página. 
*/

public class TestaEscopo {

	public static void main(String[] args) {
		System.out.println("testando condicionais");

		/*
		 * ~~Forma incorreta.
		 * 
		 * int idade = 20; int quantidadePessoas = 3; //boolean acompanhado = true; <-
		 * não esta declarado
		 * 
		 * if (quantidadePessoas >= 2) { <- declara boolean acompanhado = true; <- fecha
		 * }else { <- declara boolean acompanhado = false;<- fecha }
		 * 
		 * if (idade >=18 || acompanhado){ <- não esta declarado
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